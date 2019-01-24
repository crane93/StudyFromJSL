package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BubbleGameFrame extends JFrame {

	public static void main(String[] args) {
		new BubbleGameFrame();
	}

	public BubbleGameFrame() {
		setTitle("풍선 올리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GamePanel p = new GamePanel();
		setContentPane(p);
		setSize(400, 400);
		setVisible(true);
	}
}

class GamePanel extends JPanel {
	public GamePanel() {
		setLayout(null);
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				BubbleThread BubbleThread = new BubbleThread(e.getX(), e.getY());
				BubbleThread.start();
			}
		});
	}

	class BubbleThread extends Thread {
		JLabel bubble;

		public BubbleThread(int bubbleX, int bubbleY) {
			ImageIcon img = new ImageIcon("a/eyes.jpg");
			bubble = new JLabel(img);
			bubble.setSize(img.getIconWidth(), img.getIconHeight());
			bubble.setLocation(bubbleX, bubbleY);
			add(bubble);
			repaint();
		}

		public void run() {
			while (true) {
				int x = bubble.getX();
				int y = bubble.getY() - 5;
				if (y < 0) {
					remove(bubble); // remove : 이미지가 올라가서 그대로 사라지게 하는것
					repaint(); // 이미지가 계속 생성되야 하니까 리페인트각
					return; // 스레드 종료
				}
				bubble.setLocation(x, y);
				repaint();
				try {
					sleep(200);
				} catch (InterruptedException e) {
				}
			}
		}
	}
}