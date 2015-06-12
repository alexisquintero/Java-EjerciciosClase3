package ejercicio1;

import java.util.Scanner;


public class Carga10Elementos {

	public static void main(String[] args) {
		
		int[] lista = new int[10];
		int[] listaAux = new int[10];
		Scanner s = new Scanner(System.in);
		int aux = 9;
		
		System.out.println("Ingrese 10 números");
		for (int i = 0; i < 10; i++) {
			lista[i] = s.nextInt();	
			System.out.println("Elemento: " + String.valueOf(i + 1) + " ingresado");
		}
		
		for (int j = 0; j < 10; j++) {
			listaAux[aux] = lista[j];
			aux--;
		}
		
		for (int k : listaAux) {
			System.out.println(k);
		}
	
		s.close();

	}

}
