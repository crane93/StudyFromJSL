package chapter01;

class Car7{
	String color;
	int door;
	
	void drive() {
		System.out.println("부릉부릉");
	}
	void stop() {
		System.out.println("멈춰");
		
	}
}
class FireEngine extends Car7{
	void water() {
		System.out.println("물");
	}
}

public class CastingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car7 car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		fe2 = (FireEngine)car;	//자손타입<<조상타입
		fe2.water();
	}

}
