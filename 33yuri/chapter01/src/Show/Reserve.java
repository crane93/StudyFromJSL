package Show;

import java.util.Scanner;

public class Reserve {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		SeatType[] aSeatType = new SeatType[3];
		aSeatType[0] = new SeatType('S', 10);
		aSeatType[1] = new SeatType('A', 10);
		aSeatType[2] = new SeatType('B', 10);

		int choice = 0;
		while(choice !=4 ) {
			int type;
			System.out.println("예약(1), 조회(2), 취소(3), 끝내기(4)");
			choice = sc.nextInt();
			switch(choice){
			case 1:		//예약
				System.out.println("좌석구분  S(1) A(2) B(3)");
				type = sc.nextInt();
				if(type<1||type>3) {
					System.out.println("잘못된 좌석 타입입니다");
					break;
				}
				aSeatType[type-1].reserve();
				break;
			case 2:		//조회
				for(int i=0;i<aSeatType.length;i++) {
					aSeatType[i].show();
				}
				System.out.println("조회를 완료하였습니다");
				break;
				
			case 3:		//취소
				System.out.println("좌석구분 S(1) A(2) B(3) ");
				type = sc.nextInt();
				if(type<1||type>3) {
					System.out.println("잘못된 좌석타입입니다");
					break;
				}
				aSeatType[type-1].cancle();
				break;
				
			case 4:		//끝내기
				
				break;
			
			default:
				System.out.println("잘못입력하셨습니다");
			}
		}
	}

}
