import java.sql.Connection;
import java.sql.DriverManager;
//1	드라이버 로드
public class DBCon {		//db connection을 담당하는 클래스
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/java";
	String id = "root";
	String pw = "1234";
	Connection con = null;
	
	public DBCon() {
		try {
			Class.forName(driver);		//odbc6.jar 드라이버를 자바 객체로 만든다
			con = DriverManager.getConnection(url, id, pw);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		return con;
	}
}