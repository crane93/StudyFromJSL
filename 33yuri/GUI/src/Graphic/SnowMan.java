package Graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SnowMan extends JFrame{
	Container contentPane;
	public SnowMan() {
		setTitle("Do you wanner build a snowman :)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.add(new Face());
		setSize(500,500);
		setVisible(true);
	}
	
	class Face extends JPanel{
		public void paintComponent(Graphics g) { 
			super.paintComponent(g);
			g.setColor(Color.YELLOW);
			g.fillOval(20, 30, 200, 200);
			g.setColor(Color.BLACK);
			g.drawArc(50, 80, 50, 50, 180, -180);	//-180을 한 이유는 눈썹모양처럼 만들기 위함임, 180찍어보면 어떤의미인지 알것입니다 ㅎ
			g.drawArc(140, 80, 50, 50, 180, -180);
			g.drawArc(95, 130, 100, 90, 180, 180);
		}
	}
	public static void main(String[] args) {
		new SnowMan();
	}

}
