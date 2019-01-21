package chapter01;
import java.util.*;
public class 배열7 {

	public static void main(String[] args) {
		
		int twoD[][] =  new int[4][];
		twoD[0] = new int[1];		//각 행에 해당하는 1차원배열생성 , 한칸 두칸 세칸 네칸임 ㅎ
		twoD[1] = new int[2];
		twoD[2] = new int[3];
		twoD[3] = new int[4];
		System.out.println("2채원 배열에서 행의 길이는: " + twoD.length);
		System.out.println("첫번째 행의 요소 수는: " + twoD[0].length);
		System.out.println("두번째 행의 요소 수는: " + twoD[1].length);
		System.out.println("세번째 행의 요소 수는: " + twoD[2].length);
		System.out.println("네번째 행의 요소 수는: " + twoD[3].length);
		int i, j, k = 0;
		for(i = 0;i<twoD.length;i++)
			for(j=0;j<twoD[i].length;j++)
			{
				twoD[i][j] = k;		//각 행에 값을 집어넣는중 ㅎ
				k++;
			}
		for(i=0; i<twoD.length;i++)
		{
			for(int val:twoD[i])
				System.out.print(val + " ");	//각 행을 출력해봅시다
			System.out.println();
		}
	}

}
