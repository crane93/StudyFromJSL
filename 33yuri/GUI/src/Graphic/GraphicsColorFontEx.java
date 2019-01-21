package Graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicsColorFontEx extends JFrame{
	Container contentPane;
	public GraphicsColorFontEx() {
		setTitle("Color, Font 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel);
		setSize(350,450);
		setVisible(true);
		
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {		//재정의 해서 내가 원하는 걸로 바꾼다 ㅎ
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawString("냥", 30, 30);
			g.setColor(new Color(255,0,0));
			g.setFont(new Font("고딕체", Font.ITALIC,30));
			g.drawString("귀여워~", 30, 60);
			g.setColor(new Color(0x00ff00ff));
			for(int i=0;i<=5;i++) {
				g.setFont(new Font("jokerman",Font.ITALIC, i*10));
				g.drawString("최고야~", 30, 60+i*60);
			}
		}
	}
	public static void main(String[] args) {
		new GraphicsColorFontEx();
	}

}
