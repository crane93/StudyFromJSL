package chapter01;
import java.util.*;
public class Test1210 {

	public static void main(String[] args) {
	
	int hap = 0, count = 1;
	while(count <= 10)
	{
		hap = hap + count;
		count++;
	}
	System.out.println("1부터 10까지의 합은 " + hap);
	
	
	
	/*
	Scanner stdin = new Scanner(System.in);
	System.out.println("원하는 단을 입력하시오: ");
	int dan = stdin.nextInt();
	int x = 1;
	while(x<=9)		만약 20단을 만들고 싶으면 9대신 dan을 입력하면 된당
	{
		System.out.println(dan + "*"+x+"=" + dan*x );
		x++;
	}
	*/
	
	
	
	
	/*
	Scanner stdin1 = new Scanner(System.in);
	System.out.println("원하는 팩토리얼값을 입력: ");
	int fac = stdin1.nextInt();
	int facValue = fac;
	while(fac > 1)
	{
		System.out.print(fac + "*");
		facValue *= --fac;
		
	}
	System.out.println("1="+facValue);
	*/
	
	
	
	int hap1 = 0, count1 = 1;
	do		//while과 다른점은 do는 무조건 한번은 실행하게해줘 실행하고 나서 while의 조건으로 검사한다
	{
		hap1 = hap1 + count1;
		count1++;	
	}while(count1 <= 10);
	System.out.println("1부터 10까지의 합은 " + hap);
	
	
	/*
	Scanner stdin2 = new Scanner(System.in);
	int month;
	do {
		System.out.print("월을 입력하세요(끝:0): ");
		month = stdin2.nextInt();
		if(3<=month && month <= 5)
			System.out.println("봄입니다");
		else if(6<=month && month <= 8)
			System.out.println("여름입니다");
		else if(9<=month && month <= 11)
			System.out.println("가을입니다");
		else if(1 == month || 2 == month || 12 == month)
			System.out.println("겨울입니다");
		else if(month !=0 )
			System.out.println("잘못된 입력: 해당되는 계절이 없어");
		}while(month !=0 );		0입력전에는 프로그램이 계속 실행된다, 0을 입력하면  0!=0 >>false라서 탈출함
		System.out.println("땡큐");
		*/
	
	
	int i, sum1 = 0;
	for(i = 1; i<=10; i++)	//초기값;조건문;증감식  조건문에 true값을 넣으면 무한반복   초.조.증은 포함 할수도 안할수도있당
		sum1 = sum1 + i;
	System.out.println("1부터 10까지의 합은 " + sum1);
	
	
	/*
	Scanner stdin3 = new Scanner(System.in);
	System.out.print("정수입력: ");
	int num = stdin3.nextInt();
	System.out.println(num + "의 약수: ");
	for(int i1 = 1; i1 <= num; i1++)
	{
		if(num % i1 == 0)
			System.out.print(i1 + " ");
	}
	*/
	
	
	/*
	int i2 = 2;
	while(i2<=9)
	{
		System.out.println("***" + i2 + "단 ***");
		for(int j=1; j<=9;j++)
		{
			System.out.println(i2 + "*" + j +" = " + i2*j);
			
		}
		System.out.println();		//g한칸 띄운다는 뜻ㅎ
		i2++;
	}
	
	*/
	
	/*
	//역삼각형만들기
	Scanner stdin4 = new Scanner(System.in);
	System.out.print("원하는 숫자를 입력해시오");
	int num1 = stdin4.nextInt();
	int i3 = 1;
	while(i3 <= num1)
	{
		int j1 = num1;		
		while(i3 <= j1 )
		{
			System.out.print("*");
			j1--;
		}
		System.out.println();
		i3++;
	}
	*/
	
	
	
	
	/*
	int num4;
	int sum4 = 0;
	boolean flag = true;
	Scanner scanner = new Scanner(System.in);
	System.out.println("합계를 구할 숫자를 입력 (끝내려면 0을 입력)");
	while(flag) {
		System.out.print(">>");
		String tmp = scanner.nextLine();
		num4 = Integer.parseInt(tmp);
		
		if(num4!=0) {
			sum4 += num4;
		}	
		else {
			flag = false;
		}
	}
	System.out.println("합계: " + sum4);
	*/
	
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
	
	/*
	for(int i9 = 1; i9 <=100; i9++)
	{
		System.out.printf("i9 =%d", i9);
		
		int tmp1 = i9;
		do {
			if(tmp1%10%3==0 && tmp1%10!=0)
				System.out.print("짝");
		}while((tmp1/=10) != 0);
		System.out.println();
	}
	*/
	
		
	}

}
