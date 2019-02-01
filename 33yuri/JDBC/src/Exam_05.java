import java.sql.*;
import java.util.*;

public class Exam_05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try { // 드라이버 로드, 자바: 아 이사람은 sql이건 오라클이건 뭘 연결할려고 하는구낭
			Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("드라이버 검색성공");
		} catch (ClassNotFoundException e) {
			System.err.println("error = " + e);
			System.exit(1); // 0은 정상종료 1은 비정상종료
		}
		
		Connection conn = null;					//DB연결된 상태(세션)을 담은 객체
		PreparedStatement pstmt = null;			//동적쿼리
		Statement stmt = null;					//정적쿼리
		String url = "jdbc:mysql://localhost:3306/java";
		String id = "root";
		String pass = "1234";
		String query = null;

		try {
			conn = DriverManager.getConnection(url, id, pass);
		} catch (SQLException e) {
			System.err.println("sql error = " + e);
			System.exit(1);
		}

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1.친구추가 2.주민번호로검색 3.전체출력 4.종료 5.삭제 6.전체삭제 7.수정>>");
			int ADD_FREIND = 1; 	// 뭐.. 굳이 대문자로 쓸 필요는 없다 대문자는 전역변수용이랄까
			int SEARCH_BY_RESIDENTNUMBER = 2;
			int SHOW_ALL = 3;
			int END = 4;
			int MENU_NUMBER = sc.nextInt();
			if (MENU_NUMBER == ADD_FREIND) {
				System.out.print("이름 > ");
				String name = sc.next();
				System.out.print("주민번호 > ");
				String jumin = sc.next();
				query = "insert into friend values (null, ?, ?)";
				try {
					pstmt = conn.prepareStatement(query);
					pstmt.setString(1, name);
					pstmt.setString(2, jumin);
					pstmt.executeUpdate();		//적용된 행의 갯수를 얻기 위한 메소드, DDL DML에 사용된다
					pstmt.close();
					System.out.println("등록 완료되었습니다");
				} catch (SQLException e) {
					System.err.println("sql error = " + e);
				}
			} else if (MENU_NUMBER == SEARCH_BY_RESIDENTNUMBER) {
				System.out.println("주민번호를 입력하시오");
				String jumin = sc.next();
				query = "select * from friend where jumin = ? ";
				try {
					pstmt = conn.prepareStatement(query);
					pstmt.setString(1, jumin);
					ResultSet rs = pstmt.executeQuery(); // rs객체에는 셀렉트쿼리 결과의 레코드들이 담겨있다 
					/*executeQuery(): ResultSet을 얻기 위한 메소드 주로 select문이 여기에 해당된다*/
					if (rs.next()) {
						System.out.println("찾는 친구의 번호> " + rs.getInt("num"));
						System.out.println("찾는 친구의 이름> " + rs.getString("name"));
					} else
						System.out.println("찾는 친구는 등록되어 있지 않습니다");
					rs.close();
					pstmt.close(); // 쿼리문을 닫는다
				} catch (SQLException e) {
					System.err.println("sql error = " + e);
				}
			} else if (MENU_NUMBER == SHOW_ALL) {
				query = "select * from friend";
				try {
					stmt = conn.createStatement(); // 셀렉트니까 스테이트먼트 쓰자

					ResultSet rs = stmt.executeQuery(query);
					System.out.println("번호   이름   주민번호");
					while (rs.next()) {
						int num1 = rs.getInt("num");
						String name1 = rs.getString("name");
						String jumin1 = rs.getString("jumin");
						System.out.println("번호  " + num1 + "이름  " + name1 + "주민번호  " + jumin1);
					}
					rs.close();
					stmt.close();
				} catch (SQLException e) {
					System.out.println("sql error = " + e);
				}
			}else if(MENU_NUMBER == END) {
				System.out.println("종료합니다");
				try {
					conn.close();
				}catch(SQLException e) {}
				System.exit(0);
			}
			else if(MENU_NUMBER == 5) {						//튜플 삭제
				System.out.print("주민번호를 입력하시오>> ");
				query = "delete from friend where jumin = ?";
				String del_jumin = sc.next();
				try {
					pstmt = conn.prepareStatement(query);
					pstmt.setString(1, del_jumin);
					pstmt.executeUpdate();
					pstmt.close();
					System.out.println("삭제완료");
				} catch(SQLException e) {
					System.out.println("sql error = " + e);
				}
			}
			else if(MENU_NUMBER == 6) {						//테이블 내의 모든 튜플 삭제
				System.out.print("모든자료를 지우시겠습니까? y/n");
				String qw = sc.next();
				if(qw.equals("Y") || qw.equals("y"))
				{
					query = "delete from friend";
					try {
						pstmt = conn.prepareStatement(query);
						pstmt.executeUpdate();
						pstmt.close();
						System.out.println("삭제완료");
					} catch(SQLException e) {
						System.out.println("sql error = " + e);
					}
				}
				else if(qw.equals("N")||qw.equals("n"))
					System.exit(0);
			}
			else if(MENU_NUMBER == 7) {
				System.out.println("이름을 수정하려면 주민번호를 입력하시오 >> ");
				String input_jumin = sc.next();
				System.out.println("새이름을 적으세요");
				String new_name = sc.next();			//  sc.next의 순서를 잘 배열해야함 막 놨더니 수정된게 적용 안됐더라구...
				query = "update friend set name = ? where jumin = ?";
				
				try {
					pstmt = conn.prepareStatement(query);
					pstmt.setString(1, new_name);			//수정할내용
					pstmt.setString(2, input_jumin);		//수정할대상 굳이 if문써서 jumin == input_jumin을 할필요는 없는것 같다
					pstmt.executeUpdate();
					System.out.println("수정완료");
				}catch(SQLException e) {
					System.out.println("sql error = " + e);
				}
			}else
				System.out.println("번호를 잘못 입력하였습니다");
		}
	}
}
