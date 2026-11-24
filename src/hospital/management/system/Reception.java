package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {

    Reception(){

        //below panel
        JPanel panel= new JPanel();
        panel.setLayout(null);
        panel.setBounds(5,160,1525,670);
        panel.setBackground(new Color(109,164,170));
        add(panel);

        JLabel title = new JLabel("WELCOME TO DOCPULSE");
        title.setBounds(500,20,600,40);
        title.setFont(new Font("Segoe UI",Font.BOLD,30));
        title.setForeground(new Color(25,118,210));
        panel.add(title);

        JLabel tag = new JLabel("\"Your Health, Our Priority\"");
        tag.setBounds(560,60,400,30);
        tag.setFont(new Font("Segoe UI",Font.ITALIC,18));
        tag.setForeground(Color.BLACK);
        panel.add(tag);

        JTextArea about = new JTextArea();

        about.setText(
                "DocPulse Medical Center is a modern Hospital Management System\n\n"
                        +"designed to simplify hospital operations and improve patient care.\n\n"
                        +"Features:\n\n"
                        +"✔ Patient Registration\n"
                        +"✔ Employee Management\n"
                        +"✔ Department Management\n"
                        +"✔ Room Allocation\n"
                        +"✔ Search Room\n"
                        +"✔ Ambulance Services\n"
                        +"✔ Patient Discharge\n"
                        +"✔ Update Patient Records\n\n"
                        +"Mission:\n"
                        +"To provide efficient, secure and reliable healthcare\n"
                        +"management through digital technology.\n\n"
                        +"Technologies Used:\n"
                        +"• Core Java\n"
                        +"• Spring Framework\n"
                        +"• JDBC\n"
                        +"• MySQL Database\n\n"
                        +"Version : 1.0");

        about.setBounds(150,120,700,350);

        about.setFont(new Font("Segoe UI",Font.PLAIN,20));

        about.setEditable(false);

        about.setOpaque(false);

        about.setLineWrap(true);

        about.setWrapStyleWord(true);

        panel.add(about);

        ImageIcon hospital= new ImageIcon(ClassLoader.getSystemResource("icon/pngwing.com.png"));
        Image h = hospital.getImage().getScaledInstance(450,350,Image.SCALE_SMOOTH);
        ImageIcon i2h = new ImageIcon(h);

        JLabel pic = new JLabel(i2h);
        pic.setBounds(950,120,450,350);

        panel.add(pic);

        JLabel footer = new JLabel("© 2026 DocPulse Medical Center | Powered by Spring Framework");
        footer.setBounds(430,500,700,25);
        footer.setFont(new Font("Segoe UI",Font.PLAIN,16));
        footer.setForeground(Color.BLACK);

        panel.add(footer);


        //above panel
        JPanel panel1= new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,1525,150);
        panel1.setBackground(new Color(109,164,170));
        add(panel1);

        //icon-dr
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/dr.png"));
        Image image=i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(image);
        JLabel label=new JLabel(i2);
        label.setBounds(1300,0,250,250);
        panel1.add(label);


        //icon-ambulance
        ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("icon/amb.png"));
        Image image1=i11.getImage().getScaledInstance(300,100,Image.SCALE_DEFAULT);
        ImageIcon i22=new ImageIcon(image1);
        JLabel label1=new JLabel(i22);
        label1.setBounds(1000,50,300,100);
        panel1.add(label1);

        //add new patient button in panel1(above)
        JButton btn1=new JButton("Add New Patient");
        btn1.setBounds(30,15,200,30);
        btn1.setBackground(new Color(246,215,118));
        panel1.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    new NEW_PATIENT();
            }
        });


        JButton btn2=new JButton("Room");
        btn2.setBounds(30,58,200,30);
        btn2.setBackground(new Color(246,215,118));
        panel1.add(btn2);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Room();
            }
        });


        JButton btn3=new JButton("Department");
        btn3.setBounds(30,100,200,30);
        btn3.setBackground(new Color(246,215,118));
        panel1.add(btn3);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   new Department();
            }
        });

        JButton btn4=new JButton("All Employee Info");
        btn4.setBounds(270,15,200,30);
        btn4.setBackground(new Color(246,215,118));
        panel1.add(btn4);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 new Employee_info();
            }
        });

        JButton btn5=new JButton("Patient Info");
        btn5.setBounds(270,58,200,30);
        btn5.setBackground(new Color(246,215,118));
        panel1.add(btn5);
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new All_Patient_Info();
            }
        });

        JButton btn6=new JButton("Patient Discharge");
        btn6.setBounds(270,100,200,30);
        btn6.setBackground(new Color(246,215,118));
        panel1.add(btn6);
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  new patient_discharge();
            }
        });

        JButton btn7=new JButton("Update Patient Details");
        btn7.setBounds(510,15,200,30);
        btn7.setBackground(new Color(246,215,118));
        panel1.add(btn7);
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   new update_patient_details();
            }
        });

        JButton btn8=new JButton("Hospital Ambulance");
        btn8.setBounds(510,58,200,30);
        btn8.setBackground(new Color(246,215,118));
        panel1.add(btn8);
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  new Ambulance();
            }
        });

        JButton btn9=new JButton("Search Room");
        btn9.setBounds(510,100,200,30);
        btn9.setBackground(new Color(246,215,118));
        panel1.add(btn9);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Search_Room();
            }
        });

        JButton btn10=new JButton("Logout");
        btn10.setBounds(750,15,200,30);
        btn10.setBackground(new Color(246,215,118));
        panel1.add(btn10);
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  setVisible(false);
                  new Login();
            }
        });





        setSize(1950,1090);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Reception();
    }
}
