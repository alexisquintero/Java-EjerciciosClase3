package ejercicio2;

import java.util.Scanner;

public class CargaMayores {

	public static void main(String[] args) {
		
		int max, nro, indice = 0;
		int[] lista = new int [20];
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese el n�mero m�nimo");
		max = s.nextInt();
		
		System.out.println("Ingrese 20 n�meros");
		for (int i = 0; i < lista.length; i++) {
			nro = s.nextInt();
			if (nro > max) {
				lista[indice] = nro ;
				indice++;
			} 
			System.out.println("Item: " + String.valueOf(i + 1) + " se ha ingresado");
		}
		for (int i : lista) {
				System.out.println(i);
			}
		s.close();	
		
	}

}
