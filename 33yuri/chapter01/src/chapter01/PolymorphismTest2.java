package chapter01;

class Item{
	public int price;
}

class Noodle extends Item{
	public Noodle() {
		price = 2000;
	}
	public String toString() {
		return "국수";
	}
}

class MixNoodle extends Item{
	public MixNoodle() {
		price = 1000;
	}
	public String toString() {
		return "비빔국수";
	}
}

class Wodong extends Item{
	public Wodong() {
		price = 3000;
	}
	public String toString() {
		return "우동";
	}
}

class Buyer{
	private int money;
	public Buyer(int money) {
		this.money = money;
	}
	public void buy(Item it, int count) {	//엌ㅋㅋ 다형성으로 하니께 아래 주석단부분 일일히 쓸 필요 없어짐
		System.out.println(it + "을" + count + "개먹었어"); 
		money = money - it.price*count;
		System.out.println("남은 금액은: " + money);
	}
	/*public void buy(Noodle it, int count) {
		System.out.println(it + "을" + count + "개먹었어"); 
		money = money - it.price*count;
		System.out.println("남은 금액은: " + money);
	}
	public void buy(MixNoodle it, int count) {
		System.out.println(it + "을" + count + "개먹었어"); 
		money = money - it.price*count;
		System.out.println("남은 금액은: " + money);
	}
	*/
}
public class PolymorphismTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer me = new Buyer(2000);
		me.buy((new Wodong()),2);
		me.buy((new Noodle()),1);
		me.buy((new MixNoodle()),1);
	}
}

/*
package chapter01;

class Item{
	public int price;	//price는 아직 0
	
}

class Noodle extends Item{
	public Noodle() {
		price = 2500;	//int를 썼다면 Item에 있는 price와 다르다
	}
	public String toString() {
		return "국수";
	}
}

class MixNoodle extends Item{
	public MixNoodle() {
		price = 3000;		//상동
	}
	public String toString() {
		return "비빔국수";
	}
}

class Wodong extends Item{
	public Wodong() {
		price = 1500;		//상동
	}
	public String toString() {
		return "우동";		//만약에 이게 없으면 클래스 주소값이 찍힌다, 오버라이딩해서 우동으로 출력되게~
	}
}

class Buyer{
	private int money;
	public Buyer(int money) {		//머니가 프라이빗으로 되있어서 접근할려면 퍼블릭 생성자 or 로 가능
		this.money = money;		//입력받은 money를 this머니에 들어감
	}
	
	public void buy(Wodong it, int count) {		//매개변수가 우동이라는 클래스 나중에 메소드 쓰고싶으면 우동클래스를 받으면 된다
		System.out.println(it + "을 " + count + "개 먹었습니다.");
		money = money - it.price * count;
		System.out.println("남은돈은: " + money);
	}
	public void buy(Noodle it, int count) {		
		System.out.println(it + "을 " + count + "개 먹었습니다.");
		money = money - it.price * count;
		System.out.println("남은돈은: " + money);
	}
	public void buy(MixNoodle it, int count) {		
		System.out.println(it + "을 " + count + "개 먹었습니다.");
		money = money - it.price * count;
		System.out.println("남은돈은: " + money);
	}
}
public class PolymorphismTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer me = new Buyer(20000);
		me.buy((new Wodong()), 3);
		me.buy((new Noodle()), 2);
		me.buy((new MixNoodle()), 5);
	}

}*/