package Ventana;

import java.awt.Color;

import javax.swing.JButton;

public class Notificacion {
	private String textoImpreso = "";
	private String nombreBoton = "";
	private String nuevoColorBackground = "";
	
	public Notificacion() {
	}
	
	public void enviarNotificacion(String txtImp, String nom, String col) {
		this.textoImpreso=txtImp;
		this.nombreBoton=nom;
		this.nuevoColorBackground=col;
	}
}
