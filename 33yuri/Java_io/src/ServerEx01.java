

import java.io.*;
import java.net.*;

//서버 만들기
public class ServerEx01 {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;		//서버는 항상 이두개가 있어야함
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(8027);		//8027:포트번호  전화번호랄까나
			socket = serverSocket.accept();				//내 전화번호로 전화가 오면 소켓이 활성화됨
			byte arr[] = new byte[100];
			InputStream in = socket.getInputStream();	//소켓을 통해서 받음
			OutputStream out = socket.getOutputStream();
			in.read(arr);		//배열로 읽겠다 그럼 속도빠름 ㅎ
			System.out.println(new String(arr));		//배열을 String으로 형변환
			String str = "클라이언트 입니다";
			out.write(str.getBytes());
		}catch(Exception e){
			System.out.println("통신오류");
		}
	}

}
