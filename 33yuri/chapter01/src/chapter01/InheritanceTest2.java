package chapter01;

class B1{
	public int x = 500;
	public int y = 1000;
}
class B2 extends B1{
	public String x = "처음시작하는 자바";
}
public class InheritanceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B2 b2 = new B2();
		System.out.println("객체 b2에 들어있는 x, y값: " + b2.x+b2.y);	//엣 B2에는 y값이 없지만 B1을 상속받았기 때문에 문제없음
		B1 b1 = new B1();
		System.out.println("객체 b1에 들어있는 x, y값: " + b1.x + b1.y);
		//문자와 숫자의 결합이라 500+1000=1500이 아닌 5001000로 출력 
	}

}
