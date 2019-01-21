package chapter01;
import java.util.*;
public class Test1212 {

	public static void main(String[] args) {
	
		Scanner stdin = new Scanner(System.in);
		int i;
		double sum = 0.0, avg;
		double dnum[] = new double[5];	//1차원의 공간이 5개, 형식은 더블인 배열선언
		System.out.println("dnum배열의 길이 : " + dnum.length); 	//.length는 배열의 길이알려주는 함수
		System.out.print("초기화 하지 않음 dnum[]의 값: ");		//초기화 하지 않았다 == 아무것도 입력하지 않은 상태다, 형식이 더블이라 0.0이라 나온다
		for(i = 0; i<dnum.length; i++)
			System.out.print(dnum[i] + " ");	//초기화 하지 않은 배열을 출력 ㅎ
		System.out.println();
		
		for(i = 0; i<dnum.length;i++) {
			System.out.print("dnum["+(i)+"] 번째 데이터 입력: ");
			dnum[i] = stdin.nextDouble();		
		}
		for(i = 0; i<dnum.length;i++) {
			sum = sum + dnum[i];
			System.out.println("배열의 합: " + sum);
			avg = sum / dnum.length;
			System.out.println("배열의 평균값: " + avg);
		}
		
		
		

	}

}
