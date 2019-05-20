package InputOutput;

import java.util.*;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름: ");
		String name = sc.nextLine();
		System.out.println("직업: ");
		String job = sc.nextLine();
		System.out.println("학번: ");
		int num = sc.nextInt();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
	}

}
