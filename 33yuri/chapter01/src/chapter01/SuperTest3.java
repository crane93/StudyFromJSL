package chapter01;

class SD1{
	public int i1;
	public double d1;
	public SD1(int i1) {
		System.out.println("SD1(int i1) 생성자수행");
		this.i1 = i1 * i1;
		System.out.println(i1 + "의 2제곱은: " + this.i1);
	}
	public SD1(double d1) {
		System.out.println("SD1(double d1) 생성자 수행");
		this.d1 = d1*d1;
		System.out.println(d1 + "의 2제곱은: " + this.d1);
	}
}

class Sub1 extends SD1{
	public Sub1(int i1) {
		super(i1);	//수퍼가 단독으로 쓰이면? 상위 클래스의 생성자 호출(<<이 기능이 수퍼의 두번째 기능이다)
		System.out.println("Sub1(int i1) 생성자 수행");
		this.i1 = this.i1 * i1;	// 두번재 this.i1는 상속받은 객체변수를 뜻함ㅎ
		System.out.println(i1 + "의 3제곱은: " + this.i1);
		
	}
	public Sub1(double d1) {
		super(d1);
		System.out.println("Sub1(double d1) 생정자 수행");
		this.d1 = this.d1 * d1;
		System.out.println(d1 + "의 3제곱은: " + this.d1);
	}
}
public class SuperTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sub1 sub1 = new Sub1(13);
		Sub1 sub2 = new Sub1(10.5);
	}

}
