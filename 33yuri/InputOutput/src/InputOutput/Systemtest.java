package InputOutput;

import java.io.*;

public class Systemtest {

	public static void main(String[] args) {
		System.out.println("알파벳 한 글자를 입력하시오");
		
		int i;
		
		try {
			/*
			i = System.in.read();	//표준입력(키보드)으로 읽어들임.
			System.out.println(i);	//아스키코드값으로 나옴
			System.out.println((char)i);	//형변환
			*/
			
			while((i=System.in.read()) != -1) {		//-1은 파일의 끝을 나타난다는 뜻 엔터가 쳐지면 문장이 끝났다는 의미로 -1이 붙어서 입력됨 EOF
				System.out.println((char)i);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
