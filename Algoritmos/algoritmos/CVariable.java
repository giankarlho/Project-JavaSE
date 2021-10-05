package algoritmos;

import java.util.Scanner;

public class CVariable {

	public static void main(String[] args) {
		Scanner dato = new Scanner (System.in);
		
		System.out.println("Ingrese la Variable 1");
		String var1 = dato.next();
		
		System.out.println("Ingrese la Variable 2");
		String var2 = dato.next();
		
		String aux;
		
		aux = var1;
		var1 = var2;
		var2 = aux;
		
		System.out.println("la variable 1 es: " + var1);
		System.out.println("la variable 2 es: " + var2);		
		
	}
}
