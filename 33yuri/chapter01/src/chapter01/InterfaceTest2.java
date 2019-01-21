package chapter01;

abstract class Figure1{
	abstract void draw();
}
interface Shape1{	//인터페이스 선언
	public void computerArea(double a, double b);
}
/*
 * 자바는 다중상속을 허용하지 않음
 * 그치만~ 여러개 상속받고싶단말야
 * 그렇다면 약간의 꼼수(?)로 인터페이스을 이용해보자!
 * 인터페이스끼리는 여러번 상속받을 수 있다
 * 그걸 보통의 class가 상속받는다면?
 * 덕분에 다중상속 가능ㅅㄱ
 */
class Triangle3 extends Figure1 implements Shape1{	//추상 클래스와 인터페이스를 포함하는 클래스 작성
	void draw() {
		System.out.println("삼각형을 그리는 기능");
	}
	public void computerArea(double a, double h) {
		System.out.println("삼각형의 넓이: " + (a*h/2));
	}
}
class Rectangle3 extends Figure1 implements Shape1{	//추상 클래스와 인터페이스를 포함하는 클래스 작성
	void draw() {
		System.out.println("사각형을 그리는 기능");
	}
	public void computerArea(double h, double v) {
		System.out.println("사각형의 넓이: " + (h*v));
	}
}
class Oval3 extends Figure1 implements Shape1{	//추상 클래스와 인터페이스를 포함하는 클래스 작성
	void draw() {
		System.out.println("원을 그리는 기능");
	}
	public void computerArea(double r1, double r2) {
		System.out.println("원의 넓이: " + (3.14*r1*r2));
	}
}

class Polydraw1{
	public void pdraw(Figure1 f) {
		f.draw();
	}
	public void pcomputerArea(Shape1 s, double a, double b) {
		s.computerArea(a, b);
	}
}

public class InterfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polydraw1 p = new Polydraw1();
		Figure1 fg1 = new Triangle3();
		Figure1 fg2 = new Rectangle3();
		Figure1 fg3 = new Oval3();
		Shape1 sp1 = new Triangle3();		//인터페이스 형의 객체변수에 클래스의 객체를 배정
		Shape1 sp2 = new Rectangle3();
		Shape1 sp3 = new Oval3();		

		p.pdraw(fg1);
		p.pcomputerArea(sp1, 4, 4);
		p.pdraw(fg2);
		p.pcomputerArea(sp2, 4, 4);
		p.pdraw(fg3);
		p.pcomputerArea(sp3, 4, 4);
		
	}

}
