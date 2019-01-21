package EVENT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerEx extends JFrame{
	JLabel la;
	
	public MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPane = new JPanel();	//판떼기를 하나 만들겠다 ㅎ
		setContentPane(contentPane);
		setLayout(null);		//null값으로 주면 버튼의 위치가 지정되지 않은 상태임ㅎ
		contentPane.addMouseListener(new MyMouseListener());
		
		la = new JLabel("Hi");
		la.setSize(50,20);
		la.setLocation(30,30);
		contentPane.add(la);
		setSize(500,300);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener{		
		/*내부클래스이다. 장점은 상위클래스의 객체를 만들때 내부클래스도 객체를 자동 생성한다
		 * 두번 생성할필요 없당*/

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	public static void main(String[] args) {
		new MouseListenerEx();
		
	}

}
