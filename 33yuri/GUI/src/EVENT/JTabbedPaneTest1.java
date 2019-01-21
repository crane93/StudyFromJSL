package EVENT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RadioPanel extends JPanel implements ActionListener{		//라디오 버튼이면 액션 리스너인듯
	JLabel jl1 = new JLabel("당신의 성별은?");
	JLabel jl2 = new JLabel("");	//""를 넣어줌으로써 null값임을 명시해주는 것일까...나?
	public RadioPanel() {
		JRadioButton jrb1 = new JRadioButton("남자");
		JRadioButton jrb2 = new JRadioButton("여자");
		add(jl1);
		add(jl2);
		add(jrb1);
		add(jrb2);
		jrb1.addActionListener(this);	//this는 클래스 내를 가리킨다
		jrb2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String s = ae.getActionCommand();	//위의 라디오 버튼에서 남자 or 여자를 선택하면 그 문자열을 리턴값으로 가져오는게 겟엑션커맨드
		jl2.setText(s);
	}
}

class ComboPanel extends JPanel implements ItemListener{		//콤보박스라서 아이템리스너인듯
	JLabel jl1 = new JLabel("당신의 혈액형은?");
	JLabel jl2 = new JLabel("");
	public ComboPanel() {
		JComboBox jcb = new JComboBox();
		jcb.addItem("A형");		//콤보박스 안에 내용물을 채워넣어요 ㅎ
		jcb.addItem("B형");
		jcb.addItem("AB형");
		jcb.addItem("O형");
		add(jl1);
		add(jl2);
		add(jcb);
		jcb.addItemListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent ie) {
		Object s = ie.getItem();
		jl2.setText(s.toString());
	}
}

class JTabbedPane1 extends JFrame{
	public JTabbedPane1() {
		JTabbedPane jtp = new JTabbedPane();
		RadioPanel rp = new RadioPanel();		//위에서 만든 라디오 패널 ㅎ
		ComboPanel cp = new ComboPanel();		//위에서 만든 콤보 패널 ㅎ
		jtp.addTab("성별", rp);					//성별탭에 라디오패널 객체 rp를 붙인다
		jtp.addTab("혈액형", cp);
		getContentPane().add(jtp);		//이렇게 하면 Container contentPane 처럼 변수없이 바로 만들수 있나봐!
		setTitle("JTabbedPaneTest1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 150);
		setVisible(true);
	}
}
public class JTabbedPaneTest1 {

	public static void main(String[] args) {
		new JTabbedPane1();
	}

}
