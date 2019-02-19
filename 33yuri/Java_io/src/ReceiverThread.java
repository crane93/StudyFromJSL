import java.io.*;
import java.net.*;

public class ReceiverThread extends Thread{
	Socket socket;
	public ReceiverThread(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				String str = reader.readLine();
				if(str == null) {
					break;
				}
				System.out.println("수신> " + str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//receiver에서는 소켓을 끊지 않는다 둘다 끊으면 진짜 끊김
	}
}
