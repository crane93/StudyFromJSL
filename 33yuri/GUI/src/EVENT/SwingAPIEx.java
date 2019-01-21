package EVENT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingAPIEx extends JFrame{
	Container c;
	JButton b1, b2, b3, b4;	//버튼 4개 만들거임 ㅎ
	
	SwingAPIEx(){
		this.setTitle("Swing예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();	//getContentpane은 메소드이다  상속받은 JFrame에 있다.  지니어스가 알려주네 ㅋㅋㅋ
		c.setLayout(new FlowLayout());
		b1 = new JButton("위치와 크기 정보");
		b1.addActionListener(new MyButtonListener());
		c.add(b1);		//버튼을 만드는게 중요한게 아니라 만들고 붙여야 보여 ㅎ
		
		b2 = new JButton("모양정보");
		b2.setForeground(Color.magenta);	//버튼내의 텍스트 글자색 변경
		b2.setBackground(Color.YELLOW);
		b2.setOpaque(true);		//오파큐는 배경색 변경가능하도록 설정
		b2.setFont(new Font("고딕체", Font.ITALIC, 30));		//폰트 바꾸기
		b2.addActionListener(new MyButtonListener());
		c.add(b2);
		
		b3 = new JButton("작동하지 않는 버튼");
		b3.setEnabled(false);	//펄스라면 누를 수 없는 버튼이다
		b2.addActionListener(new MyButtonListener());
		c.add(b3);
		
		b4 = new JButton("숨기기 보이기");
		b4.addActionListener(new MyButtonListener());
		c.add(b4);
	
		this.setSize(250, 200);
		this.setVisible(true);
	}
	
	class MyButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//System.out.println("s"); 테스트용 ㅎ
			Object source = e.getSource();		//액션을 가하면 무슨버튼이 눌렸는지 몰라 걍 액션가해진 버튼으로 가자
			
			if(source == b1) {
				System.out.println("버튼 위치의 크기");
				System.out.println("위치: " + b1.getX() + "," + b1.getY());
			}
			else if(source == b2) {
				System.out.println("폰트: "+b2.getFont());
				System.out.println("배경색: " + b2.getBackground());
				System.out.println("글자색: " + b2.getForeground());
			}
			else if(source == b4) {
				if(b3.isVisible()) {
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
				}
				else {
					b1.setVisible(true);
					b2.setVisible(true);
					b3.setVisible(true);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		new SwingAPIEx();
	}

}
