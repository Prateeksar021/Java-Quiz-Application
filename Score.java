package Quiz.Application;

import java.awt.Color;
import java.awt.Font;
import java.net.URL;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Score extends JFrame implements ActionListener{

	Score(String name,int score){
		setBounds(400,150,750,550);
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		URL imageurl=getClass().getResource("/scrore.jpg");
		ImageIcon I1=new ImageIcon(imageurl);
		Image i2=I1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel imagelabel=new JLabel(I1);
		imagelabel.setBounds(10,200,300,250);
		add(imagelabel);
		
		 JLabel heading=new JLabel("Thank you"+name+ " for playing the quiz");
		 heading.setBounds(45,30,700,40);
		 heading.setFont(new Font("Tahuma",Font.BOLD,28));
		add(heading);
		
		JLabel lblscore=new JLabel("Your Score is "+ score);
		lblscore.setBounds(350,200,300,30);
		lblscore.setFont(new Font("Tahuma",Font.BOLD,28));
		add(lblscore);
		
		 JButton submit=new JButton("Play again");
	        submit.setBounds(380,270,120,30);
	        submit.setBackground(new Color(30,144,255));
	        submit.setForeground(Color.white);
	        submit.addActionListener(this);
	        add(submit);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new Login();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Score("User",0);
	}

}
