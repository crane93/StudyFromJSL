package chapter01;

class Sample3{
	void methodA() {
		System.out.println("B메쏘드 호출 전");//1
		methodB();//2
		System.out.println("B메소드 호출 후");//7
		
	}
	void methodB() {
		System.out.println("c메소드 호출 전");//3
		methodC();//4
		System.out.println("C메쏘드 호출 후");//6
		
	}
	void methodC() {
		System.out.println("C메소드 수행 완료");//5
	}
}
public class CallMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample3 s = new Sample3();
		s.methodA();
		//
		
	}

}
