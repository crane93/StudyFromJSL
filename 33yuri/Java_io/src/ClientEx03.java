import java.io.*;
import java.net.*;

public class ClientEx03 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.33.1", 9005);
			Thread thread1 = new SenderThread1(socket, args[0]);		//args[0]: 닉네임변수
			Thread thread2 = new ReceiverThread1(socket);
			thread1.start();
			thread2.start();
		}catch(Exception e) {
			System.out.println("클라이언트오류");
		}
		
	}

}
