package Ventana;

public aspect Notificacion {
	
	pointcut llamada(): call(* ventana.accionBoton());
	
	after(): llamada(){
		System.out.println("Aspecto funciona");
	}
}
