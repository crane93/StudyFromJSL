package chapter01;


abstract class Shape{
	abstract void draw();
	abstract void computerArea(double a, double b);
	}

class Circle1 extends Shape{	//추상 클래스로부터 상속받아 클래스 생성, 추상메소드를 상속받았을땐  오버라이딩 꼭 해줘야한다
	void draw() {
		System.out.println("원을 그리는 기능");
	}
	void computerArea(double r1, double r2) {
		System.out.println("원의 넓이: " + (3.14*r1*r2));
	}
}

class Rectangle1 extends Shape{
	void draw() {
		System.out.println("사각형을 그리는 기능");
	}
	void computerArea(double h, double v) {
		System.out.println("사각형의 넓이: " + (h*v));
	}
}

class Triangle1 extends Shape{
	void draw() {
		System.out.println("삼각형을 그리는 기능");
	}
	void computerArea(double a, double h) {
		System.out.println("삼각형의 넓이: " + (a*h/2));
	}
}

public class AbstractTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("==추상 메소드를 이용한 다형성==");
		Shape s = new Circle1();
		s.draw();
		s.computerArea(5.0, 5.0);
		s = new Rectangle1();
		s.draw();
		s.computerArea(5.0, 10.0);
		s = new Triangle1();
		s.draw();
		s.computerArea(5.0, 10.0);
		
		
		
	}

}
