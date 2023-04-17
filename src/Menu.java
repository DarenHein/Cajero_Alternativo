import javax.swing.JFrame;
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
        campos(); 
        botones(); 
    }

}