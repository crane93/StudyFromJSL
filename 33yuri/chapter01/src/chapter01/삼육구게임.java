package chapter01;
import java.util.*;
public class 삼육구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[] = {"박수한번", "박수두번"};
		
		int res, num, numberOf369=0;
		for(int i =0;i<100;i++)
		{
			num = i;
			for(res = num%10;num>=1;res=num%10)
			{
				if(res==3||res==6||res==9)
					
					numberOf369++;
					num = num/10;
					
				
			}
			if(numberOf369>0)
				System.out.println(i + str[numberOf369-1]);
				numberOf369 = 0;
				
		}

	}

}
