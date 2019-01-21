import java.awt.*;
import javax.swing.*;


class MyShow extends JFrame{
	
	MyShow(){			//생성자에 포함시켜서 실행시킬때 부터 이 기능 갖고 태어난다
		setTitle("제목입니다");		//타이틀의 이름은 setTitle 또는 new JFrame("oo")으로도 가능
		setSize(300,500);		//틀의 사이즈를 지정
		setResizable(false);		//틀의 사이즈 조정 못하게함
		setLocation(200, 200);	//위치를 지정, 비지블 위에 있어야함
		setVisible(true);		//틀을 보이게 함 ㅎ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
public class MyAPP {

	public static void main(String[] args) {
		
		MyShow ms = new MyShow();
		
//		JFrame jf = new JFrame();	//틀을 만들었습니당
//		
//		jf.setTitle("제목입니다");		//타이틀의 이름은 setTitle 또는 new JFrame("oo")으로도 가능
//		jf.setSize(300,500);		//틀의 사이즈를 지정
//		jf.setResizable(false);		//틀의 사이즈 조정 못하게함
//		jf.setLocation(200, 200);	//위치를 지정, 비지블 위에 있어야함
//		jf.setVisible(true);		//틀을 보이게 함 ㅎ
//		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//창을 닫으면 메모리에서 지우겠다는 뜻 ㅎ , GUI만들 때 꼭 넣어줘야할것!
//		
	}

}
