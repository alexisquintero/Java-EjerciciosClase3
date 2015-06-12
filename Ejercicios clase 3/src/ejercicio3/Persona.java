package ejercicio3;

public class Persona {

	protected int dni;
	protected String nombre;
	protected String apellido;

	public String descGral(){
		
		String datos;
		
		datos = dni + nombre + apellido;
		
		return datos;
	}
}
