package chapter01;
import java.util.*;
public class 배열3 {

	public static void main(String[] args) {
		
		int score[] = {88,89,57,52,88,96,99,100};
		int max = score[0];	
		for(int i: score)
			//확장된 for문이다 스코어배열의 값이 i에 순서대로 쏙쏙 들어간당
			//기존 for문은 for(int i = 0;i <score.length ; i++)
		{
			if(i>max)
				//기존의 for문을 사용할때 if(score[i]>max)
				max = i;
				//max = score[i];
		}	
		System.out.println("배열 요소의 최대값은 " + max);
		//간단!

	}

}
