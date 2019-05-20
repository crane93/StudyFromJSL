import java.io.*;
import java.net.*;

public class SenderThread extends Thread{
	Socket socket;
	
	public SenderThread(Socket socket) {
		this.socket = socket;
	}
	public void run() {			//쓰레드 상속받았으니까 run
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	//바이트단위로 통신하니까 보조스트림 ㄱ
			PrintWriter writer = new PrintWriter(socket.getOutputStream());		//기반클래스
			while(true) {
				String str = reader.readLine();			//한줄단위로 읽어들이겠다
				if(str.equals("bye"))
					break;
				writer.println(str);
				writer.flush();				//공간이 차지 않아도 계속 비우겠다, 엔터치면 바로바로 보내겠다
			}
		} catch (IOException e) {
			e.printStackTrace();
		}			
		try {								//finally로 하면 그냥 다 닫힌다?
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
