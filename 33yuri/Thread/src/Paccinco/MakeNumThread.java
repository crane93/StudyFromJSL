package Paccinco;
import Paccinco.*;		//파칭코 패키지에 있는 모든 클래스 공유하겠다

public class MakeNumThread extends Thread{
	public void run() {
		synchronized (this) {
			while(Data.OnOffset) {
				try {
					System.out.println("---------------");
					Data.first = (int)(Math.random()*4);
					this.wait(200);							//200초 간격으로 출력
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				try {
					Data.second = (int)(Math.random()*4);
					this.wait(200);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				try {
					Data.third = (int)(Math.random()*4);
					this.wait(200);
					System.out.println(String.format("%d %d %d", Data.first,Data.second,Data.third));
					System.out.println("---------------");
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
