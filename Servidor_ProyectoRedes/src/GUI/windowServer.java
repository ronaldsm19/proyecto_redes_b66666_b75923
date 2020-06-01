
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import servidor_proyectoredes.EchoMultiServer;

/**
 *
 * @author Graciela Porras
 */
public class windowServer extends JInternalFrame implements ActionListener, Runnable {

    JButton btnRegistrar;
    JLabel lbUsuario, lbContrasenna;
    JTextField tfUsuario, tfContrasenna;

    public windowServer(EchoMultiServer myServer) {
        super();
        
        init();
    }//Constructor

    public void init() {

        this.setVisible(true);
        this.setLayout(null);
        this.setClosable(true);
        this.setBackground(new java.awt.Color(255, 255, 255));

        this.setBounds(500, 100, 30, 10);

        this.lbUsuario = new JLabel("Nombre de Usuario");
        this.lbContrasenna = new JLabel("Contraseña");
        this.btnRegistrar = new JButton("Registrar");

        this.tfUsuario = new JTextField();
        this.tfContrasenna = new JTextField();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.lbUsuario.setBounds(50, 50, 150, 20);
        this.add(this.lbUsuario);

        this.lbContrasenna.setBounds(50, 100, 150, 20);
        this.add(this.lbContrasenna);

        this.tfUsuario.setBounds(200, 50, 150, 20);
        this.add(this.tfUsuario);

        this.tfContrasenna.setBounds(200, 100, 150, 20);
        this.add(this.tfContrasenna);

        this.btnRegistrar.setBounds(100, 150, 165, 20);
        this.add(this.btnRegistrar);
        this.btnRegistrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(btnRegistrar)) {
            File directorio = new File("C:/Users/Graciela Porras/Desktop/U/directorio_nuevo");
            if (!directorio.exists()) {
                if (directorio.mkdirs()) {
                    System.out.println("Directorio creado");
                } else {
                    System.out.println("Error al crear directorio");
                }
            }
        }

    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
