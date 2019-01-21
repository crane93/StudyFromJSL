package chapter01;
import java.util.*;
public class 배열6 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int[][] score = new int[4][4]; 		//4행4열의 2차원 배열을 만들겠다~
		for(int i = 0; i<4;i++)
		{
			for(int j = 0; j<4;j++)
			{
				score[i][j] = ran.nextInt(10);		//랜덤함수로 뽑아낸 0부터 9까지의 수가 배열에 들어간닷	
			}
		}
		for(int k = 0; k<4;k++)		//각 행의 값을 더하자
		{
			int sum = 0;
			for(int value: score[k])	//score[0]은 0행렬만 데려온다
			{
				System.out.print(value+" ");
				sum = sum + value;
			}
			System.out.println("의 합계는 " + sum);
		}

	}

}
