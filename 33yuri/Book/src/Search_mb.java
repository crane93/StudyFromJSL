import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Search_mb extends BFrame implements ActionListener{
	JLabel lab = new JLabel("회원검색");
	JPanel pan = new JPanel();
	JLabel lab1 = new JLabel("회원전화: ");
	JTextField txtf = new JTextField(10);
	JPanel cpan = new JPanel();
	JButton bt = new JButton("검색");
	JButton bt1 = new JButton("취소");
	JPanel span = new JPanel();
	DBMgr mgr = new DBMgr();
	ArrayList<MbBean> list;
	
	public Search_mb() {
		this.setTitle("회원검색창 입니다");
		init();
	}
	
	private void init() {
		Container con = this.getContentPane();
		pan.setBackground(Color.DARK_GRAY);
		lab.setForeground(Color.white);
		pan.add(lab);
		bt.addActionListener(this);
		bt1.addActionListener(this);
		cpan.add(lab1);
		cpan.add(txtf);
		span.add(bt);
		span.add(bt1);
		con.add("North", pan);
		con.add("Center", cpan);
		con.add("South", span);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("검색")) {
			String phone = txtf.getText();
			list = mgr.searchMb(phone);
			new Insert_mb(list);
		}
		else if(e.getActionCommand().equals("취소")) {
			dispose();
			txtf.setText(" ");
		}
	}

}
