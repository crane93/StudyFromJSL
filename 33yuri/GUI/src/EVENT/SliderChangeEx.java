package EVENT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderChangeEx extends JFrame {
	Container contentPane;
	JLabel colorLabel;
	JSlider[] sl = new JSlider[3];

	public SliderChangeEx() {
		setTitle("슬라이더와 ChangeEvent예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		colorLabel = new JLabel("          SLIDER EXAMPLE           ");
		for (int i = 0; i < sl.length; i++) {
			sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(50);
			sl[i].setMinorTickSpacing(10);
			sl[i].addChangeListener(new MyChangListener());
			contentPane.add(sl[i]);
		}
		sl[0].setForeground(Color.red);
		sl[1].setForeground(Color.GREEN);
		sl[2].setForeground(Color.BLUE);
		colorLabel.setOpaque(true); // 배경색을 변화시키는 기능
		colorLabel.setBackground(new Color(sl[0].getValue(), sl[1].getValue(), sl[2].getValue()));
		contentPane.add(colorLabel);
		setSize(300, 300);
		setVisible(true);
	}

	class MyChangListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent arg0) {
			colorLabel.setBackground(new Color(sl[0].getValue(), sl[1].getValue(), sl[2].getValue()));
		}

	}

	public static void main(String[] args) {
		new SliderChangeEx();
	}

}
