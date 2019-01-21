package chapter01;

public class 유효범위와연관된변수사용예 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1, b  = 2;
		{
			int c = 3, d = 4;	//요 두 아이는 선언된 블록내에서만 사용 가능해영
			System.out.println(a+b);
			System.out.println(c+d);
		}
		System.out.println(a+b);
		//System.out.println(c+d);  실행할려구 하면 오류 ㅠ
		
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum = sum+i;
			System.out.println(i);
		}
		//System.out.println(i);	i는 for문 안에서만 유효하다굿!
	}

}
