package Game369;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Ex7 extends JFrame{
    Ex7(){
        this.setTitle("369게임 혼자하기");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new GamePanel());//객체를 생성과 동시에 프레임에 추가
        this.setLocationRelativeTo(null);
        this.setSize(310, 250);
        this.setVisible(true);
    }
}

class GamePanel extends JPanel{
    TimerThread th;//숫자 카운트를 위한 스레드 선언
    JLabel card = new JLabel();//숫자 카운트를 보여줄 레이블 생성
    JButton start = new JButton("Start");//시작 버튼 생성
    int n=1;//카운트 시작할 숫자
    boolean singleClicked=false;//클릭 유무
    boolean doubleClicked=false;//더블클릭 유무
    
    GamePanel(){
        //숫자 카운트를 보여줄 레이블을 패널에 추가
        this.setLayout(null);
        card.setOpaque(true);
        card.setBackground(Color.orange);
        card.setFont(new Font("Arial",Font.ITALIC,30));
        card.setHorizontalAlignment(JLabel.CENTER);
        card.setText(Integer.toString(n));
        card.setSize(100, 50);
        card.setLocation(100, 50);
        card.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent me) {
            }

            public void mousePressed(MouseEvent me) {
                if(me.getClickCount()>=2){//더블 클릭이상 하였을 때 더블클릭으로 인식
                    doubleClicked=true;
                    singleClicked=false;
                }
                else{//한번 클릭했을 때
                    singleClicked=true;
                }
                //마우스를 눌렀을 때 레이블 객체의 소스를 얻어와 배경색을 초록으로 설정
                JLabel card = (JLabel)me.getSource();
                card.setBackground(Color.green);
                }

            public void mouseReleased(MouseEvent me) {
                //마우스를 떼었을 때 레이블 객체의 소스를 얻어와 배경색을 오렌지로 설정
                JLabel card = (JLabel)me.getSource();
                card.setBackground(Color.orange);
            }

            public void mouseEntered(MouseEvent me) {}

            public void mouseExited(MouseEvent me) {}
        });
        this.add(card);
        
        //버튼을 패널에 추가
        start.setLocation(100,150);
        start.setSize(100, 30);
        start.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                //버튼클릭시 초기설정과 스레드 객체 생성과 실행
                n=1;
                card.setText(Integer.toString(n));
                singleClicked=false;
                doubleClicked=false;
                th = new TimerThread();
                th.start();
                
                //게임 중에는 버튼 클릭을 못하게 함
                JButton b = (JButton)ae.getSource();
                b.setEnabled(false);
            }
        });
        this.add(start);
    }
    
    synchronized void setSingleClicked(boolean b){//한번 클릭
        singleClicked = b;
    }
    
    synchronized void setDoubleClicked(boolean b){//더블 클릭
        doubleClicked = b;
    }
    
    class TimerThread extends Thread{
        public void run(){
            while(true){
                try{
                    sleep(600);//0.7초마다

                    int d1=n%10;//일의 자리
                    int d2=n/10;//십의 자리

                    if((d1==3||d1==6||d1==9)&&(d2==3||d2==6||d2==9)){//더블클릭을 해야할 상황
                        if(doubleClicked==true){//더블클릭 성공시 다시 거짓으로 바꿔줌
                            setDoubleClicked(false);
                        }
                        else{//실패시 메세지 출력
                            card.setText("FAIL...");
                            break;
                        }
                    }
                    else if(d1==3||d1==6||d1==9||d2==3||d2==6||d2==9){//한번클릭을 해야할 상황
                        if(singleClicked==true){//성공시
                            setSingleClicked(false);
                        }
                        else{//실패시
                            card.setText("FAIL...");
                        }
                    }
                    else{//아무것도 클릭하지 말아야할 상황
                        if(singleClicked==true||doubleClicked==true){//클릭시 실패
                            card.setText("FAIL...");
                            break;
                        }
                    }
                    
                    n++;//카운트 수 1씩 증가
                    if(n==100){//100까지 가면 승리
                        card.setText("WIN!!");
                        break;
                    }
                    else{//100 아래이면 계속 실행
                        card.setText(Integer.toString(n));
                    }
                }
                catch(Exception e){ return; }
            }
            start.setEnabled(true);//게임이 끝나면 버튼 활성화
        }
    }
}

public class JavaApplication32 {

	public static void main(String[] args) {
		 new Ex7();
	}
}