package chapter01;


class Box1{
	int width;
	int height;
	int depth;
}					//3개의 속성을 가진 박스1 클래스 생성
public class BoxTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Box1 myb1 = new Box1();
		Box1 myb2 = new Box1();
		int vol1, vol2;
		
		myb1.width = 30;
		myb1.height = 40;
		myb1.depth = 30;
		
		myb2.width = 50;
		myb2.height = 60;
		myb2.depth = 50;
		
		vol1 = myb1.width * myb1.height * myb1.depth;
		System.out.println("첫번째 박스의 부피는 : " +vol1);
		vol2 = myb2.width * myb2.height * myb2.depth;
		System.out.println("두번째 박스의 부피는 : " +vol2);
	}

}
