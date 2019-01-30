import java.sql.*;
import java.util.*;

public class Exam_02 {

	public static void main(String[] args) {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("드라이버 검색 성공");
		}catch(ClassNotFoundException e) {
			System.err.println("error  = " + e);
		}
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/java";
		String id = "root";
		String pass = "1234";
		String query = "select * from person";
		try {
			conn = DriverManager.getConnection(url,id,pass);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String jumin = rs.getString("jumin");
				java.sql.Date date = rs.getDate("birth");
				java.util.Date d = new java.util.Date(date.getTime());
				System.out.print(num + "\t");
				System.out.print(name + "\t");
				System.out.print(jumin + "\t");
				//System.out.println(date);
				System.out.println(d.toString());
			}
			rs.close();
			stmt.close();
			conn.close();
					
		}catch(SQLException e) {
			System.err.println("error sql = " + e);
		}
	}

}
