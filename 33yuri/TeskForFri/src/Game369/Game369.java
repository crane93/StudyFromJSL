package Game369;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game369 extends JFrame {
	public Game369() {
		setTitle("369게임 혼자하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Start s = new Start(0);
		setContentPane(s);
		setSize(300, 300);
		setVisible(true);
	}

	class MyLabel extends JLabel{
		JLabel number;
		int value;

		public MyLabel(int value) {
			super(Integer.toString(value));
			this.value = value;
			this.setFont(new Font("TimesRoman", Font.ITALIC, 50));
			this.setHorizontalAlignment(number.CENTER);

			try {
				Thread.sleep(700);
				for(int i = 1 ; i<1000 ; i++) {
					if(i%3 == 0) {
						addMouseListener(new MouseAdapter() {
							public void mouseClicked(MouseEvent e) {
								if(e.getClickCount()==1) {
									
								}
							}
						}
					}
				}

			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}

	class Start extends JPanel {
		JButton btn;

		public Start(int value) {

			btn = new JButton("start");
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {

				}

			});
			add(btn);
		}
	}

	public static void main(String[] args) {
		new Game369();
	}

}
