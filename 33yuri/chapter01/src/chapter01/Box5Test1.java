package chapter01;

class Box5{
	int width;
	int height;
	int depth;
	
	public Box5()
	{
		width = 1;
		height = 1;
		depth = 1;
	}
	public Box5(int w) {
		width = w;
		height = 1;
		depth = 1;
	}
	public Box5(int w, int h) {
		width = w;
		height = h;
		depth = 1;
	}
	public Box5(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
		//생성자 오버로딩, 매개변수의 형과 개수가 다르다
	
}
public class Box5Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box5 mybox1 = new Box5();
		int vol = mybox1.width * mybox1.height*mybox1.depth;
		System.out.println("매개변수 없는 박스의 부피" + vol);
		
		mybox1 = new Box5(10);
		vol = mybox1.width * mybox1.height*mybox1.depth;
		System.out.println("매개변수 1개 박스의 부피" + vol);

		mybox1 = new Box5(10,20);
		vol = mybox1.width * mybox1.height*mybox1.depth;
		System.out.println("매개변수 2개 박스의 부피" + vol);
		
		mybox1 = new Box5(10,20,30);
		vol = mybox1.width * mybox1.height*mybox1.depth;
		System.out.println("매개변수 3개 박스의 부피" + vol);
	}

}
