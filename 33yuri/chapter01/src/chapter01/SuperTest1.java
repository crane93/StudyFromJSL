package chapter01;

class SB1{
	public int x = 500;
	public int y = 1000;
}

class SB2 extends SB1{
	public String x = "처음 시작하는 자바";
	public String xx = x + super.x;		//super를 쓰면 상속받은 바로 윗 클래스의 멤버변수를 끌어다 쓴다
	public String yy = "" + y + super.y;	//앞의 ""가 없으면 정수+정수가 되버렷
}
public class SuperTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SB2 sb2 = new SB2();
		System.out.println("객체 sb2에 들어있는 x, y값: " + sb2.x + sb2.y);
		//sb2.super.x같은건 없다
		System.out.println("객체 sb2에 들어있는 xx값: " + sb2.xx);
		System.out.println("객체 sb2에 들어있는 yy값: " + sb2.yy);

	}

}
