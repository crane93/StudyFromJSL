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
		
		/*3.
		 * 클래스에 쓰레드를 상속받아 
		 * 헉 근데 난 다른것도 상속받고싶단말야 ㅜ 
		 * 그럴땐! 스레드 안에 포함되있는 인터페이스를 상속받자 
		 * 인터페이스는 여러개 상속받을수있어 ㅎ
		 * 그 중 대표적인게 runable이다
		 * */
	}

}
