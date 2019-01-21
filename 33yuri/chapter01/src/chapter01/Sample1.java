package chapter01;

class AA{
	public String toString() {
		String a = "이것은 a객체입니다";
		return a;
	}
}
public class Sample1 extends AA{

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		AA a = new AA();
		System.out.println(a);
		System.out.println(a.toString());
	}

}
