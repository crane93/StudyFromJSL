package Graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicsDrawStringEx extends JFrame {
	Container contentPane;

	public GraphicsDrawStringEx() {
		setTitle("drawString 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(250, 250);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("졸려", 30, 30);
			g.drawString("하늘만큼 땅만큼", 60, 60);
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawStringEx();
	}
}