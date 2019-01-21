package chapter01;

class Document{
	static int count = 0;
	String name;
	Document(){		//생성자는 클래스 이름과 같다, 객체가 만들어질때 자동호출됨, 객체의 초기값을 담당함, 초기값이 있을 땐 
		this("제목없음" + ++count);
	}
	Document(String name){
		this.name = name;
		System.out.println("문서 " + this.name + "가 생성되었슴니다");
	}
}
public class DocumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Document d1 = new Document();
		Document d2 = new Document("자바.txt");	//초기값이 있을 땐 생성자 필수입
		Document d3 = new Document();
		Document d4 = new Document();

	}

}
