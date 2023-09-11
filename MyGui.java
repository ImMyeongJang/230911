package day09;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyGui extends JFrame{
	
	JButton b1, b2, b3, b4;
	JPanel p;
	Container cp;//컴포넌트들을 여기에 붙인다
	MyDialog dial;
	public MyGui() {
		//super();
		super("::MyGui 프로그램 v1.1::");
		cp=this.getContentPane();//내용물을 붙이는 일종의 패널
		
		p=new JPanel();//디폴트 레이아웃 FlowLayout
		//내가 원하는 위치에 컴포넌트를 부착하고자 한다면 레이아웃을 해제한다
		p.setLayout(null);//레이아웃 해제
		
		cp.add(p,"Center");
		p.setBackground(Color.yellow);
		
		b1=new JButton("학생");
		b2=new JButton("교사");
		b3=new JButton("직원");
		b4=new JButton("종료");
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		b1.setBounds(20,30,120,50);//x,y, w,h
		b2.setBounds(160,30,120,50);
		b3.setBounds(300,30,120,50);
		b4.setBounds(20, 400,120,50);

		//JFrame f=new JFrame(); //[x]
		dial=new MyDialog(this, true);//this를 넘겨야
		//MyGui와 MyDialog가 서로 연동할 수 있다.
		
		b1.addActionListener(e->{
			//MyDialog생성해서 setSize(), setVisible(true)
			//MyDialog dial=new MyDialog();
			dial.setSize(300,300);
			dial.setVisible(true);
			
		});
		
		b4.addActionListener(e->{
			System.exit(0);//0: 정상종료시, 0이 아닌 값: 에러 발생시 종료
		});
		
	}//MyGui()생성자-----------------

	public static void main(String[] args) {
		//System.out.println("MyGui");
		MyGui my=new MyGui();
		my.setSize(500,500);
		my.setVisible(true);

	}

}
