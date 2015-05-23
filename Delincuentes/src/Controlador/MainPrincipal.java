package Controlador;

import Vista.FramePrincipal;
import Modelo.ModeloConexion;


public class MainPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModeloConexion objetoConexion;
		objetoConexion=new ModeloConexion("localhost","delincuentes","root","silphp");
		
		objetoConexion.connectBD();
		FramePrincipal frame = new FramePrincipal();
		frame.setVisible(true);
	}

}
