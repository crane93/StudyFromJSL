package chapter01;

public class Sample2 {

	public static void main(String[] args) {	//String []args자체도 이미 배열이다
		// TODO Auto-generated method stub

		/*
		String s1 = args[0];
		String s2 = args[1];
		System.out.println(s1);
		System.out.println(s2);
		*/
		
		System.out.println("매개 변수로 받은 두 수의 합은: " + (args[0] + args[1]));	//args는 String이기 때문에 더하면 문자와 문자의 ppap되기 때문에 1020으로 나온다
		int a = Integer.parseInt(args[0]);	//integer도 클래스매소드라는거~
		int b = Integer.parseInt(args[1]);
		System.out.println("매개 변수로 받은 두 수의 합은 " + (a+b));
	}

}
