package chapter01;
import java.util.*;


public class 배열4 {

	public static void main(String[] args) {
		
		int num1[] = {10, 20,30};
		int num2[] = {40,50,60};
		System.out.println(num2[2]);
		num2 = num1;	//주소공유 ㅗㅜㅑ
		num2[2] = 200;	//주소 공유중이야 num2에서 값 바꾸면 num1도 영향이 간다
		
		System.out.print("num1 배열의 값: ");
		for(int i: num1)
			System.out.print(i + " ");
		System.out.print("\nnum2 배열의 값: ");
		for(int i:num2)
			System.out.print(i + " ");
		int num3[] = {100,200,300};
		int num4[] = {400,500,600};
		for (int i=0;i<num3.length;i++)
			num4[i] = num3[i]; 	//배열요소의 값을 복사, 주소는 따로임
		num4[2] = 999;
		System.out.print("\nnum3배열의 값: ");		//num4가 변해도 난 상관없음
		for(int i:num3)
			System.out.print(i + " ");
		System.out.print("\nnum4배열의 값: ");
		for(int i : num4)
			System.out.print(i+" ");
		
		
		
	}

}
