package InputOutput;
import java.io.*;

public class InputStream_GetString {

	public static void main(String[] args) {
		FileReader fis = null;						//FileInputStream으로 하면 한 바이트로 끊어서 가져와 그런데 한글은 2바이트야 가지고올때 깨져서 보여 ㅜ 그래서 Reader를 써야한다
		try {
			fis = new FileReader("Reader.txt");
			int i;
			while((i=fis.read()) != -1) {
				System.out.print((char)i);
			}
		}catch(FileNotFoundException e) {
			System.out.println("파일이 없습니다");
		}catch(IOException e) {
			System.out.println("입출력오류");
		}
		
		 /*트라이 옆에 괄호를 써서 객체를 만들고 실행을 하면 write파일이 알아서 close되 그래서 글자가 저장된게 보이는거지
		  * r근데 filewrite fos = null \n fos = new Filewrite()이렇게 쓰면 자동 닫힘이 안되서 저장이 안되
		  * 후자 방법으로 객체를 생성할때는 close를 꼭 써주자!
		  * */
		FileWriter fws = null;
		
		try (FileWriter fos =new FileWriter("writer.txt")){			
			fos.write("sidsid");
			fos.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
