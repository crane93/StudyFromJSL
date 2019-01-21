package Problem0104;

import java.util.Scanner;

//class ConversationBook{
//	String language;
//	public void inputLanguage() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("언어>> ");
//		language = sc.next();
//	}
//}
//
//class Book extends ConversationBook{
//	int ISBN;
//	String author;
//	String bookname;
//	public void bookinfo() {
//		Scanner s = new Scanner(System.in);
//		System.out.println("ISBN>> ");
//		ISBN = s.nextInt();
//		System.out.println("저자>> ");
//		author = s.next();
//		System.out.println("책 제목>> ");
//		bookname = s.next();
//	}
//	
//}
//
//class Product extends Book{
//	int category;
//	String explain;
//	String maker;
//	int price;
//	public void Productinfo() {
//		Scanner c = new Scanner(System.in);
//		System.out.println("상품종류: 책<1>   회화책<3>");
//		category = c.nextInt();
//		if(category == 1) {
//			Book b = new Book();
//			b.bookinfo();
//		}
//		else {
//			Book b = new Book();
//			b.bookinfo();
//			ConversationBook l = new ConversationBook();
//			l.inputLanguage();
//		}
//
//		System.out.println("상품 설명>> ");
//		explain = c.next();
//		System.out.println("생산자>> ");
//		maker = c.next();
//		System.out.println("가격>> ");
//		price = c.nextInt();
//	}
//	
//	
//	
//}
abstract class Product {
	// int category;
	String explain;
	String maker;
	int price;

	void Productinfo() {
	}
}

class Book extends Product {
	int ISBN;
	String author;
	String bookname;

	void Productinfo() {
		Scanner c = new Scanner(System.in);
		System.out.println("상품 설명>> ");
		explain = c.next();
		System.out.println("생산자>> ");
		maker = c.next();
		System.out.println("가격>> ");
		price = c.nextInt();
	}

	public void bookinfo() {
		Scanner s = new Scanner(System.in);
		System.out.println("ISBN>> ");
		ISBN = s.nextInt();
		System.out.println("저자>> ");
		author = s.next();
		System.out.println("책 제목>> ");
		bookname = s.next();
	}

}

class ConversationBook extends Book {
	String language;

	public void inputLanguage() {
		Scanner sc = new Scanner(System.in);
		System.out.println("언어>> ");
		language = sc.next();
	}
}

class CompactDisc extends Product {
	String discname;
	String singername;

	void Productinfo() {
		Scanner c = new Scanner(System.in);
		System.out.println("상품 설명>> ");
		explain = c.next();
		System.out.println("생산자>> ");
		maker = c.next();
		System.out.println("가격>> ");
		price = c.nextInt();
	}

	public void discinfo() {
		Scanner a = new Scanner(System.in);
		System.out.println("앨범 제목>> ");
		discname = a.next();
		System.out.println("가수>> ");
		singername = a.next();
	}
}

public class ProductInfo {

	public static void main(String[] args) {

		Scanner sd = new Scanner(System.in);
		while (true) {
			System.out.println("상품 추가<1>, 모든 상품 조회<2>, 끝내기<3> >>");
			int i = sd.nextInt();
			switch (i) {
			case 1:
				int j;
				System.out.println("상품종류  책<1> 음악CD<2> 회화책<3>");
				j = sd.nextInt();
				if (j == 1) {
					Book[] b = new Book[10];
					for (int k = 0; k < b.length; k++) {
						b[k] = new Book();
						b[k].Productinfo();
						b[k].bookinfo();
						System.out.println(b[k]);
					}
				}
				else if (j == 2) {
					CompactDisc[] c = new CompactDisc[10];
					for (int k = 0; k < c.length; k++) {
						c[k] = new CompactDisc();
						c[k].Productinfo();
						c[k].discinfo();
					}
				}
				else if (j == 3) {
					ConversationBook[] s = new ConversationBook[10];
					for (int k = 0; k < s.length; k++) {
						s[k] = new ConversationBook();
						s[k].Productinfo();
						s[k].bookinfo();
						s[k].inputLanguage();
						
					}
				}
				break;
			case 2:
				for(int m=0;m<10;m++) {
				}
				
			case 3:
				break;

			}

		}

	}

}
