package EVENT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ListenerSample extends JFrame implements ActionListener{//액션리스너는 인터페이스야 인터페이스는 뭐다? 추상메소드야 그러니까 임플리멘트받아서 꼭 오버라이딩해줘야함! 

	public ListenerSample() {
		setTitle("EVENT Container");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton jb = new JButton("Action");
		Lbi t = new Lbi();
		jb.addActionListener(t);
		/*
		 * jb.addActionListener()의 괄호 안에 추가하는 방법은 여러가지가 있다
		 * 1. Lbi객체를 만들어서 객체를 괄호에 넣기
		 * 2. 객체 안만들고 괄호에 직접 new Lbi()를 적기
		 * 3. Lbi클래스 안만들고 this넣기
		 */
		
		//jb.addActionListener(this); 	//내가 jb라는 버튼에 액션을 가하면 내가 가지고 있는(this) 클래스인 액션퍼폼드가 실행 된다 
		setLayout(new FlowLayout());
		add(jb);		//F프레임에 add, 만약 플로우 레이아웃 없이 만들고 실행시키면 기본인 보더레이아웃으로 실행된다
		

		setSize(300, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListenerSample();
	}
	@Override
	public void actionPerformed(ActionEvent e) {	//퍄 지니어스가 알아서 추가해줌 ㅎ
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action")) {		//b버튼의  텍스트를 가져와서 단추가 ""라는 문자열과 같다면  이라는 뜻ㅎ
			b.setText("냥");
		}
		else
			b.setText("Action");		//원상태로 돌리기~
		
	}

}

class Lbi implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action")) {		//b버튼의  텍스트를 가져와서 단추가 ""라는 문자열과 같다면  이라는 뜻ㅎ
			b.setText("냥");
		}
		else
			b.setText("Action");		//원상태로 돌리기~
	}
	
}
