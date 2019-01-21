package chapter01;

class Box4{
	int width;
	int height;
	int depth;
	Box4(int w, int h, int d){
		width = 2;
		height = h;
		depth = d;
	}
}
public class Box4Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box4 mybox1 = new Box4(10,20,30);
		int vol = mybox1.width*mybox1.depth*mybox1.height;
		System.out.println("박스의 부피: " + vol);
	}

}
