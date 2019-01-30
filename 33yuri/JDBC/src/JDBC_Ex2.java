import java.sql.*;

public class JDBC_Ex2 {
   public static void main(String[] args) {
      Connection conn = null;
      Statement stmt = null; // 명령문
      try{
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "1234");
         stmt = conn.createStatement();
         /*이어서 Connection 객체의 createStatement() 메서드를 호출해서 쿼리를 실행할 수 있는 Statement 객체( stmt )를 얻습니다.
		해당 쿼리에는 동적으로 할당되는 값이 없으므로 createStatement() 메서드를 호출합니다.
		출처: https://victorydntmd.tistory.com/145 [victolee]*/
         ResultSet rs = stmt.executeQuery("select code, name, price, maker from goodsinfo;");   
         // executeQuery > SELECT, executeUpdate > SELECT 외의 것 (INSERT, UPDATE, DELETE 등)
         System.out.println("상품코드  상품명\t가격 \t제조사");
         System.out.println("------------------------------------------------------");
         while(rs.next()) {
            String code = rs.getString(1);
            //getstring("code")랑 같은 결과  code라고 써주는게 더 명확하고 좋겠지? 쉽게 알아보는 변수!
            String name = rs.getString("name");
            int price = rs.getInt("price");
            String maker = rs.getString("maker");
            System.out.printf("%5s%5s%10d%5s%n", code, name, price, maker);
         }
      }catch(ClassNotFoundException cnfe) {
         System.out.println("해당 클래스를 찾을 수 없습니다. " + cnfe.getMessage());
      }catch(SQLException se) {
         System.out.println(se.getMessage());
      }finally {
         try {
            stmt.close();
         }catch(Exception ignored) {
            
         }
         
         try {
            conn.close();
         }catch(Exception ignored) {
            
         }
      }

   }
}

/*
1) import java.sql.*;
2) 드라이버 로드
3) mysql 연결을 위한 Connection 객체 생성
4) Statement 객체를 생성하여 질의 수행
5) 질의 결과가 있다면 ResultSet 객체를 생성하여 결과 저장
6) 프로그램 내에서 추가적인 로직이 있다면 로직을 수행한 후 JDBC 연결 과정에서 필요했던 객체들을 close

출처: https://victorydntmd.tistory.com/145 [victolee]
*/
