import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

public class Input_book extends BFrame implements ActionListener{
	JLabel lab = new JLabel("도서등록");
	JPanel pan = new JPanel();
	
	JLabel lab1 = new JLabel("책번호: ");
	JLabel lab2 = new JLabel("책이름: ");
	JLabel lab3 = new JLabel("저자: ");
	JLabel lab4 = new JLabel("장르: ");
	JLabel lab5 = new JLabel("출판사: ");
	
	JTextField txtf1 = new JTextField(10);
	JTextField txtf2 = new JTextField(10);
	JTextField txtf3 = new JTextField(10);
	JTextField txtf4 = new JTextField(10);
	JTextField txtf5 = new JTextField(10);
	
	JPanel cpan = new JPanel();
	JButton bt = new JButton("확인");
	JButton bt1 = new JButton("취소");
	JPanel span = new JPanel();
	DBMgr mgr = new DBMgr();
	ArrayList<BookBean> list;
	
	public Input_book() {
		this.setTitle("도서등록");
		init();
	}
	
	private void init() {
		Container con = this.getContentPane();
		pan.setBackground(Color.DARK_GRAY);
		lab.setForeground(Color.WHITE);
		pan.add(lab);
		cpan.setLayout(new GridLayout(5, 1));
		cpan.add(lab1);
		cpan.add(txtf1);
		cpan.add(lab2);
		cpan.add(txtf2);
		cpan.add(lab3);
		cpan.add(txtf3);
		cpan.add(lab4);
		cpan.add(txtf4);
		cpan.add(lab5);
		cpan.add(txtf5);
		
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
			String num = txtf1.getText();
			String name = txtf2.getText();
			String author = txtf3.getText();
			String genre = txtf4.getText();
			String publisher = txtf5.getText();
			
			mgr.insertBook(num, name, author, genre, publisher);
			dispose();	
		}else if(e.getActionCommand().equals("취소")) {
			dispose();
			txtf1.setText("");
			txtf2.setText("");
			txtf3.setText("");
			txtf4.setText("");
			txtf5.setText("");
		}		
	}
}
