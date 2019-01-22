package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CarGame extends JFrame {
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;

	int x1 = 500, x2 = 500, x3 = 500;

	public CarGame() {
		setTitle("경마게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		label1 = new JLabel();		
		label1.setIcon(new ImageIcon("a/hourse.gif"));		//라벨에 이미지를 붙인다	
		label2 = new JLabel();
		label2.setIcon(new ImageIcon("a/hourse.gif"));
		label3 = new JLabel();
		label3.setIcon(new ImageIcon("a/hourse.gif"));
		label1.setBounds(500, 30, 50, 50);			//x좌표,y좌표,이미지가로크기,이미지세로크기
		label2.setBounds(500, 180, 50, 50);
		label3.setBounds(500, 330, 50, 50);
	
		add(label1);
		add(label2);
		add(label3);
		(new CarThread()).start();		//만들자마자 카스레드 바로 생성하고 start로 돌리자 ㅎ

		setSize(600, 600);
		setVisible(true);
	}

	class CarThread extends Thread {
		public void run() {
			for (int i = 0; i < 120; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				x1 -= (int) (Math.random() * 10);
				label1.setBounds(x1, 30, 100, 100);
				x2 -= (int) (Math.random() * 10);
				label2.setBounds(x2, 180, 100, 100);
				x3 -= (int) (Math.random() * 10);
				label3.setBounds(x3, 330, 100, 100);

			}
		}
	}

	public static void main(String[] args) {
		new CarGame();
	}

}
