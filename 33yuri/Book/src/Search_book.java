import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Search_book extends BFrame implements ActionListener{
	JLabel lab = new JLabel("도서검색");
	JPanel pan = new JPanel();
	JLabel lab1 = new JLabel("책이름: ");
	JTextField txtf = new JTextField(10);
	JPanel cpan = new JPanel();
	JButton search =new JButton("검색");
	JButton cancle = new JButton("취소");
	JPanel span = new JPanel();
	DBMgr mgr = new DBMgr();
	ArrayList<BookBean> list;
	
	public Search_book() {
		this.setTitle("도서검색창 입니다");
		init();
	}
	
	private void init() {
		Container con = this.getContentPane();
		pan.setBackground(Color.DARK_GRAY);
		lab.setForeground(Color.white);
		pan.add(lab);
		search.addActionListener(this);
		cancle.addActionListener(this);
		cpan.add(lab1);
		cpan.add(txtf);
		cpan.add(search);
		cpan.add(cancle);
		con.add("North", pan);
		con.add("Center", cpan);
		con.add("South", cpan);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("검색")) {
			String name =txtf.getText();
			list = mgr.searchBook(name);
			new Insert_book(list);			//명시적 생성자를 만들어줘야함		
		}
		else if(e.getActionCommand().equals("취소")) {
			dispose();
			txtf.setText(" ");
		}
	}

}
