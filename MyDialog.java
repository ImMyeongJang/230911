package day09;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//JDialog클래스를 상속받아 MyDialog를 구성합니다
public class MyDialog extends JDialog{
	
	JLabel lb;
	Container cp;
	JButton btClose;
	ImageIcon icon, icon2;
	
	public MyDialog(JFrame parent, boolean modal) {
		//super();
		super(parent, modal);
		//cp를 얻어와서
		//parent.setSize(100,100);
		//parent.setVisible(true);
		
		((MyGui)parent).b1.setText("Student");
		((MyGui)parent).b1.setBackground(Color.magenta);
		
		cp=this.getContentPane();//BorderLayout디폴트 (동,서,남,북, 중앙)
		icon=new ImageIcon("src/day09/icon1.png");
		icon2=new ImageIcon("src/day09/icon2.png");
		
		//lb를 붙인다.
		//단 lb가 먼저 생성되어 한다
		lb=new JLabel("반갑습니다");
		lb.setIcon(icon);
		lb.setHorizontalTextPosition(JLabel.CENTER);//수평 텍스트 위치
		lb.setVerticalTextPosition(JLabel.TOP);//수직 텍스트 위치
		lb.setHorizontalAlignment(JLabel.CENTER);//라벨을 중앙 위치에
		
		btClose=new JButton("Close");
		cp.add(lb);//디폴트 중앙에 붙는다.
		cp.add(btClose,"South");
		
		btClose.addActionListener(e->{
			//MyDialog만 닫기도록 처리해보기
			//System.exit(0);==> 프로그램 종료
			
			this.setVisible(false);
			this.dispose();//GUI리소스를 반납하는 메서드
		});
		
	}

}



