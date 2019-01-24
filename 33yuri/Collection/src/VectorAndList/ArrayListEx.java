package VectorAndList;

import java.util.*;

public class ArrayListEx {
/*벡터와 달리 ArrayList에는 스레드 동기화 기능 없다*/
	public static void main(String[] args) {
		// 문자열만 삽입가능한 ArrayList 컬렉션 생성
		ArrayList<String> a = new ArrayList<String>();

		// 키보드로부터 4개의 이름 입력받아 ArrayList에 삽입
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>> ");
			String s = sc.next();
			a.add(s);
		}

		// ArrayList에 들어 잇는 모든 이름 출력
		for (int i = 0; i < a.size(); i++) {
			// 어레이리스트의 i번째 문자열 얻어오기
			String name = a.get(i);
			System.out.print(name + " ");
		}

		// 가장 긴 이름 출력
		int longestIndex = 0; // 리스트의 요소중에서 가장 긴 이름의 인덱스를 저장할 변수
		for (int i = 1; i < a.size(); i++) {
			if (a.get(longestIndex).length() < a.get(i).length())
				longestIndex = i;
		}
		System.out.println("\n가장 긴 이름은: " + a.get(longestIndex));

	}

}
