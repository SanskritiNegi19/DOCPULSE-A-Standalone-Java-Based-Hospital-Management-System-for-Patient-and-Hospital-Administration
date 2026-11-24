package hospital.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class patient_discharge extends JFrame {

    patient_discharge(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,790,390);
        panel.setBackground(new Color(90,156,163));
        panel.setLayout(null);
        add(panel);

        JLabel label1= new JLabel("CHECK-OUT");
        label1.setBounds(100,20,150,20);
        label1.setFont(new Font("Poppins",Font.BOLD,20));
        label1.setForeground(Color.WHITE);
        panel.add(label1);

        JLabel label2= new JLabel("Customer ID");
        label2.setBounds(30,80,150,20);
        label2.setFont(new Font("Poppins",Font.BOLD,14));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        Choice choice=new Choice();
        choice.setBounds(200,80,150,25);
        panel.add(choice);

        try{
            conn c=new conn();
            ResultSet resultSet=c.statement.executeQuery("select * from patient_info");
            while(resultSet.next()){
                choice.add(resultSet.getString("Number"));
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        JLabel label3= new JLabel("ROOM NUMBER");
        label3.setBounds(30,130,150,20);
        label3.setFont(new Font("Poppins",Font.BOLD,14));
        label3.setForeground(Color.WHITE);
        panel.add(label3);

        JLabel RNo= new JLabel();
        RNo.setBounds(200,130,150,20);
        RNo.setFont(new Font("Poppins",Font.BOLD,14));
        RNo.setForeground(Color.WHITE);
        panel.add(RNo);

        JLabel label4= new JLabel("IN TIME");
        label4.setBounds(30,180,150,20);
        label4.setFont(new Font("Poppins",Font.BOLD,14));
        label4.setForeground(Color.WHITE);
        panel.add(label4);

        JLabel INtime= new JLabel();
        INtime.setBounds(200,180,250,20);
        INtime.setFont(new Font("Poppins",Font.BOLD,14));
        INtime.setForeground(Color.WHITE);
        panel.add(INtime);

        JLabel label5= new JLabel("OUT TIME");
        label5.setBounds(30,230,150,20);
        label5.setFont(new Font("Poppins",Font.BOLD,14));
        label5.setForeground(Color.WHITE);
        panel.add(label5);

        Date date=new Date();

        JLabel OUTtime= new JLabel(""+date);
        OUTtime.setBounds(200,230,200,20);
        OUTtime.setFont(new Font("Poppins",Font.BOLD,14));
        OUTtime.setForeground(Color.WHITE);
        panel.add(OUTtime);

        JButton discharge = new JButton("Discharge");
        discharge.setBounds(30, 300, 120, 30);
        discharge.setBackground(Color.BLACK);
        discharge.setForeground(Color.WHITE);
        panel.add(discharge);

        discharge.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conn c = new conn();
                try {
                    c.statement.executeUpdate("delete from patient_info where Number='" + choice.getSelectedItem() + "' ");
                    c.statement.executeUpdate("update Room set Availability='Available' where room_no='"+RNo.getText()+"' ");
                    JOptionPane.showMessageDialog(null,"Done");
                    setVisible(false);
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton check=new JButton("Check");
        check.setBounds(170,300,120,30);
        check.setBackground(Color.BLACK);
        check.setForeground(Color.WHITE);
        panel.add(check);

        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conn c=new conn();
                try{
                    ResultSet resultSet=c.statement.executeQuery("select * from patient_info where Number ='"+choice.getSelectedItem()+"'");
                    while(resultSet.next()){
                        RNo.setText(resultSet.getString("Room_Number"));
                        INtime.setText(resultSet.getString("Time"));
                    }

                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });


        JButton back=new JButton("Back");
        back.setBounds(300,300,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });






        setUndecorated(true);
        setSize(800,400);
        setLayout(null);
        setLocation(400,250);
        setVisible(true);

    }

    public static void main(String[] args){
        new patient_discharge();
    }
}
