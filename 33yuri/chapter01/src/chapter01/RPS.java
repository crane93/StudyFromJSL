package chapter01;

import java.util.*;

public class RPS {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.가위 2.바위 3.보 에 해당하는 숫자를 입력");
		
		int rps = sc.nextInt();
		int cc = 0;
		cc = (int)(Math.random() * 100) + 1 ;
/*
		if(cc % 3 ==0 && rps - 1 == 0)
		{
			System.out.println("비겼습니다");
		}
		else if(cc % 3 ==0 && rps - 1 == 1)
		{
			System.out.println("이겼습니다");
		}
		else if(cc % 3 ==0 && rps - 1 == 2)
		{
			System.out.println("졌습니다");
		}
		else if(cc % 3 ==1 && rps - 1 == 1)
		{
			System.out.println("비겼습니다");
		}
		else if(cc % 3 ==1 && rps - 1 == 2)
		{
			System.out.println("이겼습니다");
		}
		else if(cc % 3 ==1 && rps - 1 == 0)
		{
			System.out.println("졌습니다");
		}
		else if(cc % 3 ==2 && rps - 1 == 2)
		{
			System.out.println("비겼습니다");
		}
		else if(cc % 3 ==2 && rps - 1 == 0)
		{
			System.out.println("이겼습니다");
		}
		else if(cc % 3 ==2 && rps - 1 == 1)
		{
			System.out.println("졌습니다");
		}
	*/
		
		
		for(;cc%3 == 0;)
		{
			if(rps - 1 == 0 ) {
				System.out.println("비겼습니다");
			}
			else if(rps - 1 == 1) {
				System.out.println("이겼습니다");
			}
			else
				System.out.println("졌습니당");
			break;
		}
		for(;cc%3 == 1;)
		{
			if(rps - 1 == 1 ) {
				System.out.println("비겼습니다");
			}
			else if(rps - 1 == 2) {
				System.out.println("이겼습니다");
			}
			else
				System.out.println("졌습니당");
			break;
		}
		for(;cc%3 == 2;)
		{
			if(rps - 1 == 2 ) {
				System.out.println("비겼습니다");
			}
			else if(rps - 1 == 0) {
				System.out.println("이겼습니다");
			}
			else
				System.out.println("졌습니당");
			break;
		}
	}

}
