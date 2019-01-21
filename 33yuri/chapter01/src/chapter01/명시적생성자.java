package chapter01;

class Cons3{
	public int num;
	public Cons3(String s) {
		System.out.println(s + "명시적 생성자");
	}
	Cons3(){
		System.out.println("묵시적생성자");
	}
}
public class 명시적생성자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cons3 cons1 =  new Cons3("1번쨰");
		Cons3 cons2 = new Cons3();	//오류난다 위에 묵시적 생성자를 정의해두지 않아서 그럼 ㅎ
	}

}
