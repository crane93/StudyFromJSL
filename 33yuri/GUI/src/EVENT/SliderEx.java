package EVENT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SliderEx extends JFrame{
	Container contentPane;
	SliderEx(){
		setTitle("슬라이더 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);	//(최소값, 최댓값, 초기값)
		slider.setPaintLabels(true);		// 이걸 주석처리하면 슬라이더 아래에 있는 숫자가 안보임
		slider.setPaintTicks(true);			//이걸 주석처리하면 눈금이 안보임
		slider.setPaintTrack(true);			//이걸 주석처리하면 트랙에 페인트가 안칠해져이다저ㅣ라먿
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		
		contentPane.add(slider);
		setSize(300,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SliderEx();
	}

}
