package Graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Graphic.GraphicsClipEx.MyPanel;

import java.util.*;

public class GraphicsDrawLineMouseEx extends JFrame {
	Container contentPane;

	public GraphicsDrawLineMouseEx() {
		setTitle("드로우라인 바이 마우스 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel p = new MyPanel();
		contentPane.add(p, BorderLayout.CENTER);
		setSize(300, 400);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		Vector<Point> vs = new Vector<Point>();
		Vector<Point> ve = new Vector<Point>();

		Point starP = null;
		Point endP = null;

		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					starP = e.getPoint();
				}

				public void mouseReleased(MouseEvent e) {
					endP = e.getPoint();
					vs.add(starP);
					ve.add(endP);
					repaint();
				}
			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			for(int i=0;i<vs.size();i++) {
				Point s = vs.elementAt(i);
				Point e = ve.elementAt(i);
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
				
			}
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawLineMouseEx();
	}

}
