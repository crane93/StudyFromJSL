import java.awt.*;
import javax.swing.*;

public class NullContainerEX extends JFrame{
	public NullContainerEX() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(null);
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);
		
		int START_NUMBER=1;
		
//		for(int i=5;START_NUMBER<=i;i--) {
//			JButton b = new JButton(Integer.toString(i));
//			b.setLocation(i*15, (i-START_NUMBER)*15);
//			b.setSize(50,20);
//			c.add(b);
//		}
////		int END_NUMBER = BOTTOM_NUMBER*2-1;
////		for(int j=BOTTOM_NUMBER+1;j<=END_NUMBER;j++) {
////			JButton d = new JButton(Integer.toString(j));
////			d.setLocation(j*15, (END_NUMBER-j+1)*15);
////			d.setSize(50,20);
////			c.add(d);
////		}
		int BOTTOM_NUMBER = 6;
		for(int i=1;i<=BOTTOM_NUMBER;i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15, i*15);
			b.setSize(50,20);
			c.add(b);
		}
		int END_NUMBER = BOTTOM_NUMBER*2-1;
		for(int j=BOTTOM_NUMBER+1;j<=END_NUMBER;j++) {
			JButton d = new JButton(Integer.toString(j));
			d.setLocation(j*15, (END_NUMBER-j+1)*15);
			d.setSize(50,20);
			c.add(d);
		}
		
		setSize(500,200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NullContainerEX();
	}

}
