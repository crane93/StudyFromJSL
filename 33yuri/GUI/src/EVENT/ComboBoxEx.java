package EVENT;

import java.awt.*;
import javax.swing.*;

public class ComboBoxEx extends JFrame{
	Container contentPane;
	String [] fruits = {"apple","banana", "peach", "berry", "strawberry", "kiwi", "mango"};
	String [] names = {"A","B","c","d"};
	
	ComboBoxEx(){
		setTitle("콤보박스 만들기 예쩨");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JComboBox strCombo = new JComboBox(fruits);
		contentPane.add(strCombo);
		
		JComboBox nameCombo = new JComboBox();
		for(int i =0;i<names.length;i++) {
			nameCombo.addItem(names[i]);	//additem 메소드를 호출하여 동적으로 삽입가능
		}
		contentPane.add(nameCombo);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComboBoxEx();
	}

}
