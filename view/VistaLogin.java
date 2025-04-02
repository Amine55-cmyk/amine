package view;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Component;

public class VistaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JTextField usuario;
	private JTextField password;


	/**
	 * Launch the application.
	 */
	/*El main para cargar una vista ejecutandola directamente.
	 * public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin frame = new VentanaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
    public JButton getBtnRegistrar() {
    	return btnNewButton;
    }
   public JTextField getTxtUsuario() {
	   return usuario;
   }
   public JTextField getTxtContraseña() {
	   return password;
   }

	/**
	 * Create the frame.
	 */
	public VistaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5)); // 3 filas, 2 columnas

		panel.add(new JLabel("Usuario"));
		usuario = new JTextField(10);
		panel.add(usuario);

		panel.add(new JLabel("Contraseña"));
		password = new JTextField(10);
		panel.add(password);

		panel.add(new JLabel("")); // Celda vacía para mantener alineación
		btnNewButton = new JButton("Registrar");
		panel.add(btnNewButton);

		contentPane.add(panel);
		
		
	}

}
