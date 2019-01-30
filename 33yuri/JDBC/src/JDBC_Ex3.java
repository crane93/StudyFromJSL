import java.sql.*;
import java.util.*;

public class JDBC_Ex3 {
   public static void main(String[] args) {
      try {
         Class.forName("org.gjt.mm.mysql.Driver");
         System.out.println("드라이버 검색 성공!");
      }catch(ClassNotFoundException e) {
         System.err.println("Error = " + e);
      }
      
      Connection conn = null;
      Statement stmt = null;
      ResultSet rs = null;
      String url = "jdbc:mysql://localhost:3306/java";
      String id = "root";
      String pass = "1234";
      String query = "select * from person";		//퍼슨테이블 다 가져오기 
      try {
         conn = DriverManager.getConnection(url, id, pass);
         stmt = conn.createStatement();
         rs = stmt.executeQuery(query);
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
         rs.close();
         stmt.close();
         conn.close();
      }catch(SQLException e) {
         System.err.println("error sql = " + e);
      }
   }
}
