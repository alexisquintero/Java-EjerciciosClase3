package ejercicio3;

public class Empleado extends Persona {
	
	private String puesto;
	private String legajo;
	
	public String descGral(){
		
		String datos;
		
		datos = dni + nombre + apellido + puesto + legajo;
		
		return datos;
	}

}
