import javax.swing.JFrame;

import java.awt.Font;

import javax.swing.*;

public class Menu extends JFrame{
    private int ancho = 600; 
    private int largo = 600; 
    private JPanel panel;
    private JLabel e,e1,e2,e3,e4; 
    private JTextField c,c1,c2; 
    private JButton b,b1,b2; 

    public Menu(){
       this.setSize(ancho, largo);
       this.setLocationRelativeTo(null);
       this.setTitle("Menu");
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setResizable(false);
       paneles(); 
    }
    public void paneles(){
        panel = new JPanel(); 
        panel.setLayout(null);
        this.getContentPane().add(panel); 
        eti();
       // campos(); 
        //botones(); 
    }
    public void eti(){
        e = new JLabel("CAJERTO ATM"); 
        e.setBounds(220, 30, 180, 30);
        e.setFont(new Font("arial",Font.BOLD,22)); 
        panel.add(e); 

        e2 = new JLabel("Saldo : "); 
        e2.setBounds(100, 120, 120, 20);
        e2.setFont(new Font("arial",Font.BOLD,18)); 
        panel.add(e2); 

        e3 = new JLabel("Retiro"); 
        e3.setBounds(100,200,120,20); 
        e3.setFont(new Font("arial",Font.BOLD,18)); 
        panel.add(e3); 
    }

}