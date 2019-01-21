package Pachinco;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pachinco extends JFrame{
	Container contentPane;
	public Pachinco() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.add(new MyPanel());
		contentPane.setLayout(null);
		setSize(400,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		JLabel result;
		JLabel number1;
		JLabel number2;
		JLabel number3;
		JButton btn;
		
		MyPanel(){
		
		}
	}
	public static void main(String[] args) {
		new Pachinco();
	}

}
