package chapter01;
import java.util.*;

public class Test1206 {
	public static void main(String[] args) {
		
		int a = 5, b = 2;
		int sum = a+b;
		System.out.println("a+b=" + sum);	
		int sub = a-b;
		System.out.println("a-b=" + sub);
		int mul = a*b;
		System.out.println("a*b=" + mul);
		int div=a/b;
		System.out.println("a/b=" + div);
		int mod=a%b;
		System.out.println("a%b=" + mod);
		int c = ++a;
		System.out.println("a의 전위 증가 연산(prefix)=" +c);
		System.out.println(("a 변수의 값: " + a));
		int d = b++;
		System.out.println("b의 후위 증가 연산(postfix)=" +d);
		System.out.println("b 변수의 값 : " + b);
	
		
		
		int a1 = 10;
		int sum2 = ++a1 + ++a1;
		System.out.println(sum2);

		
		
		int a2 = 10;
		System.out.println("(++a2 + ++a2)의 결과는: " + (++a2 + ++a2));
		a2 = 10;		// 앞에서 ++를 붙여놔서 초기화 시켜줘야함 ㅎ
		System.out.println("(++a2 - ++a2)의 결과는: " + (++a2 - ++a2));
		a2 = 10;
		System.out.println("(a2++ + a2++)의 결과는: " + (a2++ + a2++));
		a2 = 10;
		System.out.println("(a2++ - a2++)의 결과는: " + (a2++ - a2++));
		a2 = 10;
		System.out.println("(++a2 + a2++)의 결과는: " + (++a2 + a2++));
		a2 = 10;
		System.out.println("(++a2 - a2++)의 결과는: " + (++a2 - a2++));
		a2 = 10;
		System.out.println("(a2++ + ++a2)의 결과는: " + (a2++ + ++a2));
		a2 = 10;
		System.out.println("(a2++ - ++a2)의 결과는: " + (a2++ - ++a2));
		a2 = 10;
		
		
		
		byte a3 = 20;
		double d1 = 3.14;
		boolean flag;
		flag = a>d1;
		System.out.println("a3가 d1보다 큰가?" + flag);
		flag = a3==20.0f;	//byte형이 float형으로 자동 변환되어 비교
		System.out.println("a가 20.0f와 같은가?" + flag);
		flag = 10!=10.0;	//정수 리터럴 10이 실수로 변환되어 비교  이때만 잠깐 형변환 일어나는거다 ㅎ
		System.out.println("10이 10과 같지 않은가?" + flag);
		flag = 10<=20;	//관계연산자 사용
		System.out.println("10이 20보다 작거나 같은가?" + flag);
		System.out.println("10이 20보다 작은가?" + (10 <20));		//관계연산자를 직접 출력~
		System.out.println("10이 20보다 크거나 같은가?" + (10>=20));
		
		
		
		boolean a4;
		a4 = (20>10)  || (30>40);	//앞의 20>10이 참이라 뒤의 30>40은 보지도 않고 컴터가 트루라고 때려버림
		System.out.println("20이 10보다 크거나 또는 30이 40보다 큰가?" + a4);
		a4 = (20>10) && (30>40);
		System.out.println("20이 10보다 크고 그리고 30이 40보다 큰가?" + a4);
		a4 = !true;
		System.out.println("true의 !(not)은?"+ a4);
		System.out.println("20이 10보다 크거나 또는 30이 40보다 큰가?" + ((20>10) || (30>40)));
		System.out.println("20이 10보다 크고 그리고 30이 40보다 큰가?" + ((20>10) && (30>40)));
		System.out.println("true의 !(not)은?" + (!true));
		
		
		
		int a5 = 10;
		System.out.println("a5 = " +a5);
		a5+=4;
		System.out.println("a5 += 4의 결과 " +a5);
		a5 %=4;
		System.out.println("a5 %=4의 결과" + a5);
		a5 <<= 4;		//비트출력이래 아직 안배움 ㅎ
		System.out.println("a5 <<=4의 결과" + a5);
		boolean b3 = false;
		b3 &= a5>2;
		System.out.println(" b3 &=a5>2의 결과" + b3);
		b3 |= a5>2;
		System.out.println("b3 |=a5>2의 결과" + b3);
		
		
		/*
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("문자를 하나 입력하세요>");
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if(('0'<=ch && ch <='z') || ('A' <= ch && ch <='Z')) {
			System.out.printf("입력하신 문자는 숫자입니다\n");	
		}
		if(('a'<=ch && ch <='z') || ('A' <= ch && ch <='Z')) {
			System.out.printf("입력하신 문자는 영문자입니다\n");	
		}
		*/
		
		/*
		Scanner stdin = new Scanner(System.in);
		System.out.print("한 개의 숫자를 입력: ");
		int a6= stdin.nextInt();	//입력받을 값을 정수로 할거다		
		boolean flag1;
		flag1 = (a6%2 ==0)? true:false;	//3항연산자데스, if문의 전신이랄까
		System.out.print(a6 + "이 짝수입니까?:");
		System.out.println(flag1);
		*/
		
		
		String str1 = "아 대한민국 ";
		String str2 = "korea";
		System.out.println(str1 + str2);
		System.out.println("아 대한민국 \nKorea");
		int a7 = 1000;
		int b4 = 2000;
		System.out.println(str1 + a7 +b4 +"리 금수강산");	// 문자+숫자결합하면 문자로 인식한다
		System.out.println(str1 + (a7+b4) + "리 금수강산");		//난 숫자만 따로 계산하고싶어~  그럼 괄호()안에 숫자를 써주자
		System.out.println(a7 + b4 + "리 금수강산");	//컴퓨터는 왼쪽부터 인식하니께 숫자의 더하기가 먼저 나왔네요? 어? 숫자네? 3000각
		System.out.println('3' + "천리 금수강산");		//'3'같이 ''혼자있을 땐 숫자로~
		System.out.println('3'+2997+"리 금수강산");		//이때의 '3'은 문자로 인식됨 3에 해당하는 아스키코드 51이 되어서 51 + 2997이 된다
		
		
	}
}
