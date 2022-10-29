package Ventana;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public aspect ControladorNotificaciones {
	String enArchivos = System.getProperty("user.dir") + "\\logs\\";
	int cont=1;
	
	pointcut llamada(): call(* Notificacion.enviarNotificacion(String, String, String));
	
	before(): llamada() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(enArchivos+"logs.txt", true));
			writer.write("Se ha cambiado el fondo de color: "+cont+" veces\n");
			writer.close();
			cont++;
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	
	
}
