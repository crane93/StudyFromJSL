package chapter01;


class PlusMinus{
	int plus, minus;	//두 개의 속성을 정의
	public String plus(int x, int y) {	//plus기능(메소드)를 정의
		plus = x + y;
		return "두 수의 합은 " + plus;
	}
	public String minus(int x, int y) {
		minus = x - y;
		return "두 수의 차는 " + minus;
	}
}		//이놈이 메인이 아니라 혼자 돌려도 안나온다
		//여기다 만들어두고 다른페이지에 메인 돌려도 ok
public class 객체지향2 {

	public static void main(String[] args) {
		PlusMinus ob1 = new PlusMinus();		//플러스마이너스 클래스로부터 ob1객체 생성
		String sum, minus;
		sum = ob1.plus(50, 30);
		minus = ob1.minus(50,30);
		System.out.println(sum);
		System.out.println(minus);
				


	}

}
