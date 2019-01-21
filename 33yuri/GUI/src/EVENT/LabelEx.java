package EVENT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LabelEx extends JFrame{
	Container contentPane;
	LabelEx(){
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		JLabel textLaBel = new JLabel("사랑합니다.");
		ImageIcon Heart = new ImageIcon("images/Heart.jpg");
		JLabel imageLabel = new JLabel(Heart);
		ImageIcon normallcon = new ImageIcon("images/Phone.jpg");
		JLabel label = new JLabel("보고싶으면전화하세요",normallcon,SwingConstants.CENTER);
		
		contentPane.add(textLaBel);
		contentPane.add(imageLabel);
		contentPane.add(label);
		
		setSize(400,600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LabelEx();
	}

}
