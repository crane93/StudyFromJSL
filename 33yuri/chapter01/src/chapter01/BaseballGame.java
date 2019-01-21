package chapter01;
import java.util.*;
public class BaseballGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c[] = new int[3];
		for(int i=0;i<c.length;i++)
		{
			c[i] = (int)(Math.random() * 9)+1;
			for(int j=0;j<i;j++)
			{
				if(c[j] == c[i])
					{
					i--;
					break;
					}
			}
		}
		//for(int i = 0; i<c.length;i++)
			//System.out.println(c[i] + " ");
		//여기까지 컴퓨터가 만든 수
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("중복없이 세자리 숫자를 입력: ");
		for(int i = 0;i < 3; i++)
			mine[i] = sc.nextInt();
				
		*/
	}

}

/*
 * int Lotto[] = new int[6];
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
 */
