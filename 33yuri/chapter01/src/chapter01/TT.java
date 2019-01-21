package chapter01;
import java.util.*;

public class TT {

	public static void main(String[] args) {
		
		int hap1 = 0, i1 = 1;
		do 
		{
			hap1 = hap1 + i1;
			i1++;
		}while(i1<=10);
			System.out.println(hap1);
			
			
			
		double a = 40, total = 40;
		double b = 1.08;
		
		for(int i= 1648; i < 2018; i++)
		{
			total = total * b;
		}
		System.out.println(total);
		
		
		Scanner stdin = new Scanner(System.in);
		System.out.println("현재 가진금액은?");
		double money = stdin.nextDouble();
		
		System.out.println("몇 %의 이율?");
		double rate = stdin.nextDouble();
		
		System.out.println("예금 기간은 몇년?");
		int year = stdin.nextInt();
		
	
		for(int i2 = 1;i2 < year;i2++)
		{
			money = money * rate;
		}
	
		System.out.println(money);
		
		
			
	}

}
