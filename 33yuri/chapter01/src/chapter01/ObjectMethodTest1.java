package chapter01;

class AAA{
	public int a;
}

public class ObjectMethodTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AAA aa = new AAA();
		System.out.println(aa);	//객체 aa의 toString메소드가 자동으로 호출(Object클래스로부터 상속되었음)
		System.out.println(aa.toString());
		Integer ii = new Integer(99);
		System.out.println(ii);
		System.out.println(ii.toString());
	}

}
