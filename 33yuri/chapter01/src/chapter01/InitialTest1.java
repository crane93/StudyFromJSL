package chapter01;

class Initial{
	int number;
	double rate;
	String name;	
	int[] score;
	boolean a;
		//속성으로 값을 지정하지 않고 객체 변수만 선언
	public void aMethod(){
		int count;
		System.out.println(number);	//0이 출력될것이다
		
	}
}
public class InitialTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int var1;
		double var2;
		Initial ob1 = new Initial();
		System.out.println(ob1.number);
		System.out.println(ob1.rate);
		System.out.println(ob1.name);
		System.out.println(ob1.score);
		System.out.println(ob1.a);	//부올린은 펄스다
		ob1.aMethod();
		
		
	}

}
