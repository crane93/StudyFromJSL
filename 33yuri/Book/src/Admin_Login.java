import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

//로그인 화면 제작

public class Admin_Login extends BFrame implements ActionListener {

	ImageIcon img = new ImageIcon("admin.jpg");
	JLabel labimg = new JLabel(img);
	JPanel cpan = new JPanel();

	JLabel lab = new JLabel("관리자로그인");
	JPanel pan = new JPanel();

	JLabel lab1 = new JLabel("ID: ");
	JTextField txtf = new JTextField(10);
	JLabel lab2 = new JLabel("pw: ");
	JTextField txtf1 = new JTextField(10);

	JPanel pan1 = new JPanel();
	JButton bt = new JButton("로그인");
	JButton bt1 = new JButton("종료");
	JPanel pan2 = new JPanel();

	DBMgr mgr = new DBMgr(); // DB실행에 관련된
	ArrayList<AdminBean> list;
	AdminBean bean;

	public Admin_Login() {
		this.setTitle("관리자 로그인");
		list = mgr.login();
		init();		//생성자 안에 판떼기 붙이는 메소드 넣기
	}

	private void init() {
		Container con = this.getContentPane();
		pan.setBackground(Color.black);
		lab.setForeground(Color.WHITE);
		pan.add(lab);
		pan1.add(labimg);
		bt.addActionListener(this);
		bt1.addActionListener(this);
		pan2.add(lab1);
		pan2.add(txtf);
		pan2.add(lab2);
		pan2.add(txtf1);
		pan2.add(bt);
		pan2.add(bt1);
		con.add("Center", pan1); // Center의 맨 앞은 대문자로!
		con.add("South", pan2);
		this.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if (str.equals("로그인")) {
			String id = txtf.getText();
			String pw = txtf1.getText();
			if (id.equals(list.get(0).getId()) && pw.equals(list.get(0).getPw())) { // 알맞는 아이디와 비번을 입력하면 통과
				BookManagemain bmm = new BookManagemain();
				dispose();
			} else {
				JOptionPane.showMessageDialog(null, "Login Erro", "ErrorMessage", JOptionPane.ERROR_MESSAGE);
				txtf.setText("");		//공백으로
				txtf1.setText("");
			}
		} else {
			dispose(); // 창을 닫는다
		}
	}

	public static void main(String[] args) {
		new Admin_Login();
	}
}
