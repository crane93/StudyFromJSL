package Thread;

class Counter{
	
	private int value = 0;
	public synchronized void increment() {
		value++;
	}
	public synchronized void decrement() {
		value--;
	}
	public synchronized void printCount() {
		System.out.println(value);
	}
}

class MyCounter extends Thread{
	Counter sharedConunter;
	
	public MyCounter(Counter c) {
		this.sharedConunter = c;
	}
	
	public void run() {
		int i=0;
		while(i<20000) {
			sharedConunter.increment();		//1추가되고
			sharedConunter.decrement();		//1을 빼버린닿 
			if(i%40 == 0)
				sharedConunter.printCount();
			try {
				Thread.sleep((int)(Math.random()*200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class CountEx {

	public static void main(String[] args) {
		Counter c = new Counter();
		new MyCounter(c).start();	//이렇게 하면 0만찍혀
		new MyCounter(c).start();	//어? 근데 여러개 쓰니까 숫자가 변하네?
		new MyCounter(c).start();
	}

}
