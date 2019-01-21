import java.util.Scanner;

public class Paging {

	/*
	 * Q. A씨는 게시판 프로그램을 작성하고 있다. A씨는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로 주었을 때 총 페이지수를
	 * 리턴하는 프로그램이 필요하다고 한다.
	 * 
	 * 입력 : 총건수(m), 한페이지에 보여줄 게시물수(n) (단 n은 1보다 크거나 같다. n >= 1) 출력 : 총페이지수
	 */
	public static void main(String[] args) {
		int total = 0;
		int onepage = 0;
		int totalpage = 0;
		int share = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("총 건수를 입력하세요");
		total = sc.nextInt();
		System.out.println("한 페이지에 보여줄 게시물 수를 입력하세요(1이상)");
		onepage = sc.nextInt();

		totalpage = total / onepage;
		share = total % onepage;

		if (total >= onepage)
			System.out.println("총 페이지 수는 " + (totalpage + share) + "입니다.");
		else
			System.out.println("총 페이지 수는 1 입니다.");
	}
}

/*	Other solving
 * private int getPagingCount(int totalCnt, int pageCnt){
 * 
 * int cnt = totalCnt / pageCnt;
 * cnt = totalCnt % pageCnt > 0 ? cnt + 1 : cnt;
 * 
 * return cnt; }
 */