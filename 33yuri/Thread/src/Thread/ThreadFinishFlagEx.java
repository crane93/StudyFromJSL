package Thread;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RandomThread extends Thread {
	Container contentPane;
	boolean flag = false; // 스레드의 종료 명령을 표시하는 플래그, true가 종료지시임

	public RandomThread(Container contentPane) {
		this.contentPane = contentPane;
	}

	void finish() { // 스레드 종료 명령을 flag에 표시
		flag = true;
	}

	public void run() {
		while (true) {
			int x = ((int) (Math.random() * contentPane.getWidth()));
			int y = ((int) (Math.random() * contentPane.getHeight()));
			JLabel label = new JLabel("java");
			label.setSize(80, 30);
			label.setLocation(x, y);
			contentPane.add(label);
			contentPane.repaint();
			try {
				Thread.sleep(300);
				if (flag == true) {
					contentPane.removeAll();
					label = new JLabel("finish");
					label.setSize(80, 30);
					label.setLocation(100, 100);
					label.setForeground(Color.RED);
					contentPane.add(label);
					contentPane.repaint();
					return;
				}
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class ThreadFinishFlagEx extends JFrame {
	RandomThread th;

	public ThreadFinishFlagEx() {
		setTitle("ThreadFinishFlagEx 예졔");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		c.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				th.finish(); // 랜덤쓰레드 스레드 종료 명령
			}
		});
		setSize(300, 200);
		setVisible(true);

		th = new RandomThread(c);
		th.start();

	}

	public static void main(String[] args) {
		new ThreadFinishFlagEx();
	}

}
