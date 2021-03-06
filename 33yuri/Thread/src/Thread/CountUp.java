package Thread;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CountUp extends JFrame {

	public CountUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyLabel(0));
		setSize(300, 300);
		setVisible(true);
	}

	class MyLabel extends JLabel implements Runnable {
		boolean bPaused = true;
		int value;
		Thread timerThread = null;
		

		public MyLabel(int value) {
			super(Integer.toString(value));		//super는 그거다 JLabel의 생성자를 호출하는 것
			this.value = value;
			this.setFont(new Font("TimesRoman", Font.ITALIC, 50));
			this.setHorizontalAlignment(JLabel.CENTER);

			addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					if (timerThread == null) {
						timerThread = new Thread(MyLabel.this);
						timerThread.start();
					} else if (timerThread.isAlive())
						timerThread.interrupt();
					else {
						timerThread = new Thread(MyLabel.this);
						timerThread.start();
					}

				}
			});
		}

		public void run() {
			while (true) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					value = 0;
					setText(Integer.toString(value));
					return;
				}
				value++;
				setText(Integer.toString(value));
			}
		}

	}

	public static void main(String[] args) {
		new CountUp();
	}
}
