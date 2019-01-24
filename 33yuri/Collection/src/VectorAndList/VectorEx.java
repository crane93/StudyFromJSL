package VectorAndList;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		//정수값만 다루는 제네릭 벡터 생성
		Vector<Integer> v = new Vector<Integer>();	//벡터의 크기 안정하고 생성
		v.add(5);
		v.add(new Integer(4));		
		/*v.add(4)랑 같은 의미입니다 
		 * 일부러 눈에 띄게 이렇게 했는데여
		 * 만약에 제네릭을 안쓰면 new Integer와 같이 형변환을 해줘야해
		 * 4로 입력헤도 → new Integer(4)로 자동 박싱	1.5이후부터 이렇게 가능합니당
		 * 하지만 제네릭은 들어오는 입구부터 정수만 입력하도록 설정했으니까~ㅎㅎ*/ 
		v.add(-1);
		
		v.add(2,100); 	//백터 중간에 삽입하기, 중간에만 삽입가능하다
		
		System.out.println("백터 내의 요소 객체 수 : " + v.size());
		System.out.println("벡터의 현재 용량: " + v.capacity());	//크기를 안정하고 생성하면 기본 용량으로 생성될꺼다
		
		//모든 요소 정수 출력하기
		for(int i = 0;i<v.size();i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		//벡터속의 모든 정수 더하기
		int sum =0;
		for(int i =0; i<v.size();i++) {
			int n = v.elementAt(i);		//지니어스에 의하면 엘레멘트엣 이랑 위의 get이랑 같대
			sum += n;
		}
		System.out.println("벡터속에 있는 정수의 합: " + sum);
	}

}
