import java.sql.*;
import java.util.*;

public class Exam_04 {
	//자바에서 튜플 추가하기 정적쿼리 or 동적쿼리의 방법으로...
	public static void main(String[] args) {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		}catch(ClassNotFoundException e) {}
		Connection conn = null;
		Statement stmt = null;				//정적쿼리 작업객체
		PreparedStatement pstmt = null;		//동적쿼리 작업객체
		ResultSet rs = null;
//		String name = "fff";
//		String jumin = "555555-5555555";
//		String birht = "2019-01-22";
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","1234");
			//String query = "insert into person values" + "(null, '" + name +"','"+jumin + "', '" + birth + "')";
//1			stmt = conn.createStatement();		//정적으로 할당하면
//			stmt.executeQuery(query);			//데이타 삽입 명령
//			stmt.close();
			//정적쿼리를 쓰면 너무 귀찮아~~
			
//2			String query = "insert into person values (null, ?,?,?)";		//?는 동적인 쿼리에서 사용
//			pstmt = conn.prepareStatement(query);		//prepareStatement는 데이터 추가할것임을 알리는거
//			pstmt.setString(1, name);
//			pstmt.setString(2, jumin);
//			pstmt.setString(3, birht);
//			pstmt.executeUpdate();		//동적쿼리 편하네~
			
			String query = "select * from person where num > ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, 5);		//위에 물음표가 인덱스가 된다 1은 첫번째 ?를 뜻함, 그 첫번째 ?에 5를 대입한다
			rs = pstmt.executeQuery();
		    while(rs.next()) {		//rs에 값이 있으면 true값 반환
	            int num = rs.getInt("num");      //rs.getInt(1);
	            String name = rs.getString("name");
	            String jumin = rs.getString("jumin");
	            java.sql.Date date = rs.getDate("birht");   //sql의 데이터 값을 util의 값으로 변환
	            java.util.Date d= new java.util.Date(date.getTime());
	            System.out.print(num + "\t");
	            System.out.print(name + "\t");
	            System.out.print(jumin + "\t");
	            System.out.print(d.toString());      //System.out.println(date);
	            System.out.println();
	         }
			conn.close();
			System.out.println("업데이트 성공");
		}catch(SQLException e) {
			System.err.println("err = " + e);
		}
	}

}
