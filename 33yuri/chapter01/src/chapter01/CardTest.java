package chapter01;

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
	
}
public class CardTest {

	public static void main(String[] args) {

	System.out.println("Card.width = " + Card.width ); 	//클래스변수(static변수)는 객체생성없이 클래스이름.클래스변수로 직접사용가능, 이미 메모리 할당되있음ㅎ
	System.out.println("Card.height = " + Card.height);
	
	Card c1 = new Card();
	c1.kind = "Heart";
	c1.number = 7;
	
	Card c2 = new Card();
	c2.kind = "Spade";
	c2.number = 4;
	
	System.out.println("c1은 " + c1.kind + "," + c1.number + "이며, 크기는 (" + c1.width + "," + c1.height + ")");
	System.out.println("c2은 " + c2.kind + "," + c2.number + "이며, 크기는 (" + c2.width + "," + c2.height + ")");
	
	System.out.println("c1의 넓이와 높이를 각각 50,80으로 변경한다");
	c1.width = 50;
	c1.height = 80;
	
	System.out.println("c1은 " + c1.kind + "," + c1.number + "이며, 크기는 (" + c1.width + "," + c1.height + ")");
	System.out.println("c2은 " + c2.kind + "," + c2.number + "이며, 크기는 (" + c2.width + "," + c2.height + ")");

			
	}

}