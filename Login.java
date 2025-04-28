package Quiz.Application;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.net.URL;

import javax.swing.*;
public class Login extends JFrame implements ActionListener{

	JButton rules,back,start;
	JTextField tfname;
	public Login() {
		getContentPane().setBackground(Color.white);
		
		URL imageurl = getClass().getResource("/login.jpg");
		setLayout(null);
		ImageIcon imageIcon = new ImageIcon(imageurl);   
	    JLabel imageLabel = new JLabel(imageIcon);
	    imageLabel.setBounds(0, 0, 600, 600);
	    add(imageLabel);
		
		JLabel heading=new JLabel("Simple Minds");
		heading.setBounds(750, 50, 300, 40);
		heading.setFont(new Font("Viner hand ITC", Font.BOLD, 45));
		add(heading);
		
		JLabel name=new JLabel("Enter your Name");
		name.setBounds(785, 130, 300, 30);
		name.setFont(new Font("Mogolian Baiti", Font.BOLD, 25));
		add(name);
		
		 tfname=new JTextField();
		tfname.setBounds(735,200,300,25);
		tfname.setFont(new Font("Times New Roman",Font.BOLD,20));	
		add(tfname);
		
		rules=new JButton("Rules");
		rules.setBounds(670, 270, 120,30);
		rules.setBackground(new Color(30,144,254));
		rules.setForeground(Color.BLACK);
		rules.addActionListener(this);
		add(rules);
		
		back=new JButton("Back");
		back.setBounds(835, 270, 120,30);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.BLACK);
		back.addActionListener(this);
		add(back);
		
		start=new JButton("Start");
	    start.setBounds(1000, 270, 120,30);
	    start.setBackground(new Color(30,144,254));
	    start.setForeground(Color.BLACK);
	    start.addActionListener(this);
		add(start);
		
		setLocation(150,100);
		setSize(1200,600);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent a) {
		if(a.getSource()==rules) {
			String name=tfname.getText();
			setVisible(false);
			new Rules(name);
		}
		else if(a.getSource()==start) {
			setVisible(false);
			new Quiz("User");
		}else {
			setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login();
	}

}
