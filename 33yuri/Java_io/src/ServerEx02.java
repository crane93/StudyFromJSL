import java.io.*;
import java.net.*;

public class ServerEx02 {

	public static void main(String[] args) {
		ServerSocket servertsocket = null;
		Socket socket =null;
		
		try {
			servertsocket = new ServerSocket(9001);
			socket = servertsocket.accept(); 			//서버소켓과 연결
			Thread thread1 = new SenderThread(socket);		//다형성
			Thread thread2 = new ReceiverThread(socket);
			thread1.start();		//쓰레드 실행
			thread2.start();
		}catch(Exception e) {
			System.out.println("소켓오류");
		}
		finally{						
			try {
			servertsocket.close();		//통신이 끝나면 소켓을 닫는다
		} catch (IOException e) {
			e.printStackTrace();
		}		
		}
	}

}
