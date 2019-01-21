package Pachinco;

public class PachincoNumber {
	public static void main(String[] args) {
		int[] number = new int[3];
		for(int i=0;i<number.length;i++) {
			number[i] = (int)(Math.random()*3+1);
		}
		if(number[0] == number[1] && number[0] == number[2] && number[1] == number[2]) 
			System.out.println("당첨");
	
		else
			System.out.println("꽝");
	}
}
