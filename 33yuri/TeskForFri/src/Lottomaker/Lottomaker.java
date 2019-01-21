package Lottomaker;

import java.awt.*;
import java.awt.event.*;
import java.awt.print.Book;

import javax.swing.*;

public class Lottomaker extends JFrame {
	Container contentPane;

	public Lottomaker() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.add(new MyPanel());
		setSize(300, 300);
		setVisible(true);

	}

	class MyPanel extends JPanel {
		JTextArea showLottonumber;
		JButton show;
		JButton cancle;

		public MyPanel() {
			show = new JButton("생성");
			show.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					int[] number = new int[6];
					String[] number1 = new String[6];

					for (int i = 0; i < number.length; i++) {
						number[i] = (int) (Math.random() * 45 + 1);
						for (int j = 0; j < i; j++) {
							if (number[i] == number[j]) {
								i--;
								break;
							}
						}
						number1[i] = Integer.toString(number[i]); // 텍스트 에어리어는 문자열만 받는다 그래서 toString으로 형변환 시켜줌 ㅎ
					}
					for (int i = 0; i < number1.length; i++) {
						showLottonumber.append(number1[i] + " ");
					}
					showLottonumber.append("\n");
				}
			});

			cancle = new JButton("초기화");
			cancle.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					showLottonumber.setText(null); // 텍스트에어리어 초기화

				}

			});

			showLottonumber = new JTextArea(6, 20); // 7행 20열의 텍스트에어리어 생성
			add(new JScrollPane(showLottonumber), new BorderLayout().NORTH); // 텍스트에어리어에 스크롤바기능 추가, 그럼 보이는 텍스트에어리어보다 더
																				// 많은 내용을 담을 수 있다
			add(show, new BorderLayout().SOUTH);
			add(cancle, new BorderLayout().SOUTH);
		}
	}

	public static void main(String[] args) {
		new Lottomaker();
	}

}
