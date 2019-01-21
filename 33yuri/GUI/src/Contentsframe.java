import java.awt.*;
import javax.swing.*;

public class Contentsframe extends JFrame{		//JFrame을 상속받으면 기능 쓸 수 있당
	Contentsframe(){
		setTitle("Contentsframe과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.GREEN);
		//c.setLayout(new FlowLayout());		
		//FlowLayout은 아래 버튼들이 가운데 정렬이 되도록 도와주는 것 ㅎ, 만약에 창의 크기를 줄이면 버튼이 아래로 내려간다
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		//FlowLayout.LEFT는 버튼들이 왼쪽기준으로 정렬되게 해줌, (30,40)은 가로간격, 세로간격 ㅎ
		c.add(new JButton("OK"));
		c.add(new JButton("CANCLE"));
		c.add(new JButton("IGNORE"));
		c.add(new JButton("CALL"));
		c.add(new JButton("HI"));
		
		setSize(700,300);
		setVisible(true);		//보여주는 트루는 항상 맨 밑에 위치해야함
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Contentsframe();
	}

}
