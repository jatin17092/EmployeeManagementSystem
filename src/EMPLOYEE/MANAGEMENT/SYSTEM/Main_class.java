package EMPLOYEE.MANAGEMENT.SYSTEM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame {

    Main_class(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000,630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1000,630);
        add(image);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(280,155,400,40);
        heading.setFont(new Font("Raleway", Font.BOLD,25));
        image.add(heading);

        JButton add = new JButton("Add Employee");
        add.setBounds(290,270,150,40);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddEmployee();
                setVisible(false);


            }
        });
        image.add(add);
//2 button
        JButton view = new JButton("View Employee");
        view.setBounds(500,270,150,40);
        view.setForeground(Color.WHITE);
        view.setBackground(Color.BLACK);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new View_employee();
                setVisible(false);

            }
        });
        image.add(view);

        // 3 button
        JButton rem = new JButton("Remove Employee");
        rem.setBounds(390,370,150,40);
        rem.setForeground(Color.WHITE);
        rem.setBackground(Color.BLACK);
        rem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RemoveEmployee();

            }
        });
        image.add(rem);

        setSize(1000,630);
        setLocation(200,80);
        setLayout(null);
        setVisible(true);


    }

    public static void main(String[] args) {

        new  Main_class();
    }

}