package JavaIO;

import java.io.*;		//입력과 출력
import java.net.*;		//네트웍

public class Ex01 {

	public static void main(String[] args) throws Exception {				//1예외로 던진다 2. try catch를 쓴다
		InetAddress ia = InetAddress.getByName("www.jslhrd.com");		//이름값으로 객체를 생성하겠다
		InetAddress ic[] = InetAddress.getAllByName("www.naver.com");	//네이버같은 머기업은 ip가 여러개야 디도스공격같은거 대비하기 위함이지 그래서 그 아이피주소를 다 알아내고 싶으면 배열로 저장해서 for문 돌리자
		InetAddress ib = InetAddress.getLocalHost();
		System.out.println(ib.getHostAddress());		//나의 호스트주소
		System.out.println(ib.getHostName());			//나의 이름
		System.out.println(ia.getHostAddress());		//주소값만 추려내겠다  >>결과:ip주소나옴
		
		for(int i =0;i<ic.length;i++) {
			System.out.println(ic[i].getHostAddress());
			System.out.println(ic[i].getHostName());		
			//사실 몇개 더 잇는데 안알랴줌
		}
		
	}

}
