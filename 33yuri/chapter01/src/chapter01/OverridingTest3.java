package chapter01;


class OIa1{
	public void show(String str) {
		System.out.println("상위 클래스의 메소드 show(String str)수행: " + str);
		
	}
}
class OIb2 extends OIa1{
	@Override public void show(String str) {	//오버라이드 이름이 다르면 알려주는게 오버라이드 주석 프로그램돌릴땐 멀쩡하게 돌아간다
		System.out.println("하위 클래스의 메소드 show(String str)수행 " + str);
	}
}
public class OverridingTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OIb2 oib = new OIb2();
		oib.show("처음시작하는자바");
	}

}
