package chapter01;


class A{
	public int aa = 1;
}
class B extends A{
	private int bb =2;
	public int bb() {	//메소드 선언
		return bb;
	}
}
class C extends B{
	int cc = 3;
}
public class InheritanceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C objc = new C();
		System.out.println("objc객체의 객체속성변수 aa의 값은: "+objc.aa);
		System.out.println("objc객체의 객체속성변수 bb의 값은: "+objc.bb());
		//objc.bb로 접근하면 오류  프라이빗은 외부에서 접근하면 오류가 난다
		System.out.println("objc객체의 객체속성변수 cc의 값은: "+objc.cc);


	}

}
