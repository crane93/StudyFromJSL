package EVENT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboActionEx extends JFrame{
	Container contentPane;
	String [] fruits = {"apple","cherrey","pear"};
	ImageIcon [] image = {new ImageIcon("images/apple.jpg"), new ImageIcon("images/cherry.jpg"), new ImageIcon("images/pear.png")};
	JLabel imgLabel = new JLabel(image[0]);
	
	public ComboActionEx() {
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JComboBox strCombo = new JComboBox(fruits);
		strCombo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			JComboBox cd = (JComboBox)e.getSource();
			int index = cd.getSelectedIndex();
			imgLabel.setIcon(image[index]);
			}
		});
		contentPane.add(strCombo);
		contentPane.add(imgLabel);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ComboActionEx();
	}

}
