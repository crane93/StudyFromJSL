package chapter01;

abstract class Figure{
	abstract void draw();
}

class Triangle2 extends Figure{
	public void draw() {
		System.out.println("다형성: 삼각형을 그린다");
	}
}
class Rectangle2 extends Figure{
	public void draw() {
		System.out.println("다형성: 사각형을 그린다");
	}
}
class Oval2 extends Figure{
	public void draw() {
		System.out.println("다형성: 타원형을 그린다");
	}
}

class Polydraw{
	public void pdraw(Figure f) {
		f.draw();
	}
}

public class AbstractTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polydraw p =new  Polydraw();	//도형을 그리기위해 폴리드로우 클래스로부터 객체생성
		Figure fg1 = new Triangle2();	//추상 클래스 형으로 객체 생성
		Figure fg2 = new Rectangle2();
		Figure fg3 = new Oval2();
		p.pdraw(fg1);					//동일한 객체에 동일한 메세지를 보낸다
		p.pdraw(fg2);
		p.pdraw(fg3);
	}

}
