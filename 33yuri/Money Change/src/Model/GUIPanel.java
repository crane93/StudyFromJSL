package Model;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

import javax.swing.*;

public class GUIPanel extends JFrame {
	Container contentPane;
	JButton btn = new JButton("계산");
	JTextField tf = new JTextField(5);
	int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
	int money1 = 0; // 텍스트필드 tf에 입력받은 수(문자열형태)를 정수로 변환해서 저장하는 곳
	String[] unit = { "오만원", "만원", "오천원", "천원", "오백원", "백원", "오십원", "십원" };
	JTextField[] result = new JTextField[8]; // 나눈 몫을 저장하는 필드
	JLabel[] moneyunit = new JLabel[8]; // unit의 이름붙이기용

	public GUIPanel() { // ★중요! 생성자를 public으로 만들어야지 Changer에서도 접근 가능해
		setTitle("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JLabel("금액"));
		contentPane.add(tf);
		contentPane.add(btn);

		for (int i = 0; i < moneyunit.length; i++) {
			moneyunit[i] = new JLabel(unit[i]);
			/*
			 * moneyunit[i].settext(unit[i])으로 하니까 계속 null값이 뜨는거야 ㅜㅜㅜㅜ 
			 * 그렇다고 moneyunit[i] = unit[i]으로 하니까 String뭐시기가 뜨고... 
			 * 그런데... 방법을 찾았습니다! 
			 * unit에 JLabel을 씌우는 것이다! 
			 * 아마 둘의 타입이 맞지 않아서 오류가 뜬것같다 유닛은 스트링 타입이고 머니유닛은 JLabel이니 안맞지....
			 */
			result[i] = new JTextField(8); // 개고생 포인트, 이걸 안하면 null값이 나온다
			contentPane.add(moneyunit[i]);
			contentPane.add(result[i]);

		}
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				money1 = Integer.parseInt(tf.getText());
				for (int i = 0; i < result.length; i++) {
					int quotient = money1 / money[i];
					money1 = money1 % money[i];
					result[i].setText(Integer.toString(quotient));
					contentPane.add(result[i]);
				}
			}
		});

		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GUIPanel();
	}
}

/*
 * 문자열을 정수로 Integer.parseInt(문자열.getText());
 * 
 * 정수를 문자열로 바꿔서 배열에 저장 배열이름[i].settext(Integer.toString(정수값))
 * 
 * 배열만들때... null값에 주의하자...ㅜ
 */