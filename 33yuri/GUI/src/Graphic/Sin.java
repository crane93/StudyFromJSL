package Graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sin extends JFrame {
	Container contentPane;

	public Sin() {
		contentPane = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyFrame4());
		setSize(300, 500);
		setVisible(true);
	}

	class MyFrame4 extends JPanel implements ActionListener {
		boolean flag = false;
		private int light_number = 0;

		public MyFrame4() {
			setLayout(new BorderLayout());
			JButton btn = new JButton("신호등");
			btn.addActionListener(this);
			add(btn, BorderLayout.SOUTH);
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			//++light_number;
			if (++light_number >= 3) {
				light_number = 0;
			}
			repaint(); // 패인트 컴포넌트 재소환

		}

		public void paintComponent(Graphics g) { // 추상화 메소드임 ㅎ 스펠링에 주의!
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			g.drawOval(100, 100, 100, 100);
			g.drawOval(100, 200, 100, 100);
			g.drawOval(100, 300, 100, 100);

			if (light_number == 0) {
				g.setColor(Color.RED);
				g.fillOval(100, 100, 100, 100);
			} else if (light_number == 1) {
				g.setColor(Color.YELLOW);
				g.fillOval(100, 200, 100, 100);
			} else if (light_number == 2) {
				g.setColor(Color.GREEN);
				g.fillOval(100, 300, 100, 100);
			}

		}

	}

	public static void main(String[] args) {
		new Sin();
	}

}
