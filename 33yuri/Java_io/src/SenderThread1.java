import java.io.*;
import java.net.*;

public class SenderThread1 extends Thread{
	Socket socket;
	String name;
	public SenderThread1(Socket socket, String name) {
		this.socket = socket;
	}
	
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	//키보드로 입력받으니까~
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			writer.println(name);
			writer.flush();
			
			while(true) {
				String str = reader.readLine();			//타이핑한걸 읽어냄
				if(str.equals("bye"))
					break;
				writer.println(str);
				writer.flush();
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			try {
				socket.close();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
