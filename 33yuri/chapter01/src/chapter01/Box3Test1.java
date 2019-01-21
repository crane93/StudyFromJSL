package chapter01;

class Box3{
	int width;
	int height;
	int depth;
	long idNum;
	static long boxID = 0; 	//static이 붙은건 클래스 변수라고 한다
	public Box3() {
		idNum = ++boxID;
	}
}
public class Box3Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box3 mybox1 = new Box3();
		Box3 mybox2 = new Box3();
		Box3 mybox3 = new Box3();
		Box3 mybox4 = new Box3();

		System.out.println("mybox1의 id번호 : " + mybox1.idNum);
		System.out.println("mybox2의 id번호 : " + mybox2.idNum);
		System.out.println("mybox3의 id번호 : " + mybox3.idNum);
		System.out.println("mybox4의 id번호 : " + mybox4.idNum);	//객체의 Num이 증가되면서 출력
		System.out.println("마지막 생성된 박스 번호는 " + Box3.boxID );	//객체명에 통하여 클래스변수에 직접 접근 가능하다


	}

}
