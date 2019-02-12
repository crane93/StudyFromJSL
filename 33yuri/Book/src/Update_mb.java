import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Update_mb extends BFrame implements ActionListener{
	JLabel lab = new JLabel("회원 전화번호: ");
	JTextField txtf = new JTextField(10);
	JButton bt = new JButton("검색");
	JPanel pan = new JPanel();
	JLabel lab1 = new JLabel("이름");
	JTextField txtf1 = new JTextField(10);
	JLabel lab2 = new JLabel("주민번호");
	JTextField txtf2 = new JTextField(10);
	JLabel lab3 = new JLabel("연락처");
	JTextField txtf3 = new JTextField(10);
	JLabel lab4 = new JLabel("주소");
	JTextField txtf4 = new JTextField(10);
	JPanel pan1 = new JPanel();
	JButton bt1 = new JButton("수정");
	JButton bt2 = new JButton("돌아가기");
	JPanel pan2 = new JPanel();
	DBMgr mgr = new DBMgr();
	ArrayList<MbBean> list;
	MbBean bean;
	
	public Update_mb() {
		this.setTitle("회원정보 수정 페이지");
		init();
	}
	
	private void init() {
		Container con = this.getContentPane();
		pan.add(lab);
		pan.add(txtf);
		pan.add(bt);
		pan1.setLayout(new GridLayout(4, 1));
		pan1.add(lab1);
		pan1.add(txtf1);
		pan1.add(lab2);
		pan1.add(txtf2);
		pan1.add(lab3);
		pan1.add(txtf3);
		pan1.add(lab4);
		pan1.add(txtf4);
		pan2.add(bt1);
		pan2.add(bt2);
		bt.addActionListener(this);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		con.add("North", pan);
		con.add("Center", pan1);
		con.add("South", pan2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("검색")) {
			String phone = txtf.getText();
			list = mgr.updateMb(phone);
			txtf1.setText(list.get(0).getMb_name());		//어이에 list담아온것에 첫번째
			txtf2.setText(list.get(0).getMb_num());
			txtf3.setText(list.get(0).getMb_phone());
			txtf4.setText(list.get(0).getMb_addr());
		}else if(e.getActionCommand().equals("수정")) {
			String name = txtf1.getText();
			String num = txtf2.getText();
			String phone = txtf3.getText();
			String addr = txtf4.getText();
			mgr.updateMb2(name, num, phone, addr);
			dispose();
		}else if(e.getActionCommand().equals("돌아가기"))
			dispose();
	}

}
