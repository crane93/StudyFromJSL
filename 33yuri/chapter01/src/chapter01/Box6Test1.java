package chapter01;

class Box6{
	int width;
	int height;
	int depth;
	
	double dwidth;
	double dheight;
	double ddepth;
	
	public Box6(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
	public Box6(double w, double h, double d) {
		dwidth = w;
		dheight = h;
		ddepth = d;
	}
}
public class Box6Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box6 mybox1 = new Box6(10,20,30);
		int vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("정수로된 박스의 부피" + vol);
		
		mybox1 = new Box6(10.5,20.5,30.5);
		double dvol = mybox1.dwidth * mybox1.dheight * mybox1.ddepth;
		System.out.println("정수로된 박스의 부피" + dvol);
		
		mybox1 = new Box6(10,20,30.5);		//혼합되어있는 경우에는 자동으로 확대 형 변환이 수행되어 3개의 실수 매개 변수를 가진 생성자가 수행
		dvol = mybox1.dwidth * mybox1.dheight * mybox1.ddepth;
		System.out.println("정수로된 박스의 부피" + dvol);
	}

}
