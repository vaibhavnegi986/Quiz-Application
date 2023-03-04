package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton rules , back ;
    JTextField tfname;
    
    Login(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,500,480);
        add(image);
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(600, 120, 700, 40);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD, 40));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(650, 200, 300, 20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD, 22));
        name.setForeground(Color.RED);
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(600,250,300,30);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,16));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(600, 330, 100, 30);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(800, 330, 100, 30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1000,500);
        setLocation(200,150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()==back){
            setVisible(false);
        }
            
    }
    
    public static void main(String args[])
    {
        new Login();
    }
}
