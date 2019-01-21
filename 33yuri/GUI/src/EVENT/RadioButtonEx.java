package EVENT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonEx extends JFrame{
	Container contentPane;
	RadioButtonEx(){
		setTitle("라디오 버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		ImageIcon cherryIcon = new ImageIcon("images/GetCall.png");
		ImageIcon SelectedcherryIcon = new ImageIcon("images/DownCall.png");
		
		ButtonGroup g = new ButtonGroup();		
		/*그룹으로 안묶고 따로따로 하면 체크박스처럼 전부 눌려져*/
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true);
		JRadioButton cherry = new JRadioButton("체리", cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(SelectedcherryIcon);
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		/*항목을 만들고 g에 add하자*/
		
		contentPane.add(apple);
		contentPane.add(pear);
		contentPane.add(cherry);
		//버튼 만든걸 패널에 붙여
		
		setSize(500,500);
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new RadioButtonEx();
	}

}
