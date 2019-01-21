package chapter01;

class Am{
	int count = 1;
	void callme() {
		System.out.println("Am의 callme실행, count 값: " + count);
	}
	
}
class Bm extends Am{
	int count = 2;
	void callme() {		//상위 클래스의 callme오버라이딩
		System.out.println("Bm의 callme실행, count값: " + count);
	}
}
class Cm extends Am{
	int count = 3;
	void callme() {
		System.out.println("Cm의 callme실행, count 값" + count);
	}
}
public class PolymorphismTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Am r = new Am();
		r.callme();
		System.out.println("r.callme. 값: " + r.count);
		
		r = new Bm(); 		//Am클래스 형의 객체변수 r에 Bm 클래스의 객체배정(형 변환)
		r.callme();//Bm클래스의 callme수행 count값으로 2 출력
		System.out.println("r.count값: " +r.count);
		
		r = new Cm();
		r.callme();
		System.out.println("r.count값: " + r.count);
	}

}
