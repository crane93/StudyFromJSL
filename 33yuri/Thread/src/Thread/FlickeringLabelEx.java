package Thread;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FlickeringLabel extends JLabel implements Runnable{
	public FlickeringLabel(String text) {
		super(text);	//JLabel의 생성자 호출
		setOpaque(true);	//배경색 변경이 가능하도록 설정 ㅎ
		
		Thread th = new Thread(this);
		th.start();		//쓰레드를 호출하기 위해 start를 쓴다
	}
	
	public void run() {
		int n=0;
		while(true) {
			if(n==0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			if(n==0) n =1;
			else n=0;
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}
public class FlickeringLabelEx extends JFrame{
	public FlickeringLabelEx() {
	setTitle("FlickeringLabelEx 예제");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	
	FlickeringLabel fLabel = new FlickeringLabel("깜빡");
	JLabel la = new JLabel("안깜빡");
	FlickeringLabel fLabel1 = new FlickeringLabel("나도 깜빡");
	
	c.add(fLabel1);
	c.add(la);
	c.add(fLabel);
	
	setSize(300, 150);
	setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlickeringLabelEx();
	}

}
