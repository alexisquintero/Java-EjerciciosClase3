package ejercicio3;

import java.util.Scanner;

public class Principal {
	
	public void main(){
		
	}
	
	public void cargaPersonas(){
		
		Scanner s = new Scanner(System.in);
		String resp;
		Persona[] p = new Persona[5];
		
		for (int i = 0; i < p.length; i++) {			
			System.out.println("Empleado o Cliente (E/C)?");
			resp = s.nextLine();
			if (resp.toLowerCase() == "e") {
				p[i] = this.cargaEmpleado();
			}else if (resp.toLowerCase() == "c") {
				p[i] = this.cargaCliente();
			};
		
		} 
		s.close();
	}
	
	public Persona cargaDatos(Persona per){
		
		
		return per;
	}
	
	protected Empleado cargaEmpleado(){
		
		Empleado emp = new Empleado();
		
		emp.cargaDatosEmpleado();
		
		return emp;
	}
	
	protected Cliente cargaCliente(){
		
		Cliente cli = new Cliente();
		
		cli.cargaDatosCliente();
		
		return cli;
	}

}

