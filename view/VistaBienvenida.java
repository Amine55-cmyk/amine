package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VistaBienvenida extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JButton botonSalir;
    private String usuario;

    public VistaBienvenida(String usuario) {
        this.usuario = usuario;
        setTitle("Bienvenido " + usuario);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.setLayout(new BorderLayout());
        setContentPane(contentPane);

        JPanel panel = new JPanel(new GridLayout(1, 1, 5, 5));
        botonSalir = new JButton("Salir");
        panel.add(botonSalir);

        contentPane.add(panel, BorderLayout.SOUTH);
    }

    public JButton getBtnSalir() {
        return botonSalir;
    }

    public String getUsuario() {
        return usuario;
    }
}
