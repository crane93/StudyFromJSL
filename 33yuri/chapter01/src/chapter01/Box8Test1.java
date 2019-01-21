package chapter01;


class Box8{
	int width;
	int height;
	int depth;
	public Box8(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	void volume() 		// void는 값을 반환하지 않음, int는 정수로 더블은 실수로 반환한다는 뜻ㅎ
	{
		int vol = width *height * depth;
		System.out.println(vol);
		//return vol;		//메소드 볼륨에서 부피를 계산해서 값을 반환한다 ㅎ
	}
}
public class Box8Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box8 mybox1 = new Box8(10,20,30);
		mybox1.volume();
		//System.out.println("정수 박스의 부피 " + vol1);
	}

}
