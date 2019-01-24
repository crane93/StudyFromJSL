package VectorAndList;

import java.util.*;

public class HashMapDicEx {

	public static void main(String[] args) {
		//영어 단어와 한글 단어의 쌍을 저장하는 HashMap컬렉션 생성
		HashMap<String,String> dic = new HashMap<String, String>();
		
		//3개의 (key, value)쌍을 dic에 저장
		dic.put("baby", "아기");
		dic.put("ppap","피피에이피");
		dic.put("cat","귀여워~");
		
		//dic 컬렉션에 들어 있는 모든 (key, value) 쌍 출력, 입력한 순서와 상관없이 출력함
		Set<String> keys = dic.keySet();  			//키 문자열을 가진 set 리턴  keyset은 HashMap에 저장된 key값을 다 가져온다는 뜻 메소드에서 반환된 set이 특정 순서를 보장하지 않음
		Iterator<String> it = keys.iterator();		//Iterator타입에 변수를 생성하고 컬렉션마다 Iterator메서드를 값으로 넣을게영
		while(it.hasNext()) {						//데이터가 있을때까지 반복하겠다, hasNext메서드는 iterator의 메서드이다 it변수에 다음 데이터가 있을때까지 실행하겠다 
			String key = it.next();					//next메서드는 다음 데이터를 반환한다
			String value = dic.get(key);
			System.out.println("(" + key + "," + value +")");
		}
		//영어 단어를 입력 받고 한글 단어 검색
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ;i<3;i++) {
			System.out.print("찾고 싶은 단어는? >> ");
			String eng = sc.next();
			System.out.println(dic.get(eng));
			
		}
	}

}
/*정리
 * iterator란 모든 컬렉션클래스에 데이터를 읽을때 사용
 * 	만약 이렇게 표준화가 안된다면 
	모든 컬렉션클래스에 데이터를 읽는 메서드를 일일이 알아야하고 
	각각에 컬렉션에 접근이 힘들어집
	사용법: Iterator타입에 변수를 생성하고 컬렉션마다에 iterator메서드를 값으로 넣습	
 * hasNext메서드는 다음 데이터가 있는지 boolean으로 반환
 * next메서드는 다음요소를 나타냄
 * 
 * iterator에 메서드호출순서: hasNext > Next > remove
*/