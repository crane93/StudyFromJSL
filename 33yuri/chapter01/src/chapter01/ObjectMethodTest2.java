package chapter01;

class AAA1{
	public int a;
	public String toString() {
		return "AAA1 클래스 객체, 속성 a의 값은:"  + a;
	}
}
public class ObjectMethodTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AAA1 aa = new AAA1();
		System.out.println(aa);	
		System.out.println(aa.toString());
	}

}
