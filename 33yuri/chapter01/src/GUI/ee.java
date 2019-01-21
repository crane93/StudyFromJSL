package GUI;

import java.util.Scanner;

public class ee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int oman = 0;
		int man = 0;
		int ochen = 0;
		int chen = 0;
		int obeak = 0;
		int beak = 0;
		int osib = 0;
		int sib = 0;
		int il = 0;

		oman = money / 50000;
		man = money % 50000 / 10000;
		ochen = money % 50000 % 10000 / 5000;
		chen = money % 50000 % 10000 % 5000 / 1000;
		obeak = money % 50000 % 10000 % 5000 % 1000 / 500;
		beak = money % 50000 % 10000 % 5000 % 1000 % 500 / 100;
	}

}
