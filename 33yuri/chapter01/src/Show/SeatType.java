package Show;

import java.util.Scanner;

public class SeatType {
	
	private char type;
	private Seat[] aSeat;	//Seat클래스다
	
	SeatType(char type, int num){
		this.type = type;
		aSeat = new Seat[num];	//무슨 등급좌석의 몇번 좌석이다
		
		for(int i = 0;i<aSeat.length;i++) {
			aSeat[i] = new Seat();
		}
	}
	
	
	public boolean reserve() {
		Scanner sc = new Scanner(System.in);
		int seatNum;
		String name;
		show();
		System.out.print("이름: ");
		name = sc.next();
		System.out.println("번호: ");
		seatNum = sc.nextInt();
		
		if(seatNum < 1|| seatNum>aSeat.length) {
			System.out.println("잘못된 좌석번호입니다");
			return false;
		}
		
		if(aSeat[seatNum-1].isOccupied()) {
			System.out.println("이미 예약된 좌석입니다");
			return false;
		}
		aSeat[seatNum-1].reserve(name);
		return true;
	}
	
	
	
	public boolean cancle() {
		Scanner sc = new Scanner(System.in);
		show();
		System.out.println("이름: ");
		String name = sc.next();
		
		if(name != null) {
			for(int i=0;i<aSeat.length;i++) {
				if(aSeat[i].match(name)) {
					aSeat[i].cancel();	//이름을 다시 null값으로~
					return true;
					
				}
			}
			System.out.println("예약자 이름을 찾을 수 없습니다");
		}
		return false;	//예약자 이름을 찾지 못함
	}

	
	
	public void show(){
		System.out.print(type + ">>");
		for(int i =0;i<aSeat.length;i++) {
			if(aSeat[i].isOccupied()) {
				System.out.println(aSeat[i].getName()+"님이 예약하셨습니다");
			}
			else
				System.out.print("___ ");
				
		}
		System.out.println();
	}
}
