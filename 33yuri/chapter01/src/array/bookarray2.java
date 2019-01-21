package array;
import java.util.Scanner;

public class bookarray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		book[] library = new book[5];
		
		for(int i = 0; i<library.length; i++) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("책이름을 입력하시오: ");
			String bookName = sc.nextLine();
			System.out.println("저자명을 입력하시오: ");
			String author = sc.nextLine();
			library[i] = new book(bookName, author);
			
		}
		
		for(int j = 0; j<library.length; j++) {
			library[j].showbookInfo();
					
		}
		
		
		/*
		library[0] = new book("태백산맥","조정래");
		library[1] = new book("어린왕자","조정래");
		library[2] = new book("토지","조정래");
		library[3] = new book("대미안","조정래");
		library[4] = new book("자바","조정래");

		
		library[0].showbookInfo();
		*/
	}

}
