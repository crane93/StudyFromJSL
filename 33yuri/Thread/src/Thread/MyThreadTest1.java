package Thread;

class MyTread extends Thread{
	String name;
	public MyTread(String name) {
	this.name = name;
	}
	public void run() {
		for(int i=0; i<=10;i++) {
			System.out.print(name + i + " ");
		}
	}
}
public class MyThreadTest1 {

	public static void main(String[] args) {
		MyTread my = new MyTread("a");
		MyTread my1 = new MyTread("b");
		MyTread my2 = new MyTread("c");
		
		//my.run();
		//my1.run();
		my.start();
		my1.start();
		my2.start();
		
		/*1.
		 * 엥? Mythraad에 스타트 메소드 없는데?!
		 * 스레드 상속받았지? start는 쓰레드를 호출한거다
		 * run은 메소드이다*/
		
		/*2.
		 * 메소드는 먼저 입력한 순서를 따라 my.run()이 먼저 실행되고 my1.run()이 실행되
		 * 하지만 쓰레드는 먼저 메모리에 접근한 순서대로 처리한다 마이스타트 마이1스타트 마이2스타트 가 섞여서 실행된다
		 * */
	}

}
