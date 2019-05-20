import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

//회원등록/삭제

public class Insert_mb extends BFrame implements ActionListener{
	JPanel pan1 = new JPanel();
	JButton bt = new JButton("등록");
	JButton bt1 = new JButton("조회");
	JButton bt2 = new JButton("삭제");
	JButton bt3 = new JButton("새로고침");
	JButton bt4 = new JButton("돌아가기");
	JButton bt5 = new JButton("수정");
	JPanel pan2 = new JPanel();
	
	JTable table;
	JScrollPane scpan;
	
	String col[] = {"이름","주민번호","전화번호","주소"};
	DBMgr mgr = new DBMgr();
	ArrayList<MbBean> list;
	MbBean bean;
	
	public Insert_mb() {
		this.setTitle("회원목록");
		list = mgr.allmb();
		init();
	}
	
	public Insert_mb(ArrayList<MbBean> list) {		//Search_mb에도 쓰이는 명시적인 생성자
		this.setTitle("회원목록");
		this.list = list;
		init();
	}
	
	private void init() {
		Container con = this.getContentPane();
		
		bt.addActionListener(this);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		pan1.add(bt3);
		pan1.add(bt);
		pan1.add(bt1);
		pan1.add(bt5);
		pan1.add(bt2);
		pan1.add(bt4);
		String record[][] = new String[list.size()][col.length];		//리스트사이즈: 리턴한 값의 개수
		for(int i =0; i<list.size();i++) {
			bean = list.get(i);
			record[i][0] = bean.getMb_name();
			record[i][1] = bean.getMb_num();
			record[i][2] = bean.getMb_phone();
			record[i][3] = bean.getMb_addr();
		}
		table = new JTable(record,col);		
		scpan = new JScrollPane(table);
		JPanel panline = new JPanel(new BorderLayout());
		panline.setBorder(new TitledBorder(new EtchedBorder(), "회원목록"));	//j테이블만드는 공식 
		panline.add(scpan,BorderLayout.CENTER);
		con.add("North", pan1);
		con.add("Center", panline);
		this.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("등록")) {
			new Input_mb();
		}else if(e.getActionCommand().equals("조회")) {
			new Search_mb();
		}else if(e.getActionCommand().equals("새로고침")) {
			dispose();		//자기자신을 껐다 다시킨다
			new Insert_mb();
		}else if(e.getActionCommand().equals("삭제")) {
			new Delete_mb();	
		}else if(e.getActionCommand().equals("수정")) {
			new Update_mb();
		}else {
			dispose();
		}
	}

}
