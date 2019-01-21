package chapter01;


class Tv5{	//이름 같으면 다메
	String color;
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv5 t = new Tv5();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel);
	}

}


		