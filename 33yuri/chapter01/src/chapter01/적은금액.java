package chapter01;
import java.util.*;
public class 적은금액 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5만원 이상의 금액을 입력하시오");
		int money = sc.nextInt();
		
		int oman = 0;
		int man = 0;
		int ocheon = 0;
		int cheon = 0;
		int obeak = 0;
		
		oman = money / 50000;
		man =  money % 50000 /10000;
		ocheon = money % 50000 % 10000 / 5000;
		cheon = money % 50000 % 10000 % 5000 / 1000;
		obeak = money % 50000 % 10000 % 5000 % 1000 / 500;
		
		System.out.println("5만원 " + oman +"만원 " + man +"5천원 " + ocheon +"천원 " + cheon +"오백원 " + obeak );
		
	 
		
	}

}
