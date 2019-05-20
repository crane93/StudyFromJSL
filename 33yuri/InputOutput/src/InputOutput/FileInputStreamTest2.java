package InputOutput;

import java.io.*;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("InputText.txt")){//파일인풋스트림을 try조건에 넣으면 자체 내에서 검증하기때문에 파일 익셉션처리안해도 된다 
			
			byte[] bs = new byte[10];			//배열로하면 한번에 10글자씩 가지고 올 수 있으니까 하나하나씩 가져오는 것보다 속도가 빠르다
			int i;
			while((i = fis.read(bs)) != -1) {
				for(byte b : bs) {
					System.out.print((char)b);
				}
//				for(int k = 0; k<i; k++) {		//위와 같은 방법
//					System.out.print((char)bs[k]);
//				}
				System.out.println(" : "+ i + "바이트 읽음");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
