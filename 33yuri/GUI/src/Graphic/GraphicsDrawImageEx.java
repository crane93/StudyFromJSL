package Graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicsDrawImageEx extends JFrame {
	Container contentPane;

	public GraphicsDrawImageEx() {
		setTitle("drwaImage사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel p = new MyPanel();
		contentPane.add(p, BorderLayout.CENTER);
		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		ImageIcon imageIcon = new ImageIcon("images/apple.jpg");
		Image image = imageIcon.getImage();
		JButton btn = new JButton("버튼");
		public MyPanel() {
			setLayout(new FlowLayout());
			add(btn);		//사진 위에(겹쳐서) 버튼 만드는 방법
							//근데 난 페인트 컴포넌트에 add(btn)했을 때도 되긴 됐는데...ㅎ 약간 이상하긴 했지만...
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			//g.drawImage(image, 20, 20, this);		사진 크기대로 패널에 붙여짐
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);	//패널 사이즈에 맞게 사진이 알아서 크기가 변함
		}

	}

	public static void main(String[] args) {
		new GraphicsDrawImageEx();
	}

}
