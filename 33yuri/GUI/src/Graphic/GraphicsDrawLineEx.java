package Graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicsDrawLineEx extends JFrame{
	Container contentPane;
	public GraphicsDrawLineEx() {
		setTitle("drawLine 사용예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel p = new MyPanel();
		contentPane.add(p, BorderLayout.CENTER);
		setSize(200,200);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) { 
			super.paintComponent(g);
			g.setColor(Color.red);
			//g.drawLine(20, 20, 100, 100);	//선 그리기
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.green);
			g.fillOval(10, 70, 50, 50);
			g.fillArc(10, 190, 50, 50, 0, 270);
			g.setColor(Color.ORANGE);
			int []x = {30,10,30,60};
			int []y = {250,275,300,275};
			g.fillPolygon(x, y, 4);
			
	  }
	}
	public static void main(String[] args) {
		new GraphicsDrawLineEx();
	}

}
