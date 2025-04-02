package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.VistaLogin;
import view.VistaBienvenida;

public class ControlerBienvenida {

    private VistaBienvenida vista;

    public ControlerBienvenida(VistaBienvenida vista) {
        this.vista = vista;

        // Verificar que la instancia es correcta
        System.out.println("Controlador creado con vista: " + this.vista);

        this.vista.getBtnSalir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botón Salir presionado"); // Depuración
                salir();
            }
        });
    }

    public void iniciar() {
        vista.setVisible(true);
    }

    public void salir() {
        JOptionPane.showMessageDialog(vista, "¡Hasta la próxima, " + vista.getUsuario() + "!");

        // Cerrar la ventana actual
        vista.dispose();

        // Abrir la ventana de login
        VistaLogin vistaLogin = new VistaLogin();
        ControlerLogin controladorLogin = new ControlerLogin(vistaLogin);
        controladorLogin.iniciar();
    }
}
