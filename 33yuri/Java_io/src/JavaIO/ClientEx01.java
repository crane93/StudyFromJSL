package JavaIO;

import java.io.*;
import java.net.*;

//클라이언트 만들기
public class ClientEx01 {

	public static void main(String[] args) {
		Socket socket =null;
		try {
			socket = new Socket("127.0.0.1",8027);		// ,포트번호  를 알고있어야 소켓이 열림
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			String str = "안녕 서버유저";
			out.write(str.getBytes());		//바이트단위로 보내겠다
			
		}catch(Exception e) {
			System.out.println("실패");
		}
	}

}
