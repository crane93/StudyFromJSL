package EVENT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonImageEx extends JFrame{
	/*	Container란 무엇인가?
	 * 	컨테이너는 창(window)역할을 한다 GUI 프로그램을 만들 때 컴포넌트들을 담을 장소이다.
	 * 	JFrame은 타이틀바, 최소화,최대화 버튼과 닫기 버튼을 가진 원도 구조를 가지며 최종 컨테이너로 사용된다
	 * 	JPanel은 투명한 형태의 원도우로 중간 컨테이너로 사용된다.
	 * 	즉 컴포넌트들을 JPanel에 추가하고 이 JPanel을 JFrame에 추가하게 된다.*/
	Container contentPane;		//최종 컨테이너
	ButtonImageEx(){
		setTitle("버튼에 아이콘 달기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();		//메소드로 최종 컨테이너 생성
		contentPane.setLayout(new FlowLayout());	//컨테이너의 레이아웃 형태 지정
		
		ImageIcon normalIcon = new ImageIcon("images/StayCall.png");
		ImageIcon rolloverIcon = new ImageIcon("images/GetCall.png");
		ImageIcon pressedIcon = new ImageIcon("images/DownCall.png");

		JButton btn = new JButton("call~~", normalIcon);
		btn.setRolloverIcon(rolloverIcon);
		btn.setPressedIcon(pressedIcon);
		contentPane.add(btn);
		
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonImageEx();
	}

}
