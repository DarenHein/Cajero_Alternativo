import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Menu extends JFrame{
    private int csaldo; 
    private int cdeposito; 
    private int cretiro; 
    private String campo_saldo; 
    private String campo_retiro; 
    private String campo_deposito; 
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
        c.setBounds(350, 120, 120, 25);// saldo
        c.setEditable(false);
        panel.add(c); 

        c2 = new JTextField("0"); 
        c2.setBounds(350, 200, 120, 25);// retiro
        panel.add(c2); 

        c3 = new JTextField("0"); 
        c3.setBounds(350, 280, 120, 25);// deposito
        panel.add(c3); 


    }

    public void botones(){
        b = new JButton("Siguiente");
        b.setBounds(350, 450, 120, 25);
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             
             campo_saldo = c.getText(); 
             campo_deposito = c3.getText(); 
             campo_retiro = c2.getText(); 
             csaldo = Integer.parseInt(campo_saldo); 
             cretiro = Integer.parseInt(campo_retiro); 
             cdeposito = Integer.parseInt(campo_deposito); 
             
             

            }
        }); 

       
        panel.add(b);  

        b2 = new JButton("Salis");
        b2.setBounds(150, 450, 120, 25);
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               
            }
            
        });
        panel.add(b2);  
    }

}