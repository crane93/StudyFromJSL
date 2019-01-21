package Model;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

import javax.swing.*;

public class Money extends JFrame {
	Container contentPane;

	public Money() {
		setTitle("MoneyChanger");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		setContentPane(new Mypanel());
		setSize(300, 300);
		setVisible(true);
	}

	class Mypanel extends JPanel {
		int[] unit = { 50000, 10000, 1000, 500, 100, 50 };
		String[] text = { "오만원", "만원", "천원", "오백원", "백원", "오십원" };
		JTextField source;
		JTextField[] tf = new JTextField[8];

		public Mypanel() {
			setBackground(Color.PINK);
			setLayout(null); // 위치값을 잡을려고 null값으로 함 ㅎ
			JLabel la = new JLabel("금액");
			la.setHorizontalAlignment(JLabel.RIGHT);
			la.setSize(50, 20);
			la.setLocation(20, 20);
			add(la);

			source = new JTextField(30);
			source.setSize(100, 20);
			source.setLocation(100, 20);
			add(source);

			JButton btn = new JButton("계산");
			btn.setSize(70, 20);
			btn.setLocation(210, 20);
			add(btn);

			for (int i = 0; i < text.length; i++) {
				la = new JLabel(text[i]);
				la.setHorizontalAlignment(JLabel.RIGHT);
				la.setSize(50, 20);
				la.setLocation(50, 50 + i * 20);
				add(la);
				tf[i] = new JTextField(30);
				tf[i].setHorizontalAlignment(JTextField.CENTER);
				tf[i].setSize(70, 20);
				tf[i].setLocation(120, 50 + i * 20);

				add(tf[i]);
			}
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String str = source.getText();
					if (str.length() == 0)
						return;

					int money = Integer.parseInt(str);
					int res;
					for (int i = 0; i < unit.length; i++) {
						res = money / unit[i];
						tf[i].setText(Integer.toString(res));
						if (res > 0)
							money = money % unit[i];
					}
				}
			});
		}

	}

	public static void main(String[] args) {
		new Money();
	}

}
