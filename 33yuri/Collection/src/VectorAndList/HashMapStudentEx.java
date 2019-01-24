package VectorAndList;

import java.util.*;

class Student{	//학생을 표현하는 클래스
	int id;
	String tel;
	public Student(int id, String tel) {
		this.id=id;
		this.tel = tel;
	}
}
public class HashMapStudentEx {

	public static void main(String[] args) {
		//학생이름과 Student 객체를 쌍으로 저장하는 HashMap컬렉션 생성
		HashMap<String, Student> map = new HashMap<String, Student>();
		
		//3명갑니다 주님
		map.put("황기태", new Student(1, "01012122323"));
		map.put("학녀", new Student(2, "01091728429"));
		map.put("김유ㅣ", new Student(3,"0103052030"));
		
		System.out.println("HashMap의 요소 개수: " + map.size());
		
		//모든 학생 출력. map에 들어있는 모든 (key, value)쌍 출력
		//key문자열을 가진 집합 Set컬렉션 리턴
		Set<String> names = map.keySet();
		
		//key문자열을 순서대로 접근할 수 있는 Iterator리턴
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();		//다음 키, 학생이름
			Student student = map.get(name);
			System.out.println(name + ":" + student.id + " " + student.tel);
		}
	}

}
