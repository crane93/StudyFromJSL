import java.sql.*;

public class JDBC_Ex1 {
	/*이제 이게 기본 틀이 될것이다*/
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // MySQL드라이버 로드
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "1234"); 
														// JDBC연결, 데이터베이스에 java라고 create했기 때문에 /java라고 쓴다
			System.out.println("DB연결 완료");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB연결 오류");
		}
	}

}
