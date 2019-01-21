package chapter01;

class Rectangle5{
	public int width;
	public int height;
	public Rectangle5(int w, int h) {
		width = w;
		height = h;
	}
	public int computerRectangleArea(){
		return width*height;
	}
}

class Cube5 extends Rectangle5{
	public int depth;
	public Cube5(int w, int h, int d) {
		super(w,h);
		depth = d;
	}
	public int computerCubeArea() {
		return super.computerRectangleArea() * depth;
	}
}
public class CastTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle5 r = new Cube5(10,20,30); 	//상위 클래스 형의 객체 변수에 하위클래스의 객체를 생성하여 배정
		System.out.println("정사각형의 넓이는: " + r.computerRectangleArea());
		Cube5 c = (Cube5) r;
		System.out.println("직육면체의 부피는: " + c.computerCubeArea());
	}

}
