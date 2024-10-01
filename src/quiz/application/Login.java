package quiz.application;

import java.awt.*;
import java.awt.event.*; //actionlisteners are added
import javax.swing.*;

public class Login extends JFrame implements ActionListener{ //interfaces are added
 
    JButton rules, back;
    JTextField tfname;
    
    Login() {
        getContentPane().setBackground(Color.WHITE); // add the backgroud color to the frame
        setLayout(null); // set the self layout to the image
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg")); //get the image
        JLabel image = new JLabel(i1);  
        image.setBounds(0, 0, 600, 500); //location of the image
        add(image); //to add the image in the frame
        
        JLabel heading = new JLabel("Brain Deco"); //j label is use to mention the text on frame and text is added to the frame
        heading.setBounds(750, 60, 300, 45); // location of image
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40)); //font of the image size and all
        heading.setForeground(new Color(30, 144, 254));  //change the color of the font on the frame
        add(heading); //add the image
        
        JLabel name = new JLabel("Enter your name");  //enter the name
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);
        
        tfname = new JTextField(); // add the text field
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add(tfname);
        
        rules = new JButton("Rules"); //add the button
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this); //add the click event on button
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this); //add the click event on button, tells the action performed on button 
        add(back);
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) { // conditons for buttons
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false); // frame closes on back button
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
