package chapter01;

class OIa{
	public void show(String str) {
		System.out.println("상위 클래스의 메소드 show(string str)수행: " + str);
	}
}
class OIb extends OIa{
	public void show() {
		System.out.println("하위 클래스의 메소드 show()수행");
	}
}
public class OverridingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OIb oib = new OIb();
		oib.show("처음 시작하는 자바");
		oib.show();
	}

}
