package Ventana;

public aspect Notificacion {
	
	pointcut llamada(): call(* ventana.accionBoton());
	
	before() : llamada(){ 
		System.out.println("boton presionado");
	}
}
