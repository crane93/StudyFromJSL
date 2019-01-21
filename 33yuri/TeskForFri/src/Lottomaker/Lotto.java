package Lottomaker;

public class Lotto {

	public static void main(String[] args) {
		int[] number = new int[6];

		for (int i = 0; i < number.length; i++) {
			number[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (number[i] == number[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}
}