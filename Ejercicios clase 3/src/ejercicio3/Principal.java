package ejercicio3;

import java.util.Scanner;
import java.util.Arrays;



public class Principal {
	
	Persona [] per = new Persona[5];
	
	public void main(){
		
		Scanner s = new Scanner(System.in);
				
		this.cargaPersonas(s);
		this.ordenaPersonas();
		this.muestraPersonas();
		
		s.close();
	}
	
	private void cargaPersonas(Scanner s){
		
		String resp = "";
		int index = 0;
		
		while (index < per.length){			
			System.out.println("Empleado o Cliente (E/C)?");
			resp = s.nextLine();
			if (resp.toLowerCase() == "e") {
				per[index] = this.cargaEmpleado(s);
				index++;
			}else if (resp.toLowerCase() == "c") {
				per[index] = this.cargaCliente(s);
				index++;
			};
		
		} 	
	}

	private void muestraPersonas(){
		for (int i = 0; i < per.length; i++) {
			System.out.println("Los datos de la persona nro " + String.valueOf(i + 1) + " son: " + per[i].descGral());
		}
	}
	
	private void ordenaPersonas(){
		
		Arrays.sort(per);

	}
	
		
	private Empleado cargaEmpleado(Scanner s){
		
		Empleado emp = new Empleado();
		
		emp.cargaDatosEmpleado(s);
		
		return emp;
	}
	
	private Cliente cargaCliente(Scanner s){
		
		Cliente cli = new Cliente();
		
		cli.cargaDatosCliente(s);
		
		return cli;
	}

}

