import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

public class Input_mb extends BFrame implements ActionListener{
	JLabel lab = new JLabel("회원등록");
	JPanel pan = new JPanel();
	
	JLabel lab1 = new JLabel("이름: ");
	JLabel lab2 = new JLabel("주민번호: ");
	JLabel lab3 = new JLabel("연락처: ");
	JLabel lab4 = new JLabel("주소: ");
	
	JTextField txtf = new JTextField(10);
	JTextField txtf1 = new JTextField(10);
	JTextField txtf2 = new JTextField(10);
	JTextField txtf3 = new JTextField(10);
	JPanel cpan = new JPanel();
	JButton bt = new JButton("확인");
	JButton bt1 = new JButton("취소");
	JPanel span = new JPanel();
	DBMgr mgr = new DBMgr();
	ArrayList<MbBean> list;
	
	public Input_mb() {
		this.setTitle("회원등록");
		init();
	}
	
	private void init() {
		Container con = this.getContentPane();
		pan.setBackground(Color.DARK_GRAY);
		lab.setForeground(Color.WHITE);
		pan.add(lab);
		cpan.setLayout(new GridLayout(4, 1));
		cpan.add(lab1);
		cpan.add(txtf);
		cpan.add(lab2);
		cpan.add(txtf1);
		cpan.add(lab3);
		cpan.add(txtf2);
		cpan.add(lab4);
		cpan.add(txtf3);
		
		bt.addActionListener(this);
		bt1.addActionListener(this);
		span.add(bt);
		span.add(bt1);
		
		con.add("North", pan);
		con.add("Center", cpan);
		con.add("South", span);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("확인")) {
			String name = txtf.getText();
			String number = txtf1.getText();
			String phone = txtf2.getText();
			String addr = txtf3.getText();
			mgr.insertMb(name, number, phone, addr);
			dispose();	
		}else if(e.getActionCommand().equals("취소")) {
			dispose();
			txtf.setText("");
			txtf1.setText("");
			txtf2.setText("");
			txtf3.setText("");
			
		}
	}

}
