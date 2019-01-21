package Model;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MoneyChanger extends JFrame {
	Container c;
	JLabel[] money = new JLabel[7];
	JTextField[] tfRes = new JTextField[7];
	String[] sMoney = { "오만원", "만원", "천원", "오백원", "백원", "십원", "일원" }; // 라벨 이름
	int[] div = { 50000, 10000, 1000, 500, 100, 10, 1 }; // 나누는 값
	int[] res = new int[7]; // 결과 값 저장

	MoneyChanger() {
		setTitle("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel pa = new JPanel();

		JLabel lblMoney = new JLabel("금액");
		pa.add(lblMoney, "West");
		JTextField tfInput = new JTextField(10);
		pa.add(tfInput, "Center");
		JButton btn = new JButton("계산");
		pa.add(btn, "East");

		JPanel pa2 = new JPanel(new GridLayout(7, 2, -200, 5));

		for (int i = 0; i < tfRes.length; i++) {
			money[i] = new JLabel(sMoney[i]);
			tfRes[i] = new JTextField(6);
			pa2.add(money[i]);
			pa2.add(tfRes[i]);
		}

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input = Integer.parseInt(tfInput.getText());
				for (int i = 0; i < div.length; i++) {
					res[i] = input / div[i];
					input = input % div[i];
					tfRes[i].setText(Integer.toString(res[i]));
				}
			}
		});

		c.add(pa, "North");
		c.add(pa2, "Center");
		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
      new MoneyChanger();
   }
}