import javax.swing.JFrame;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 
public class Login  extends JFrame{

    // atributos 
    private int ancho = 300; 
    private int largo = 500; 
    private JPanel panel ; 
    private JLabel e; 
    private JLabel e2; 
    private JLabel e3; 
    private JButton b; 
    private JTextField c; 
    private JTextField c2; 

    public Login(){

        // parametros de la ventana 
        this.setSize(ancho, largo);
        this.setLocationRelativeTo(null);// centrar la ventana 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);// al presionar el tache se cierra 
        this.setResizable(false);// no se puede minimizasr maximizar 
        this.setTitle("Login");// titulo
        paneles(); // lo are de forma modular 
    }
    public void paneles(){
        panel = new JPanel(); // lo mandamos a llmar 
        panel.setLayout(null);// diseño de fabrica 
        this.getContentPane().add(panel); // agregamos ala ventana 
        etis(); // metodos 
        botones(); // metodos 
        campos(); 
    }
    public void etis(){

        e = new JLabel(); 
        e.setBounds(100,100,120,20); // ubicacion 
        e.setFont(new Font("arial",Font.BOLD,22));// tipo de letra 
        e.setText("Ingresar");// texto de la etiqueta 
        panel.add(e); // agregar al panel 

        e2 = new JLabel(); 
        e2.setBounds(35, 250, 120, 20);
        e2.setText("Usuario");
        panel.add(e2); 

        e3 = new JLabel(); 
        e3.setBounds(35, 300, 120, 20);
        e3.setText("Contraseña");
        panel.add(e3); 


    }
    public void campos(){

        c = new JTextField(); 
        c.setBounds(150, 256, 120, 20);
        panel.add(c); 

        c2 = new JTextField(); 
        c2.setBounds(150, 306, 120, 20);
        panel.add(c2); 

    }
    public void botones(){

        b = new JButton(); 
        b.setBounds(100, 356, 120, 20);
        b.setText("Iniciar");
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = c.getText();
                String paswd = c2.getText();

                if (usuario.isEmpty() || paswd.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Algún campo esta vacio");

                } else {
                    if (usuario.equals("Usuario") && paswd.equals("1234")) {
                        Menu obj = new Menu(); 
                        obj.setVisible(true);
                        setVisible(false);

                    } else {
                        JOptionPane.showConfirmDialog(null, "Su usuario o contraseña es incorrecto");
                    }
                }
            }
            
        });
        panel.add(b); 

    }

    
}