package chapter01;

public class TestEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[5];
		try {
			for(int i=0;i<=arr.length;i++) {
				System.out.println(arr[i]);
			}
		}catch(Exception e) {
			/*
			 * 배열을 만들때 흔히 하는 실수가 배열의 범위를 벗어나는거야 
			 * 그래서 캐치에 A로 시작하는 긴 오류정의를 적어둬서 오류발생하면 잡어
			 * but 우린 다형성을 배움 ok?
			 * 오류의 어머니인 exception을 써주면 뭐든 ok 
			 */
			System.out.println("배열의 범위를 벗어남");
		}
	}

}
