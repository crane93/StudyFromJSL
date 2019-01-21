package Graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Graphic.GraphicsDrawLineEx.MyPanel;

public class GraphicsDrawImageEx3 extends JFrame{
	Container contentPane;
	public GraphicsDrawImageEx3() {
		setTitle("drawImage 사용예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel p = new MyPanel();
		contentPane.add(p, BorderLayout.CENTER);
		setSize(300,400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		ImageIcon imageIcon = new ImageIcon("images/apple.jpg");
		Image image = imageIcon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 20, 20, 250, 100, 100, 50, 200, 200, this);
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawImageEx3();
	}

}
