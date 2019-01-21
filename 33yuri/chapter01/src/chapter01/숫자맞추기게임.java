package chapter01;
import java.util.*;
public class 숫자맞추기게임 {

	public static void main(String[] args) {
		
		while(true)
		{
		int input = 0, answer = 0 , a =0, b=99;
		answer = (int)(Math.random() * 99);
		Scanner sc = new Scanner(System.in);
		System.out.printf("숫자를 맞춰보세요 %n");
		System.out.print("0과 99사이의 정수를 입력> ");
		
		do {
			input = sc.nextInt();
			
			if(input > answer) {	
				b = input;
				System.out.printf("%d ~ %d의 범위 내에서 작은수로 다시 입력", a,b);
			}
			else if(input<answer) {
				a = input;
				System.out.printf("%d ~ %d의 범위 내에서 큰수로 다시", a,b);
			}
			
		}while(input != answer);		//와일로 검사했을 때 참이면 do다시 돌고 거짓이면 빠져나온다
		System.out.println("정답입니당");
		
		System.out.print("다시 하시겠습니까? y//n");
		String qw = sc.next();
			if(qw.equals("Y") || qw.equals("y"))
			{
			a = 0; b = 99;	//다시 재선언할때는 둘다 세미콜론으로 
			continue;
			}
			else if(qw.equals("N") || qw.equals("n"))
			{
			System.exit(0);
			}
		}
	}

}

/*
int input = 0, answer = 0, count3 = 0;
answer = (int)(Math.random() * 100) + 1 ;//0부터 1사이의 난수발생
Scanner scanner1 = new Scanner(System.in);
do {
	System.out.print("1과 100사이의 정수를 입력> ");
	input = scanner1.nextInt();
	
	if(input > answer) {
		System.out.println("더 작은수로 다시");	
	}
	else if(input<answer) {
		System.out.println("더 큰수로 다시");
	}
	count3++;
}while(input != answer);
	System.out.println("정답");
	System.out.println(count3 + "번만에 맞췄어");
*/	
