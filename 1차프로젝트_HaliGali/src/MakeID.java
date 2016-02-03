
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;

public class MakeID extends  JFrame implements ActionListener{	//JDialog,등등 다 가능ㄴ
	
	JLabel la1,la2,la3,la4,la5;
	JTextField tf1,tf2;
	JRadioButton rb1,rb2,rb3,rb4;
	JPasswordField pf1,pf2;
	JButton b1,b2,b3;
	JButton ic1,ic2,ic3,ic4;
	
	ImageIcon i1=new ImageIcon("img/11_50.png");
	ImageIcon i2=new ImageIcon("img/22_50.png");
	ImageIcon i3=new ImageIcon("img/33_50.png");
	ImageIcon i4=new ImageIcon("img/44_50.png");
	
	public MakeID(){
		la1=new JLabel("이름");
		la2=new JLabel("ID");
		la3=new JLabel("PW");
		la4=new JLabel("PW확인");
		la5=new JLabel("캐릭터");
		
		tf1=new JTextField();
		tf2=new JTextField();
		pf1=new JPasswordField();
		pf2=new JPasswordField();

		rb1=new JRadioButton("Yes",i1,true);
		rb2=new JRadioButton("No",i2);
		rb3=new JRadioButton("Yes",i3);
		rb4=new JRadioButton("No",i4);
		ButtonGroup bg=new ButtonGroup();	//캐릭터
		bg.add(rb1);  bg.add(rb2);	bg.add(rb3);	bg.add(rb4);
		rb1.setSelected(true);
		
		b1=new JButton("가입");
		b2=new JButton("취소");
		b3=new JButton("확인");
		
		//배치
		setLayout(null);
		la1.setBounds(10,40,40,30);
		tf1.setBounds(55,40,140,30);
		
		la2.setBounds(10,75,40,30);
		tf2.setBounds(55,75,140,30);
		b3.setBounds(205,75,45,30);
		
		la3.setBounds(10,120,40,30);
		pf1.setBounds(55,120,140,30);
		
		la4.setBounds(10,155,40,30);
		pf2.setBounds(55,155,140,30);
		
		la5.setBounds(10,190,40,30);
		rb1.setBounds(50,190,160,80);
		rb2.setBounds(130,190,240,80);
		rb3.setBounds(50,270,80,80);
		rb4.setBounds(130,270,80,80);

		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		
		p.setBounds(10, 340, 195, 35);
		
		add(la1);add(tf1);
		add(la2);add(tf2);add(b3);
		add(la3);add(pf1);
		add(la4);add(pf2);
		add(la5);add(rb1);add(rb2);add(rb3);add(rb4);
		add(p);
		
		setSize(340, 380);
		//setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

	public static void main(String[] args){
		new MakeID();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(b1==e.getSource()){
			System.out.println("회원가입완료");
			JOptionPane.showMessageDialog(this, "회원가입완료");
		}else if(b2==e.getSource()){
			System.out.println("id중복체크");
		}else if(b3==e.getSource()){
			System.out.println("취소");
		}
		
	}
}
