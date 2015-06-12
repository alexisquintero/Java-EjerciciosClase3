package ejercicio3;

import java.util.Scanner;
import java.util.Arrays;



public class Principal {
	
//	Persona [] per = new Persona[5];
	Persona [] per = new Persona[2];
	
	public static void main(String[] args) {
		Principal p = new Principal();
		p.ejecutar();

	}
	
	public void ejecutar(){
		
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
			resp = s.nextLine().toUpperCase();
			if (resp.equalsIgnoreCase("E")) {
				per[index] = this.cargaEmpleado(s);
				index++;
			}else if (resp.equalsIgnoreCase("C")) {
				per[index] = this.cargaCliente(s);
				index++;
			}
		
		} 	
	}

	private void muestraPersonas(){
		for (int i = 0; i < per.length; i++) {
			System.out.println("Los datos de la persona nro " + String.valueOf(i + 1) + " son: " + per[i].descGral());
		}
	}
	
	private void ordenaPersonas(){
		
		//eArrays.sort(per);

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

