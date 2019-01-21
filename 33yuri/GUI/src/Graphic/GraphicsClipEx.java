package Graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Graphic.GraphicsDrawImageEx.MyPanel;

public class GraphicsClipEx extends JFrame{
	Container contentPane;
	public GraphicsClipEx() {
		setTitle("클리핑 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel p = new MyPanel();
		contentPane.add(p, BorderLayout.CENTER);
		setSize(300, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		ImageIcon imageIcon = new ImageIcon("images/apple.jpg");
		Image image = imageIcon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(50, 20, 150, 150);
			g.drawImage(image, getWidth(), getHeight(), this);
			g.setColor(Color.BLUE);
			g.setFont(new Font("SanSerif",Font.ITALIC,40));
			g.drawString("Go GOGO", 10, 150);
		}

	}
	public static void main(String[] args) {
		new GraphicsClipEx();
	}

}
