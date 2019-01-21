package Graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Graphic.GraphicsDrawImageEx.MyPanel;

public class ClickOnImage extends JFrame{
	Container contentPane;
	public ClickOnImage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.add(new MyPanel());
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		ImageIcon imageIcon = new ImageIcon("images/apple.jpg");
		Image image = imageIcon.getImage();
		int ovalX = 100, ovalY = 100;
		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				/*마우스어뎁터를 쓰면 간단!
				 * 만약 아래처럼 인터페이스인 마우스 리스너를 쓰면 코드가 길어져.. 지저분해...
				 * 근데 마우스 어뎁터는 필요한 메소드만 콕 찝어서 오버라딩하면 되니까 편해 ㅎ
				 * */
				public void mousePressed(MouseEvent e) {
					ovalX = e.getX();
					ovalY = e.getY();
					repaint();
				}
			});
			
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
			g.setColor(Color.GREEN);
			g.fillOval(ovalX, ovalY, (int)(Math.random()*30), (int)(Math.random()*30));
		}

	}
	
	public static void main(String[] args) {
		new ClickOnImage();
	}

}
//
//class MyMouseListener implements MouseListener{
//
//	@Override
//	public void mouseClicked(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void mouseExited(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void mousePressed(MouseEvent e) {
//		int ovalX = e.getX();
//		int ovalY = e.getY();
//	}
//
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}