package TeskForFri;
//20190201

import java.sql.*;
import java.util.*;

public class Score {

	public static void main(String[] args) {
		try { 											// 드라이버 로드
			Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("드라이버 검색성공");
		} catch (ClassNotFoundException e) {
			System.err.println("error = " + e);
			System.exit(1); 							// 0은 정상종료 1은 비정상종료
		}
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		String url = "jdbc:mysql://localhost:3306/java";
		String id = "root";
		String pass = "1234";
		String query = null;
		
		try {
			conn = DriverManager.getConnection(url,id,pass);
		}catch(SQLException e) {
			System.err.println("sql = " + e);
			System.exit(1);								//비정상 종료
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.성적입력 2.성적전체출력 3.이름검색출력 4.성적수정 5.성적삭제 6.종료>>");
			int Menu_Num = sc.nextInt();
			
			if(Menu_Num == Operation.INPUT_SCORE) {
				System.out.print("이름 >>");
				String name = sc.next();
				System.out.print("국어점수 >>");
				int Korean = sc.nextInt();
				System.out.print("영어점수 >>");
				int English = sc.nextInt();
				System.out.print("수학점수 >>");
				int math = sc.nextInt();
				query = "insert into score values(null,?,?,?,?)";
				try {
					pstmt = conn.prepareStatement(query);
					pstmt.setString(1, name);
					pstmt.setInt(2, Korean);
					pstmt.setInt(3, English);
					pstmt.setInt(4, math);
					pstmt.executeUpdate();
					pstmt.close();
					System.out.println("등록완료");
				}catch(SQLException e) {
					System.err.println("sql = " + e);
				}
			}
			
			else if(Menu_Num == Operation.SHOW_ALL_SCORE) {
				query = "select * from score";
				try {
					stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(query);
					System.out.println("번호    이름    국어   영어   수학   평균");
					while(rs.next()) {
						int num = rs.getInt("num");
						String name = rs.getString("name");
						int Korean = rs.getInt("korean");
						int English = rs.getInt("English");
						int math = rs.getInt("math");
						int average = (Korean + English + math) / 3;
						System.out.println(num + "   " + name + "    " + Korean+ "     " + English + "    " + math + "   " + average);
					}
					rs.close();
					stmt.close();
				}catch(SQLException e) {
					System.err.println("sql = " + e);
				}
			}
			
			else if(Menu_Num == Operation.SEARCH_BY_NAME) {
				System.out.println("성적을 검색하고자하는 학생이름을 입력>> ");
				String name = sc.next();
				query = "select * from score where name = ?";
				try {
					pstmt = conn.prepareStatement(query);
					pstmt.setString(1, name);
					ResultSet rs = pstmt.executeQuery();
					if(rs.next()) {
						System.out.println("찾고자하는 학생의 이름 국어 영어 수학");
						System.out.println(rs.getString("name") + "  " + rs.getInt("korean") + "  " + rs.getInt("English") + "  " + rs.getInt("math"));
					}else
						System.out.println("없는 학생입니다");
					rs.close();
					pstmt.close();
				}catch(SQLException e) {
					System.err.println("sql = " + e);
				}
			}
			
			else if(Menu_Num == Operation.MODIFY_SCORE) {
				int choose_Koean = 1;
				int choose_Enghlish = 2;
				int choose_math = 3;
				int choose_all = 4;
				
				System.out.println("성적을 수정하고자하는 학생이름을 입력하세요>> ");
				String student_modify = sc.next();
				System.out.println("수정하고자 하는 과목은? 1.국어 2.영어 3.수학");
				int input_num = sc.nextInt();
				
				if(input_num == choose_Koean) {
					System.out.println("새 국어점수를 적으세요");
					int modified_Koean = sc.nextInt();
					query = "update score set korean = ? where name = ?";
					
					try {
						pstmt = conn.prepareStatement(query);
						pstmt.setInt(1, modified_Koean);
						pstmt.setString(2, student_modify);
						pstmt.executeUpdate();
						System.out.println("수정완료");
					}catch(SQLException e) {
						System.err.println("sql = " + e);
					}
				}
				else if(input_num == choose_Enghlish){
					System.out.println("새 영어점수를 적으세요");
					int modified_English = sc.nextInt();
					query = "update score set English= ? where name = ?";
					
					try {
						pstmt = conn.prepareStatement(query);
						pstmt.setInt(1, modified_English);
						pstmt.setString(2, student_modify);
						pstmt.executeUpdate();
						System.out.println("수정완료");
					}catch(SQLException e) {
						System.err.println("sql = " + e);
					}
				}
				else if(input_num == choose_math){
					System.out.println("새 수학점수를 적으세요");
					int modified_math = sc.nextInt();
					query = "update score set math= ? where name = ?";
					
					try {
						pstmt = conn.prepareStatement(query);
						pstmt.setInt(1, modified_math);
						pstmt.setString(2, student_modify);
						pstmt.executeUpdate();
						System.out.println("수정완료");
					}catch(SQLException e) {
						System.err.println("sql = " + e);
					}
				}else
					System.out.println("번호를 잘못입력했습니다.");
			}
			
			else if(Menu_Num == Operation.DELETE_SCORE) {
				int del_part = 1;
				int del_all = 2;
				
				System.out.println("1.해당학생 삭제 2.모두삭제");
				int input_num = sc.nextInt();
				
				if(input_num == del_part){
					System.out.println("학생 이름을 입력하시오");
					query = "delete from score where name = ?";
					String del_name = sc.next();
					try {
						pstmt = conn.prepareStatement(query);
						pstmt.setString(1, del_name);
						pstmt.executeUpdate();
						pstmt.close();
						System.out.println( del_name + " 학생 삭제완료");
					}catch(SQLException e) {
						System.err.println("sql = " + e);
					}
				}
				else if(input_num == del_all) {
					query = "delete from score";
					try {
						pstmt = conn.prepareStatement(query);
						pstmt.executeUpdate();
						pstmt.close();
						System.out.println("전체삭제 완료");
					}catch(SQLException e) {
						System.err.println("sql = " + e);
					}
				}else
					System.out.println("이름을 잘못입력했습니다");
			}
			
			else if(Menu_Num == Operation.CLOSE) {
				System.out.println("종료합니다");
				try {
					conn.close();
				}catch(SQLException e) {
					System.exit(0);
				}
			}
			
			else
				System.out.println("번호를 잘못입력하셨습니다");
		}
	}
}
