package Graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PaintJPanelEx extends JFrame{
	Container contentPane;
	public PaintJPanelEx() {
		setTitle("JPanel paintComponent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(250,200);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {	//오버라이딩 된 부분 java.awt.Graphics는 컴포넌트 그리기에 필요한 도구를 제공하는 객체 
			super.paintComponent(g);
			g.setColor(Color.blue);			
			g.drawRect(10, 10, 50, 50);
			g.drawRect(50, 50, 50, 50);
			g.drawRect(90, 90, 50, 50);
			
		}
	}
	public static void main(String[] args) {
		new PaintJPanelEx();
	}

}
