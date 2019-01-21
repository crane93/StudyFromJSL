package EVENT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextFieldEx extends JFrame{
	Container contentPane;
	public TextFieldEx() {
		setTitle("텍스트 필드 만들기 예쩨");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("이름: "));
		contentPane.add(new JTextField(10));
		contentPane.add(new JLabel("학과: "));
		contentPane.add(new JTextField("무역학과"));
		contentPane.add(new JLabel("주소: "));
		contentPane.add(new JTextField("서산시 석남동 동서1로", 20));
		
		setSize(350, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldEx();
	}

}
