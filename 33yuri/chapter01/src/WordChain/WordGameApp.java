package WordChain;

import java.util.*;

class Player{
	String name;
	String word;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String sayWord(){
		Scanner sc = new Scanner(System.in);
		System.out.println("단어를 입력하세요");
		word = sc.next();
		return word;
	}
	
	public boolean succeed(String lastWord) {
		int lastIndex = lastWord.length()-1;
		char lastChar = lastWord.charAt(lastIndex);
		char firstChar = word.charAt(0);
		if(lastChar == firstChar) {
			return true;
		}	
		return false;
	}
}

public class WordGameApp {
	

	public static void main(String[] args) {
				
		
	}

}
