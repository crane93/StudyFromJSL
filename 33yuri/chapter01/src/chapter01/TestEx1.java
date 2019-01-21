package chapter01;

class Ha{
	public void a() throws Exception{
	Hb t = new Hb();	//객체를 만들어야
	t.aa();			//aa()메소드를 실핼할 수 있다
	}
}
class Hb{
	public void aa() throws Exception{		
		try {							//오류검사
			throw new Exception();		//강제로 오류발생!
		} catch (Exception e) {			//오류가 발생한다면 잡아준다
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		System.out.println("Hi");		//오류없으면 그냥 실행
	}
}

/*
 * throw: 예외발생
 * throws: 예외전가
 */
public class TestEx1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Ha t1 = new Ha();
		t1.a();
	}

}
