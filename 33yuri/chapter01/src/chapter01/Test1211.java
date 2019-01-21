package chapter01;
import java.util.*; 
public class Test1211 {
	
	public static void main(String[] args) {
		
		/*
		Scanner stdin = new Scanner(System.in);
		System.out.println("합계를 원하는 정수를 입력: ");
		int num = stdin.nextInt();
		int sum = 0, i = 1;
		while(true) {	//트루는 무한반복이라는 뜻 ㅎ
			sum = sum +i;
			if(i == num) break;	//i값이 사용자가 입력한 값과 같으면 반복을 벗어난다
			i++;
			
		}
		System.out.println(num+"까지의 합계는 = " + sum);
		*/
		
		
		/*
		int i1, j1;
		for(i1=1; i1<10;i1++)
		{
			for(j1=1;j1<i1;j1++)
			{
				if(j1>6) break;		//j1값이 6보다 크면 빠져나간다, 실행 안한다는 뜻ㅎ
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		/*
		Scanner stdin1 = new Scanner(System.in);
		System.out.println("원하는 정수 입력(짝수의 합): ");
		int num1 = stdin1.nextInt();
		int i2, sum2 = 0;
		for(i2=1; i2<=num1; i2++)
		{
			if(i2%2==1)continue;		//i2값이 홀수값이면 더하지 않고 for문의 처음으로 돌아라가는 뜻 ㅎ, 브레이크는 멈추는 거고 컨티뉴는 처음으로 돌아가라
			sum2 = sum2 + i2;
		
		}
		System.out.println("1부터 num2까지의 짝수의 합 = " + sum2 );
		*/
		
		
		int i3, j3;
		Outer : for(i3 = 2; i3<=9; i3++)
		{
			System.out.println("==" + i3 + "단 ==");
			for(j3 = 1; j3<=9; j3++)
			{
				if(j3 == 3) continue Outer;		//만약에 outer가 없으면 continue는 바로 위의 for(j~~)로 돌아간다 outer라는 인덱스가 있으니까 continue로 돌아간다
				System.out.println(i3 + "*" + j3 + "=" + i3*j3);
			}
		}
		
		
		
		
		
	}

}
