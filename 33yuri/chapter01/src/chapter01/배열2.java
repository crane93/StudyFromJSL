package chapter01;
import java.util.*;
public class 배열2 {

	public static void main(String[] args) {
		int inum[] = {8,5,5,6,3,5,4,2,4,3,8,7,2};	//배열시작할때부터 값을 넣어버리기~
		Scanner stdin = new Scanner(System.in);
		System.out.print("찾고싶은 숫자 입력:");
		int key =  stdin.nextInt();
		int count = 0;	//횟수를 저장하기 위한 변수선언
		for (int i=0;i<inum.length;i++)
		{
			if(inum[i] == key)
			{
				count++;
				System.out.println((i+1) + "번째 데이터와 일치");
			}
		}
		if(count ==0)
			System.out.println(key + "값은 배열에 없습니당");
		else
			System.out.println(key + " 값은 배열에 " + count + "개 있다");

	}

}
