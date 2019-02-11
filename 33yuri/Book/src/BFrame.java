import java.awt.*;
import javax.swing.*;
//2 프레임
//로그인 화면이 가운데 오도록 만들어주는

public class BFrame extends JFrame{
	public BFrame() {
		this.setSize(300,200);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();	//이렇게 하면 창이 화면의 가운데에 위치한다
		Dimension dim2 = this.getSize();
		int x,y;
		x = (int)(dim.getWidth()/2 - dim2.getWidth());
		y = (int)(dim.getHeight()/2 - dim2.getHeight());
		this.setLocation(x, y);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
