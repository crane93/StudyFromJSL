import java.io.*;
import java.net.*;

public class ClientEx02 {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("192.168.0.12", 9001);
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			thread1.start();
			thread2.start();
		}catch(Exception e) {
			System.out.println("통신오류");
		}
	}
}
