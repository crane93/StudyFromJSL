package chapter01;

import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class Test1207 {

	public static void main(String[] args) {
		
		/*
		Scanner stdin = new Scanner(System.in);
		System.out.print("한 개의 숫자를 입력: ");
		int count = stdin.nextInt();
		if(count < 0)		//만일 이 문장 끝에 ;을 찍는다면 아래의 문장과는 별개의 문장이 된다  무슨 숫자를 입력하던 무조건 아래 문장이 출력된다
			System.out.println(count + "는 음수입니다");
		*/
		
		
		/*
		Scanner stdin1 = new Scanner(System.in);
		System.out.print("성적을 입력하세요: ");
		int grade = stdin1.nextInt();
		if(grade >=90)
			System.out.println("A학점 취득 성공");
		else
			System.out.println("A학점취득 실패");
		System.out.println("감사합니다");	//조건과 상관없이 무조건 실행
		*/
		
		
		/*
		Scanner stdin2 = new Scanner(System.in);
		System.out.print("성적을 입력하세요:");
		int grade1 = stdin2.nextInt();
		if(grade1 >= 90)
			System.out.println("A학점취득");
		else if(grade1 >= 80)
			System.out.println("B학점취득");
		else if(grade1 >= 70)
			System.out.println("C학점취득");
		else if(grade1 >= 60)
			System.out.println("D학점 취득");
		else 
			System.out.println("학점취득 실패");
		*/
		
		
		/*
		Scanner stdin3 = new Scanner(System.in);
		System.out.print("성적을 입력하세요:");
		int score = stdin3.nextInt();
		if(score >= 80)
		{
			System.out.println("우수학점군에 속합니다");
			if(score >= 90)
			System.out.println("A학점입니당");
			else
				System.out.println("B학점");
		}
		else
		{
			if (score >= 60)
			{
				System.out.println("보통학점군에 속합니다");
				if (score >=70 )
				System.out.println("C학점");
				else
				System.out.println("D학점");
			}
			else
				System.out.println("학점취득 실패");
		}
		*/
		
		
		/*
		Scanner stdin4 = new Scanner(System.in);
		System.out.print("월을 입력해:");
		int month = stdin4.nextInt();
		if(3 <= month && month <= 5)
			System.out.println("봄");
		else if(6 <= month && month <= 8)
			System.out.println("여름");
		else if(9<= month && month <= 11)
			System.out.println("가을");
		else if (1 == month || 2 == month || 12 == month)
			System.out.println("겨울");
		else 
			System.out.println("해당하는 계절 없어");
		*/
		
		
		/*
		Scanner stdin5 = new Scanner(System.in);
		System.out.print("월을 입력하세요: ");
		int month1 = stdin5.nextInt();
		String MtoS;
		switch(month1)
		{
			case 12:
			case 1:
			case 2:
				MtoS = "겨울";
				break;		//swich문을 빠져나간다 아니면 다음문장으로 못넘어가
				
			case 3:
			case 4:
			case 5:
				MtoS = "봄";
				break;
			case 6:
			case 7:
			case 8:
				MtoS = "여름";
				break;
			case 9:
				System.out.println("멋진 9월과 ");
			case 10:
				System.out.println("아름다움 10월과 ");
			case 11:
				System.out.println("낙엽의 11월과 ");
				MtoS = "가을입니다";
				break;
			default:		//1~12의 숫자가 아닐경우 수행
				MtoS = "1~12월을 벗어난 달입니다";
				break;
		}
		
		System.out.println(MtoS);
			
		*/		
				
		
		/*
		int score1 = 0;
		char grade = ' ', opt = '0';
		System.out.print("점수를 입력해 >");
		Scanner scanner = new Scanner (System.in);
		score1 = scanner.nextInt();
		System.out.printf("당신의 점수는 %d입니다 %n", score1);
		
		if (score1 >= 90)
		{
			grade = 'A';
			if (score1 >= 98)
				opt = '+';
			else if (score1 < 94)
				opt = '-';	
		}
		else if(score1 >= 80)
		{	grade = 'B';
			if (score1 >= 88)
				opt = '+';
			else if (score1 < 84)
				opt = '-';	
		}
		else
			grade = 'C';
			
		System.out.printf("당신의 학점은 %c%c입니다 %n", grade, opt);
		*/
		
		/*
		System.out.print("당신의 주민번호를 입력해. (011231-11112222)>");
		
		Scanner scanner1 = new Scanner(System.in);
		String regNo = scanner1.nextLine();
		
		char gender = regNo.charAt(7);
		
		switch (gender)
		{
		case '1': case '3':
			System.out.println("남자");
			break;
		case '2': case '4':
			System.out.println("여자");
			break;
		default:
			System.out.println("유효하지 않은 주민번호");
		}
		*/
		
		
		
	}
		
		
		
}
		

	

