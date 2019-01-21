package chapter01;

class Box10{
	private int width;
	private int height;
	private int depth;
	private int vol;
	private long idNum;
	private static long boxID = 10;
	public Box10(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		idNum = ++boxID;	//생성자에서 아이디넘버에 고유번호를 부여
		volume();
	}
	private void volume() {
		vol = width * height * depth;
	}
	public String getvolume() {
		return idNum + "번 박스의 부피: " + vol;
	}
	public static long getCurrentID() {
		return boxID;
	}

}
public class Box10Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box10 mybox; 	//일단 객체만 선언함
		for(int i =1; i<=5;i++) {
			mybox = new Box10(i,i+1,i+2);
			System.out.println(mybox.getvolume());
		}
		System.out.println("마지막 생선된 박스 번호는 " + Box10.getCurrentID() );
	}

}
