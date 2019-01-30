package Thread;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ThreadInterruptEx extends JFrame {
	Thread th;

	public ThreadInterruptEx() {
		setTitle("ThreadInterruptEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Times New Roman", Font.ITALIC, 80));

		TimerRunnable runnable = new TimerRunnable(timerLabel);
		th = new Thread(runnable); // 스레드 생성, 스레드를 생성할때 인자로 runnable을 받을 수 있다
		c.add(timerLabel);

		JButton btn = new JButton("kill Timer");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt(); // 타이머 스레드 강제종료
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false); // 버튼 비활성화

			}

		});
		c.add(btn);
		setSize(300, 150);
		setVisible(true);
	}
	class TimerRunnable implements Runnable {
		JLabel timerLabel;

		public TimerRunnable(JLabel timerLabel) {
			this.timerLabel = timerLabel;
		}

		public void run() {
			int n = 0;
			while (true) {
				try {
					Thread.sleep(1000);
					n++;
					timerLabel.setText(Integer.toString(n));
				} catch (InterruptedException e) {
					return;
				} // 예외가 발생하면 스레드 종료
			}
		}
	}

	public static void main(String[] args) {
		new ThreadInterruptEx();
	}

}
