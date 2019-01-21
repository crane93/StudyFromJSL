package chapter01;

class DB1{
	public double d1;
	public DB1() {
		System.out.println("클래스 DB1의 묵시적 생성자 수행");
		d1 = 10*10;
	}
}
class DB2 extends DB1{
	public double d2;
	public DB2() {
		System.out.println("클래스 DB2의 묵시적 생성자 수행");
		d2 = 10*10*10;
	}
	public DB2(double d) {
		System.out.println("클래스 DB2의 명시적 생성자 수행");
		d2 = d*d*d;
	}
}
class DB3 extends DB2{
	public double d3;
	public DB3() {
		System.out.println("클래스 DB3의 묵시적 생성자 수행");
		d3 = 10*10*10*10;
	}
	public DB3(double d) {
		System.out.println("클래스 디비3의 명시적 생성자 수행");
		d3 = d*d*d*d;
	}
}

public class DefaultInheritanceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DB3 super1 = new DB3(11);	// 맨 처음엔 디비3의 명시적생성자로 따라간다 근데 어라? 디비3은 디비2를 상속받네? 디비2를 따라가보니 여기도 묵시랑 명시가 있어  그런데말야 상속받은거 ㅓ따라갈때부터는 무조건 묵시적 생성자만 된다 ok?
		System.out.println("10의 2제곱" + super1.d1);
		System.out.println("10의 3제곱" + super1.d2);
		System.out.println("10의 4제곱" + super1.d3);

	}

}
