import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Update_book extends BFrame implements ActionListener{
	JLabel lab = new JLabel("책제목: ");
	JTextField txtf = new JTextField(10);
	JButton bt = new JButton("검색");
	JPanel pan = new JPanel();
	JLabel lab1 = new JLabel("번호");
	JTextField txtf1 = new JTextField(10);
	JLabel lab2 = new JLabel("책제목");
	JTextField txtf2 = new JTextField(10);
	JLabel lab3 = new JLabel("저자");
	JTextField txtf3 = new JTextField(10);
	JLabel lab4 = new JLabel("장르");
	JTextField txtf4 = new JTextField(10);
	JLabel lab5 = new JLabel("출판사");
	JTextField txtf5 = new JTextField(10);
	JPanel pan1 = new JPanel();
	JButton bt1 = new JButton("수정");
	JButton bt2 = new JButton("돌아가기");
	JPanel pan2 = new JPanel();
	DBMgr mgr = new DBMgr();
	ArrayList<BookBean> list;
	BookBean bean;
	
	public Update_book() {
		this.setTitle("책정보 수정 페이지");
		init();
	}
	
	private void init() {
		Container con = this.getContentPane();
		pan.add(lab);
		pan.add(txtf);
		pan.add(bt);
		pan1.setLayout(new GridLayout(5, 1));
		pan1.add(lab1);
		pan1.add(txtf1);
		pan1.add(lab2);
		pan1.add(txtf2);
		pan1.add(lab3);
		pan1.add(txtf3);
		pan1.add(lab4);
		pan1.add(txtf4);
		pan1.add(lab5);
		pan1.add(txtf5);
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
			String name = txtf.getText();
			list = mgr.updateBook(name);
			txtf1.setText(list.get(0).getBook_num());		//어이에 list담아온것에 첫번째
			txtf2.setText(list.get(0).getBook_name());
			txtf3.setText(list.get(0).getBook_author());
			txtf4.setText(list.get(0).getBook_genre());
			txtf5.setText(list.get(0).getBook_publisher());
		}else if(e.getActionCommand().equals("수정")) {
			String num = txtf1.getText();
			String name = txtf2.getText();
			String author= txtf3.getText();
			String genre= txtf4.getText();
			String publisher= txtf5.getText();
			mgr.updateBook2(num, name, author, genre, publisher);
			dispose();
		}else if(e.getActionCommand().equals("돌아가기")) {
			dispose();
		}
	}
}
