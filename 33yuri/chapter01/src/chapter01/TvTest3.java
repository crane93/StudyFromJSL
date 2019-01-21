package chapter01;

class Tv7{	//이름 같으면 다메
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
public class TvTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv7 t1 = new Tv7();
		Tv7 t2 = new Tv7();
		System.out.println("t1의 채널값은 " + t1.channel + "입니다");
		System.out.println("t2의 채널값은 " + t2.channel + "입니다");
		
		t2 =t1;
		t1.channel = 7;
		System.out.println("t1의 채널값을 7로 바꾸었습니다");
		
		System.out.println("t1의 채널값은 " + t1.channel + "입니다");
		System.out.println("t2의 채널값은 " + t2.channel + "입니다");
		
		
		
	}

}

