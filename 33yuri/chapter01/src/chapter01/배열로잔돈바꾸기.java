package chapter01;
import java.util.*;
public class 배열로잔돈바꾸기 {

	public static void main(String[] args) {
		int[] unit = {50000,10000,5000,1000,500,100,50,10,1};
		int money;
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하시오: ");
		money = sc.nextInt();
		for(int i=0;i<unit.length;i++)
		{
			int res;
			res = money/unit[i];		//unit[i]의 개수 계산
			String str1,str2;
			if(res>0)	//뭔가가 있다는거제?
			{
				if(i<=3)
				{
					str1 = "원권";
					str2 = "매";
				}
				else
				{	
					str1 = "원짜리 동전";
					str2 = "개";
				}	
				System.out.println(unit[i] + str1 + res + str2);
				money = money%unit[i];
			}
		}
		

	}

}
