import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Delete_book extends BFrame implements ActionListener{
	JLabel lab = new JLabel("도서삭제");
	JPanel pan = new JPanel();
	JLabel lab1 = new JLabel("책제목: ");
	JTextField txtf = new JTextField(10);
	JPanel cpan = new JPanel();
	JButton del = new JButton("삭제");
	JButton cancle = new JButton("취소");
	JPanel span = new JPanel();
	DBMgr mgr = new DBMgr();
	ArrayList<BookBean> list;
	
	public Delete_book() {
		this.setTitle("도서삭제");
		init();
	}
	
	private void init() {
		Container con = this.getContentPane();
		pan.setBackground(Color.DARK_GRAY);
		lab.setForeground(Color.WHITE);
		pan.add(lab);
		del.addActionListener(this);
		cancle.addActionListener(this);
		cpan.add(lab1);
		cpan.add(txtf);
		span.add(del);
		span.add(cancle);
		con.add("North", pan);
		con.add("Center", cpan);
		con.add("South", span);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("삭제")) {
			String name = txtf.getText();
			list = mgr.deleteBook(name);
			dispose();
		}
		else if(e.getActionCommand().equals("취소")) {
			dispose();
			txtf.setText(" ");
		}
	}
	
}
