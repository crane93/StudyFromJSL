package JavaIO;

import java.io.*;
import java.net.*;

public class Ex02 {

	public static void main(String[] args) {
		ServerSocket ss = null;		//객체생성
		
		for(int i=1; i<=65535; i++) {
			try {
				ss = new ServerSocket(i);
				ss.close();
			} catch (IOException e) {
				System.out.println(i + "번 포트 사용중");
			}
		}
		
	}

}
