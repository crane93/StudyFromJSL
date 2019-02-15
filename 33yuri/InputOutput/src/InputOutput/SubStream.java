package InputOutput;
import java.io.*;

/*
 * 보조스트림: 입출력 대상이 되는 파일이나 네트워크에 직접 쓰거나 읽는 기능이 없음.
 * 즉 보조기능을 추가하는 스트림
 * 이 보조 기능은 여러 스트림에 적용할 수 었음
 * = Wrapper 스트림이라고도 함
 * 즉, 다른 스트림을 감싸고 있다는 의미
 * 스스로는 입출력 기능이 없기 때문에 생성자의 매개변수로 다른 스트림을 받게 되면 자신이 감싸고 있는 스트림이 읽거나 쓰는 기능을 수행함
 */
public class SubStream {

	public static void main(String[] args) {
		/*
		 * InputStreamReader > 보조스트림, 기반스트림을 매개변수로 받아서 객체생성
		 * FileInputStream > 기반스트림, 입력과 출력의 직접 대상이 있음
		 * 기반스트림 써도 충분히 돌아가는데 왜 굳이?
		 * 네트워크는 바이트단위의 통신 한글을 그대로 보내면 깨질꺼야 그래서 보조스트림 이용해서 한번 감싸준다
		 */
		
		/*
		 * 표준 입출력 스트림 System.in과 System.out은 모두 바이트 스트림이다
		 * so,원래는 System.in은 콘솔 화면에서 한글을 읽으려고 하면 InputStreamReader를 사용해야 한다 근데 내장되있음 ㅎ
		 * 
		 * 만약 채팅 프로그램을 만든다고 할 때, 모두 영어로 사용하면 1바이트니까 상관없음
		 * but 한글을 사용하려고 하면 문자단위로 변환시켜야 하니까 보조스트림이 사용된다
		 */
		try (InputStreamReader isr = new InputStreamReader(new FileInputStream("Reader.txt"))){		//인풋스트림리더가 보조스트림
			int i;
			while((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
		}catch(IOException e){
			System.out.println("입출력오류");
		}
	}

}
