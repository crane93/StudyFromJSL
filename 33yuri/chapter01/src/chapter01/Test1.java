package chapter01;

public class Test1 {

	public static void main(String[] args) {
			//if는 예약어라서 변수로 선언 불가
		
		byte a = 127;
		System.out.println("127을 저장한 byte "+ a);
		
		short b = 32767;
		System.out.println("32767을 저장한 short의 값은 "+ b);
		
		int c = 2147483647;
		System.out.println("3657654132을 저장한 int의 값은"+c);
		
		long d = 654687454;
		System.out.println("354685446545을 저장한 long의 값은" + d);
		
		byte e = (byte)128;		//원래 바이트의 범위는 127까지인데 나는 128쓰고싶어~~ 그럼 형변환을 하자. 숫자 앞에 (바이트)를 써보자 그럼 결과는? -128이됨 ㅇㅇ 바이트의 범위가 -128~127인데 128은 뺑돌아서 -128이 된다 129도 마찬가지로 -127이 된다능
		System.out.println(e);
		
		
		int q = 100;
		int w = 0b1100100;
		int r = 0144;
		int t = 0x64;
		System.out.println("10진수 100 = "  + q);
		System.out.println("2진수 0b1100100 = " + w);
		System.out.println("8진수 0144 = " + r);
		System.out.println("16진수 0x64 = " + t);
		System.out.println("2진수 0b111 = " + 0b111);
		System.out.println("8진수 0777 = " + 0777);
		System.out.println("16진수 0xfff = " + 0xfff);
		
		
		char v = 'A';		//'' 작은 따옴표는 문자라는 뜻 ㅎ 
		System.out.println(v + 10);		//char은 아스키코드를 포함한 것이라 더하기 가능! 75로 출력됨
		String h = "A";		//"" 큰따옴표는 문자열이라는 뜻ㅎ
		System.out.println(h + 10); 	//String은 문자열이야 사칙연산 불가능하다 이말이야~ 그럼에도 불구하고 +10같은걸 쓰면 +는 더하기가 아닌 문자의 결합으로 봐서 결과는 A10이 된다
		
		
		System.out.println("\"한국\"");		// 큰 따옴표 꼭 넣고싶어~ 
		System.out.println("한\t국");			// \t는 탭tap키를 누른 효과가 있다    다양한 \역슬래시의 활용을 알고싶다면 피피티로(3장 24번째슬라이드)...
	
	    	
		char ch1 = '\"';
		char ch2 = '대';
		char ch3 = '한';
		char ch4 = '\"';
		char ch5 = '\t';
		char ch6 = '민';
		char ch7 = '국';
		char ch8 = '\n';
		char ch9 = '만';
		char ch10 = '세';
		System.out.println("출력결과 :\n" + ch1+ch2+ch3+ch4+ch5+ch6+ch7+ch8+ch9+ch10);
	
	
		char y = 65;
		char u = 0x41;		//16진수의 41에 해당하는 문자 배정
		char i = 0101;		//8진수 101에 해당하는 문자 배정
		System.out.println(y);
		System.out.println(u);
		System.out.println(i);
		
		
		boolean o = true;		//부올린은 참,거짓만 저장하는 변수
		System.out.println("boolean 변수 o의 값은 :" + o);
		boolean p = 10 > 15;
		System.out.println("부올린 변수 p의 값은: " + p);
		boolean l = o;
		System.out.println("부올린 변수 l의 값은: " + l);
		
		
		int u_price = -300;
		int count = 9;
		System.out.printf("%d원짜리 %d개를 사면 %d원 입니다.\n",300,9,300*9);		//f는 포맷형식을 지정한다는 뜻 ㅎ  앗 c언어에서 봤던거다
		System.out.printf("%10d원짜리 %+10d개를 사면 %10d입니다 \n", u_price, count, u_price * count);
		System.out.printf("10진수 15를 16진수로 출력하면 :%x, 8진수로 출력하면: %o\n", 15, 15);
		System.out.printf("음수값 -10을 %%d로 출력하면 %d\n", -10);
		
		
		
		double m = 5.0;
		double pi = 3.14159;
		
		System.out.printf("반지름이 %f인원의 넓이는 %f입니다 \n", 5.0, 3.14159 * 5.0 *5.0);
		System.out.printf("반지름이 %f인 원의 넓이는 %f입니다\n", m, pi*m*m);
		System.out.printf("반지름이 %e인 원의 넓이는 %e입니다\n", m, pi*m*m);
		System.out.printf("123.456을 %%f로: %f\n", 123.456);
		System.out.printf("123.456을 %%e로: %e\n", 123.456);
		System.out.printf("-123.456을 %%E로: %E\n", -123.456);
		
		
		char chr11 = 'A';
		String name = "홍길동";
		
		System.out.printf("%c\n", 'A');
		System.out.printf("%s\n", "AB");
		System.out.printf("%s\n", "AB CCCCC");
		System.out.printf("%s씨 %s\n%s\n", name, "재미있는 자바언어 ", "열심히 하세요");
	
		
	
	
	
	
	
	
	}
}
