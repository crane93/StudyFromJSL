import java.io.*;
import java.net.*;
import java.util.*;			//리스트에 객체 담아서 가져올거임

public class PerClientThread extends Thread{
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());
	Socket socket;
	PrintWriter writer;
	public PerClientThread(Socket socket) {
		this.socket = socket;
		try {
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer);
		}catch(Exception e) {
			System.out.println("오류");
		}
	}
	public void run() {
		String name = null;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			name = reader.readLine();
			sendAll("#" + name + "님이 들어오셨습니다");
			while(true) {
				String str = reader.readLine();
				if(str == null)
					break;
				sendAll(name + ">" + str);
			}
		}catch(Exception e) {
				System.out.println(e.getMessage());
			}finally {
				list.remove(writer);
				sendAll("#" + name + "님이 나갔다");
				try {
					socket.close();
				}catch(Exception e){
					System.out.println(e.getMessage());
				}
			}
		}
	
	
	private void sendAll(String str) {
		for(PrintWriter write: list) {
			write.println(str);
			write.flush();
		}
	}
}
