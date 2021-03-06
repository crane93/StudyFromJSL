package Thread;

import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

import javax.swing.*;

public class DigitalClockFrame extends JFrame{
	
	public static void main(String[] args) {
		new DigitalClockFrame();
	}
	
	public DigitalClockFrame() {
		setTitle("디지털 시계 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new MyLabel());
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyLabel extends JLabel implements Runnable{
		boolean bPaused = true;
		Thread timerThread = null;
		public MyLabel() {
			setText(makeClockText());
			setFont(new Font("TimesRoman", Font.ITALIC,50));
			setHorizontalAlignment(JLabel.CENTER);
			timerThread = new Thread(MyLabel.this);
			timerThread.start();
		}
		
		public String makeClockText() {
			Calendar c = Calendar.getInstance();
			int hour = c.get(Calendar.HOUR_OF_DAY);
			int min = c.get(Calendar.MINUTE);
			int second = c.get(Calendar.SECOND);
			
			String clockText = Integer.toString(hour);
			clockText = clockText.concat(":"); 		//concat은 문자와 문자를 연결해주는것
			clockText = clockText.concat(Integer.toString(min));
			clockText = clockText.concat(":");
			clockText = clockText.concat(Integer.toString(second));
			
			return clockText;
		}
		
		public void run() {
			while(true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					return;
				}
				setText(makeClockText());
			}
		}
	}

}
