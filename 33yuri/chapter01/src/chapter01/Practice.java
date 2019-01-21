package chapter01;
import java.util.*;
public class Practice {

	public static void main(String[] args) {
		
		/*
		int [] score = new int[5];
		int k = 1;
		score[0] = 50;
		score[1] = 60;
		score[k+1] = 70;
		score[3] = 80;
		score[4] = 90;
		
		int tmp = score[k+2] + score[4];
		
		for(int i = 0; i<5;i++)
		{
			System.out.printf("score[%d]:%d%n",i,score[i]);
			
		}
		System.out.printf("tmp: %d%n", tmp);
		//System.out.printf("score[%d]:%d%n\",7,score[7]");  배열의 범위를 벗어난건 다메~
		*/
		
		
		int Lotto[] = new int[6];
		for(int i=0;i<Lotto.length;i++) 
		{
			Lotto[i] =(int)(Math.random() * 45)+1;
			for(int j = 0;j<i;j++)
			{
				if(Lotto[j] == Lotto[i])
					{
					i--;
					break;	//빠져나와서 다시 난수발생
					}
			}
			
			
		
		}
	for(int i=0;i<Lotto.length;i++)
	{
		System.out.print(Lotto[i] +" ");
	}
		
		
		
		//로또코드 배열에 넣고 중복없이
	
		Scanner sc = new Scanner(System.in);
		String qw = sc.next();
		if(qw.equalsIgnoreCase("y") ||qw.equalsIgnoreCase("Y"))
			System.out.print("계속한다");
		
		
	}

}
