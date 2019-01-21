package Graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorTest extends JFrame {
	Container contentPane;

	public ColorTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel m = new MyPanel();
		contentPane.add(m);
		setSize(250, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel implements ActionListener {
		JButton btn;
		Color color = new Color(0, 0, 0); // 컬러 객체 생성

		public MyPanel() {
			setLayout(new BorderLayout());
			btn = new JButton("색상변경");
			btn.addActionListener(this); // 처리하는 클래스가 나라서 this
			add(btn, BorderLayout.SOUTH);
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(color); // 위에 검은색 객체하나 만들어놨어 ^^
			g.fillRect(10, 10, 210, 220);
		}

		@Override
		public void actionPerformed(ActionEvent arg0) { // 색상변경 버튼 누르면 칼라를 바꾸고 싶엉~ 여기로 오세요
			color = new Color((int) (Math.random() * 255.0), (int) (Math.random() * 255.0),
					(int) (Math.random() * 255.0));
			repaint(); // 요 아이를 쓰면 위의 페인트 컴포넌트가 다시 호출되요 ^^
		}
	}

	public static void main(String[] args) {
		new ColorTest();
	}

}
