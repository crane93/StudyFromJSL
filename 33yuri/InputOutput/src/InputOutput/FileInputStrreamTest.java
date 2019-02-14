package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStrreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;		//인풋을 받는데 파일로 받겠다. 인풋스트림이니까 바이트로 받겠다는 뜻
		
		try {											//꼭 예외처리를 해줘야함. 파일입출력에 오류가 많대 
			fis = new FileInputStream("input.txt");		//인풋테스트에 경로가 없어 자바프로젝트 안에 파일 직접 만들자
//			System.out.print(fis.read());
//			System.out.print(fis.read());
//			System.out.print(fis.read());
//			
			int i;
			while((i = fis.read()) != -1) {				//문자 여러개를 읽어들일때 while문을 쓰자
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {				//파일을 찾을 수 없을 때의 예외처리
			System.out.println("파일이 없습니다");	
		}catch(IOException e) {							//입출력 오류일때의 예외처리
			System.out.println("입출력 오류");
		}
	}

}
