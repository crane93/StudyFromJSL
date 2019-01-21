package chapter01;
	//하나의 프로잭트에는 하나의 클래스! 이름 중복되면 안된당
class Tv6{	//이름 같으면 다메
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

public class TvTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Tv6 t1 =  new Tv6();
		Tv6 t2 = new Tv6();
		System.out.println("t1의 채널값은 " + t1.channel + "입니다");
		System.out.println("t2의 채널값은 " + t2.channel + "입니다");
		
		t1.channel = 7;
		System.out.println("t1의 채널값을 7로 변경하였입니다");
		
		System.out.println("t1의 채널값은 " + t1.channel + "입니다");
		System.out.println("t2 채널값은 " + t2.channel + "입니다");


	}

}
