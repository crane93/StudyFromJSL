package InputOutput;

import java.io.*;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output1.txt")){	//뒤에 true를 붙이면 기존에 있는것 남으면서 뒤에 새로 추가된다
//			fos.write(65);
//			fos.write(66);
//			fos.write(67);
			byte[] bs = new byte[26];
			byte data = 65;
			for(int i = 0; i<bs.length;i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs,2,10); 	//bs를 인덱스2번째부터 인덱스10번째까지 잘라서 가져오겠다
			
//			for(int i=65; i<=91;i++) {
//				fos.write(i);
//			}
		}catch(IOException e){
			System.out.println("입출력오류");
		}
	}
}
