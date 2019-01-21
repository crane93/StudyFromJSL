package EVENT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JMenu1 extends JFrame implements ActionListener{
	JTextField jtf;
	public JMenu1() {
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JMenuBar jmb = new JMenuBar();		//메뉴바 객체생성
		JMenu menu1 = new JMenu("파일");
		JMenu menu2 = new JMenu("편집");
		JMenuItem jmi = new JMenuItem("새파일");
		jmi.addActionListener(this);		//메뉴아이템을 생성하여 리스너에 등록하고 메뉴에 추가
		menu1.add(jmi);
		jmi = new JMenuItem("저장하기");
		jmi.addActionListener(this);
		menu1.add(jmi);
		jmb.add(menu1);			//메뉴바 객체에 메뉴추가
		jmi = new JMenuItem("열기");
		jmi.addActionListener(this);
		menu2.add(jmi);
		jmi = new JMenuItem("잘라내기");
		jmi.addActionListener(this);
		menu2.add(jmi);
		jmi = new JMenuItem("복사");
		jmi.addActionListener(this);
		menu2.add(jmi);
		JCheckBoxMenuItem jchmi = new JCheckBoxMenuItem("눈금자");	//체크박스메뉴아이템을 쓰면 □눈금자 처럼 네모칸이 붙어서 나옴
		jchmi.addActionListener(this);
		menu2.add(jchmi);
		JRadioButtonMenuItem jrbmb = new JRadioButtonMenuItem("수정가능상태");		//라디오버튼은 º수정가능상테っていう感じ
		jrbmb.addActionListener(this);
		menu2.add(jrbmb);
		jmb.add(menu2);		//메뉴에 메뉴바 추가
		setJMenuBar(jmb);	//프레임에 메뉴바 추가
		jtf = new JTextField();
		c.add(jtf,BorderLayout.SOUTH);
		setTitle("JMenuTest1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		jtf.setText(ae.getActionCommand());
	}	
}
public class JMenuText1{
	public static void main(String[] args) {
		new JMenu1();
	}

}
