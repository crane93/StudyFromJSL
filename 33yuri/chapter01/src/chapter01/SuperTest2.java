package chapter01;

class D1{
	public int x = 1000;
	public void display() {
		System.out.println("상위클래스 D1의 display()메소드입니다");
	}
}
class D2 extends D1{
	public int x = 2000;
	public void display() {
		System.out.println("하위클래스 D2의 디스플레이()메소드입니다");
		
	}
	public void write() {
		display();
		super.display();	//상속받은 클래스의 디스플레이 호출
		System.out.println("D2클래스 객체의 x값은: " + x);
		System.out.println("D1클래스 객체의 x값은: " + super.x);
	}
}
public class SuperTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		D2 d = new D2();
		d.write();
	}

}
