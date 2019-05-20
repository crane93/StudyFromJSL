package InputOutput;
import java.io.*;

/*
 *입출력이 1바이트나 한 문자 단위로 이루어지면 그만큼 프로그램을 수행할 때 속도가 느려지게됨
 *Buffered 스트림은 내부적으로 8,192바이트 크기의 배열을 가지고 있기 때문에 이미 생성된 스트림에 배열기능을 추가해서 입출력하면 속도가 매우 향상됨 
 */
public class BufferStream {

	public static void main(String[] args) {
		long milliscond = 0;
		/*
		try(FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip")){
			milliscond = System.currentTimeMillis();		//현재시간
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);			//지금 1바이트씩 복사중.... 존나 느림
			}
			milliscond = System.currentTimeMillis() - milliscond;		//복사하고 나서 끝난 시간을 현재시간으로 뺀다
		}catch(IOException e) {
			e.printStackTrace();
		}
		*/
		
		try(FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy1.zip");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
			milliscond = System.currentTimeMillis();		//현재시간
			int i;
			while((i = bis.read()) != -1) {					//복사하는 거니까 읽어와서(read) 쓴다 (write)
				bos.write(i);								//존나빨라 ㅋㅋ 복사 시간은 때에따라 다르다 쓰레드개념 생각하면 됨
			}
			milliscond = System.currentTimeMillis() - milliscond;		//복사하고 나서 끝난 시간을 현재시간으로 뺀다
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("총 파일 복사시간은" + milliscond + "소요되었습니다");
	}

}
