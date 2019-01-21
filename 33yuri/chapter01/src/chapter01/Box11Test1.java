package chapter01;


class Box11{
	private int ivol;
	private double dvol;
	public Box11(int w, int h, int d) {
		volume(w,h,d);
	}
	public Box11(double w, double h, double d) {
		volume(w,h,d);
	}
	private void volume(int w, int h, int d) {
		ivol = w*h*d;		//외부에서 잘못된 접근을 막기위해 private을 씌워주고, 일단 값은 내놓아야하니까 아래 퍼블릭으로 한번통해서 내놓은다
	}
	private void volume(double w, double h, double d) {
		dvol = w*h*d;
	}
	public int get_ivol() {
		return ivol;
	}
	public double get_dvol() {
		return dvol;
	}
}
public class Box11Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box11 m = new Box11(10,20,30);
		System.out.println("박스의 부피(정수매개변수)" + m.get_ivol());
		
		m = new Box11(10.5,20.5,30.5);
		System.out.println("박스의 부피(실수매개변수)" + m.get_dvol());
		
		m = new Box11(10,20,30.5);
		System.out.println("박스의 부피(정수매개변수)" + m.get_dvol());
	}

}
