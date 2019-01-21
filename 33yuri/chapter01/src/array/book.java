package array;

public class book {
	private String bookName;
	private String author;
	
	
	public book() {
		
	}
	
	public book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	
	public String getBookName() {	//값을 가져오겠다는 뜻ㅎ
		return bookName;		
	}
	public void setBookName(String bookName) {		//값을 저장하겠다는 뜻 ㅎ
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showbookInfo() {
		System.out.println(bookName + "," + author);
	}
	
}
