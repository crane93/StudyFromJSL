package chapter01;

import java.util.Scanner; //만약 이걸 안쓰면 6번째줄에 x표전구가 뜬다

public class Keyboard1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // in은 표준입력이라는 뜻 ㅎ 그니께 키보드를 쓴다 이말이야~

		System.out.print("당신의 나이는?");
		int age = sc.nextInt(); // next는 입력을 기다린다는 뜻ㅎ

		System.out.print("키미노 나마에와?");
		String name = sc.next();

		System.out.print("당신의 키는?");
		double height = sc.nextDouble();

		System.out.println(name + "님의 나이는 " + age + "살입니다 " + height + "cm입니다");
	}

}

/*
 * 8번째 줄: 처음에 String age = sc.next();이라고 써도 출력은 됐어 하지만 숫자가 아닌 문자로 인식하기 때문에 혹시
 * 사칙연산을 하게 된다면 문제가 생김 처음부터 정수로 정하자구~
 */