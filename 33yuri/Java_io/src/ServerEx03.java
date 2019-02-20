import java.io.*;
import java.net.*;

public class ServerEx03 {

	public static void main(String[] args) {
		ServerSocket serversocket = null;
		try {
			serversocket = new ServerSocket(9005);			//서버는 아이피주소를 알필요 없다
			
			while(true) {
				Socket socket = serversocket.accept();		//응답을 기다려
				Thread thread1 = new PerClientThread(socket);
				thread1.start();
			}
		}catch(Exception e) {
		System.out.println("서버오류");	
		}
	}

}
