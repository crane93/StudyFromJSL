package chapter01;


class Box9{
	private int width;
	private int height;
	private int depth;
	private int vol;		//프라이빗은 클래스 내에서만 접근가능
	public Box9(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		volume();
	}
	private void volume() {
		vol = width * height * depth;
	}
	public int getvolume() {
		return vol;
	}
}
public class Box9Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box9 mybox = new Box9(10,20,30);
		System.out.println("박스의 부피: " + mybox.getvolume());
	}

}
