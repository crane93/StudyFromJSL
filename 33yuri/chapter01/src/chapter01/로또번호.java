package chapter01;
import java.util.*;
public class 로또번호 {

	public static void main(String[] args) {
	
			int num[] = new int[45];
			Scanner sc = new Scanner(System.in);
			while(true)
			{
			for(int i =1;i<7;i++)
			{
				System.out.print(i + "번째 수를 입력하시오(1~45범위내의 정수): ");
				int input = sc.nextInt();
				num[input-1]++;	//배열 자리수에 바로 ++가능
			}
			System.out.print("다시 하시겠습니까? y//n");
			String qw = sc.next();
				if(qw.equals("Y") || qw.equals("y"))
				{
				continue;
				}
				else if(qw.equals("N") || qw.equals("n"))
				{
					for(int j =1;j<=45;j++)
					{
						System.out.print(j + ": ");
						for(int k =1; k<=num[j-1];k++)
						{
							System.out.print("*");
						}
						System.out.println();
					}
				System.exit(0);
				}
			
			}
			

			
	}

	

}
