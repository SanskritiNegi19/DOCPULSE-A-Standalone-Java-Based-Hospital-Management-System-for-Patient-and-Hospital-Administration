package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class Login extends JFrame implements ActionListener {

    JTextField textField;
    JPasswordField jPasswordField;
    JButton b1,b2;

    Login(){

        JLabel namelabel =new JLabel("Username:");
        namelabel.setBounds(40,50,100,30);
        namelabel.setFont(new Font("Poppins", Font.BOLD,16));//font of username
        namelabel.setForeground(Color.BLACK);//text color
        add(namelabel);

        JLabel password =new JLabel("Password:");
        password.setBounds(40,110,100,40);
        password.setFont(new Font("Poppins", Font.BOLD,16));//font of password
        password.setForeground(Color.BLACK);//text color
        add(password);

        textField=new JTextField();// username textfield
        textField.setBounds(150,50,150,30);
        textField.setFont(new Font("Poppins",Font.PLAIN,15));
        textField.setBackground(new Color(255,179,0));
        add(textField);


        //password textfield
        jPasswordField=new JPasswordField();//hiding password help thats why password field taken
        jPasswordField.setBounds(150,110,150,30);
        jPasswordField.setFont(new Font("Poppins",Font.PLAIN,15));
        jPasswordField.setBackground(new Color(255,179,0));
        add(jPasswordField);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));//docpulse icon
        Image i1= imageIcon.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1= new ImageIcon(i1);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(320,-30,400,300);
        add(label);


        b1=new JButton("LOGIN");//login button
        b1.setBounds(40,180,120,30);
        b1.setFont(new Font("Poppins",Font.BOLD,15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("CANCEL");//login button
        b2.setBounds(180,180,120,30);
        b2.setFont(new Font("Poppins",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);




        getContentPane().setBackground(new Color(109,164,170));// background color
        setSize( 750,300);
        setLocation(400,270);//makes the frame open in center
        setLayout(null);
        setVisible(true); //make the frame visible
    }


    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == b1){ //b1 click this will satisfy
             try{
                 conn c= new conn();
                 String user=textField.getText();
                 String Pass=jPasswordField.getText();

                 String q="select * from login where ID ='"+user+"' and PW ='"+Pass+"' ";
                 ResultSet resultSet= c.statement.executeQuery(q);

                 if(resultSet.next()){
                     new Reception();
                     setVisible(false);
                 }
                 else{
                     JOptionPane.showMessageDialog(null ,"Invalid");
                 }
             }catch(Exception E){
                 E.printStackTrace();
             }
         }
         else{  //b2 click this will satisfy
             System.exit(10);
         }
    }
    public static void main(String[] args){
        new Login();
    }


}
