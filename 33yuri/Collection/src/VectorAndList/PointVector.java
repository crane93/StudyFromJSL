package VectorAndList;

import java.util.Vector;

class Point{
	private int x,y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")"; 
	}
}
public class PointVector {

	public static void main(String[] args) {
		//Point 객체를 요소로만 가지는 벡터 생성
		Vector<Point> v = new Vector<Point>();
		
		//3개의 포인트 객체삽입
		v.add(new Point(2,3));
		v.add(new Point(-3,30));
		v.add(new Point(4,44));
		
		//벡터에 있는 포인트 객체 모두 검색하ㅕ 출력
		for(int i =0 ; i<v.size();i++) {
			Point p = v.get(i);
			System.out.println(p);	//p.toString()을 이용하여 객체 p출력
					
		}
	}

}
