package ejercicio3;

public class Cliente extends Persona {
	
	private String cuit;
	private String direccion;
	
	public String descGral(){
		
		String datos;
		
		datos = dni + nombre + apellido + cuit + direccion;
		
		return datos;
	}
	
}
