import java.awt.*;   	//Layout을 위해 임포트
import javax.swing.*;	//JFrame 을 위해 임포트 

public class BorderLayoutEx extends JFrame{
	public BorderLayoutEx() {
		setTitle("BorderLayoutSample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("div"), BorderLayout.WEST);
		c.add(new JButton("calculate"), BorderLayout.CENTER);
		//CENTER는 주석처리 해도 나머지 동서남북 애들이 자리를 차지하지 않는다, 기본 공간이 있다는 뜻 ㅎ
		
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new BorderLayoutEx();
	}

}
