import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;

//도서 등록 or 삭제
public class Insert_book extends BFrame implements ActionListener{
	JPanel pan_bt = new JPanel();
	JButton book_register = new JButton("도서등록");
	JButton book_refer = new JButton("도서조회");
	JButton book_del = new JButton("도서삭제");
	JButton refresh = new JButton("새로고침");
	JButton back = new JButton("돌아가기");
	JButton revise = new JButton("수정");
	
	JTable table;
	JScrollPane scpan;
	
	String col[] = {"책번호", "책이름","저자", "장르", "출판사"};
	DBMgr mgr = new DBMgr();
	ArrayList<BookBean> list;
	BookBean bean;
	
	public Insert_book() {
		this.setTitle("도서목록");
		list = mgr.allbook();				
		/*테스트용으로 이부분을 주석처리하고 돌려봤어. 
		 * 근데 창은 뜨는데 내용물이 없네? 
		 * 왜냐면 아래에 record에 저장할 list가 없기 때문! 
		 * 여기에 있는 list는 선언은 해놨지만 내용물이 없어 allbook해서 가지고 와야해 
		 * 그래야 record도 일을할 수 있고 창이 뜨는것이당*/
		init();
	}
	
	public Insert_book(ArrayList<BookBean> list) {
		this.setTitle("도서목록");
		this.list = list;
		init();
	}
	
	private void init() {
		Container con = this.getContentPane();
		
		refresh.addActionListener(this);
		book_register.addActionListener(this);
		book_refer.addActionListener(this);
		book_del.addActionListener(this);
		revise.addActionListener(this);
		back.addActionListener(this);
		pan_bt.add(refresh);
		pan_bt.add(book_register);
		pan_bt.add(book_refer);
		pan_bt.add(book_del);
		pan_bt.add(revise);
		pan_bt.add(back);
		
		String record[][] = new String[list.size()][col.length];
		for(int i = 0 ; i < list.size(); i++) {
			bean = list.get(i);
			record[i][0] = bean.getBook_num();
			record[i][1] = bean.getBook_name();
			record[i][2] = bean.getBook_author();
			record[i][3] = bean.getBook_genre();
			record[i][4] = bean.getBook_publisher();
		}
		
		table = new JTable(record, col);
		scpan = new JScrollPane(table);
		JPanel panline = new JPanel(new BorderLayout());
		panline.setBorder(new TitledBorder(new EtchedBorder(),"도서목록"));
		panline.add(scpan, BorderLayout.CENTER);
		con.add("North", pan_bt);
		con.add("Center", panline);
		this.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("도서등록")) {
			new Input_book();
		}
		else if(e.getActionCommand().equals("도서조회")) {
			new Search_book();
		}
		else if(e.getActionCommand().equals("도서삭제")) {
			new Delete_book();
		}
		else if(e.getActionCommand().equals("수정")) {
			new Update_book();
		}
		else if(e.getActionCommand().equals("새로고침")) {
			dispose();
			new Insert_book();
		}
		else {
			dispose();
		}
	}

}
