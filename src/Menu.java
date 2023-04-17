import javax.swing.JFrame;

import java.awt.Font;

import javax.swing.*;

public class Menu extends JFrame{
    private int ancho = 600; 
    private int largo = 600; 
    private JPanel panel;
    private JLabel e,e1,e2,e3,e4; 
    private JTextField c,c1,c2,c3; 
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
        campos(); 
        botones(); 
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

        e4 = new JLabel("Deposito"); 
        e4.setBounds(100, 280, 120, 20);
        e4.setFont(new Font("arial",Font.BOLD,18)); 
        panel.add(e4); 
    }
    public void campos(){
        c = new JTextField("0"); 
        c.setBounds(350, 120, 120, 25);
        c.setEditable(false);
        panel.add(c); 

        c2 = new JTextField(); 
        c2.setBounds(350, 200, 120, 25);
        panel.add(c2); 

        c3 = new JTextField(); 
        c3.setBounds(350, 280, 120, 25);
        panel.add(c3); 


    }

    public void botones(){
        b = new JButton("Siguiente");
        b.setBounds(350, 450, 120, 25);
        panel.add(b);  

        b2 = new JButton("Salis");
        b2.setBounds(150, 450, 120, 25);
        panel.add(b2);  
    }

}