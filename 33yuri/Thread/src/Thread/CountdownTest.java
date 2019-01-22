package Thread;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CountdownTest extends JFrame{
	private JLabel label;
	
	class MyThread1 extends Thread{
		public void run() {
			for(int i=10;i>=0;i--) {
				try {
					Thread.sleep(1000);		//1000밀리세컨드 = 1초  1초동안 잠재우겠다는 뜻 ㅎ
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				label.setText(" " +i + " ");		//라벨에 숫자 붙이기 ㅎ
			}
		}
	}
	public CountdownTest() {
	setTitle("카운트다운");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	label = new JLabel("Start");
	label.setFont(new Font("궁서", Font.BOLD,100));
	add(label);
	new MyThread1().start();	//스레드를 호출할려고 start를 쓴대 ㅡㅡ
	setSize(300, 200);
	setVisible(true);
	}

	public static void main(String[] args) {
		new CountdownTest();
	}

}
