package VectorAndList;

import java.util.*;

public class HashMapScoreEx {

	public static void main(String[] args) {
		//사용자 이름과 점수를 기록하는 HashMap 컬렉션 생성
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		
		//5개의 점수 저장
		javaScore.put("한홍진", 99);
		javaScore.put("김유리",100);
		javaScore.put("김김김", 3);
		javaScore.put("이이이", 5);
		javaScore.put("송하하", 30);
		
		System.out.println("HashMAp의 요소 개수: " + javaScore.size());
		
		//모든 사람의 점수 출력
		//자바스코어에 들어 있는 모든 (key, value) 쌍 출력
		//key  문자열을 가진 집합 Set 컬렉션 리턴
		Set<String> keys = javaScore.keySet();
		
		//key 문자열을 순서래도 접근할 수 있는 Iterator리턴
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name + ":" + score);
		}
	}

}
