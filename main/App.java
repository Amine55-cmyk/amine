package main;

import controller.ControlerLogin;
import view.VistaLogin;

/*
 * Usuario (Modelo): Contiene los datos del usuario y verifica credenciales.

   VentanaLogin (Vista): Contiene la interfaz gráfica (JTextField, JPasswordField y JButton).

   ControladorLogin (Controlador):Maneja los eventos de la vista y usa el modelo para verificar los datos.

   Main (Inicio de la aplicación): Crea el modelo, la vista y el controlador y los enlaza.*/

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        //Cargamos la vista
		        VistaLogin vista = new VistaLogin();
		        //Le pasamos la vista al controlador
		        ControlerLogin controlador = new ControlerLogin(vista);
		        //El controlador manejara el boton cuando le demos a registrar.
		        
		        //Iniciamos la vista.
		        controlador.iniciar();
	 }


}
