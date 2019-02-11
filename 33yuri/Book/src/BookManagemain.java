import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BookManagemain extends BFrame implements ActionListener{
	ButtonGroup group = new ButtonGroup();
	JButton BorrowReturn = new JButton("도서대여/반납");
	JButton RegisterDel = new JButton("회원등록/삭제");
	JButton Book_RegisterDel = new JButton("도서등록/삭제");
	JButton Info_all_Borrow = new JButton("모든대여정보");
	JButton close = new JButton("종료");
	JPanel pan1 = new JPanel();
	JPanel pan1_1 = new JPanel();
	JPanel pan1_2 = new JPanel();
	ImageIcon img = new ImageIcon("main.jpg");
	JLabel welcome = new JLabel(img);
	JPanel pan2 = new JPanel();
	DBMgr mgr = new DBMgr();
	
	public BookManagemain() {
		this.setTitle("도서 관리 프로그램");
		this.setBounds(100, 200, 300, 300);
		init();			//이 메소드는 프라이빗입니다 이렇게만 접근 가능
	}
	private void init() {
		Container con = this.getContentPane();
		pan1_1.setBackground(Color.WHITE);
		BorrowReturn.setBackground(Color.white);
		RegisterDel.setBackground(Color.white);
		Book_RegisterDel.setBackground(Color.white);
		Info_all_Borrow.setBackground(Color.white);
		close.setBackground(Color.white);
		pan1.add(pan1_1);
		BorrowReturn.addActionListener(this);
		RegisterDel.addActionListener(this);
		Book_RegisterDel.addActionListener(this);
		Info_all_Borrow.addActionListener(this);
		close.addActionListener(this);
		pan1_1.add(BorrowReturn);
		pan1_1.add(RegisterDel);
		pan1_1.add(Book_RegisterDel);
		pan1_1.add(Info_all_Borrow);
		pan1_1.add(close);
		pan1.add(welcome);
		con.add("Center", pan1);
		con.add("South", pan1_1);
		this.pack();					//사진 사이즈에 맞게 창 조절
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		if(button.equals(RegisterDel.getText())) {
			new Insert_mb();
		}
	}
	public static void main (String[] arg) {
			new BookManagemain();
	}
	
}
