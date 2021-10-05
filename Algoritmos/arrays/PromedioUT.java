package arrays;

import java.util.Scanner;

public class PromedioUT {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		// creando el Arreglo Unidimensional
		// de tama�o ingresado por teclado
		System.out.println("Ingresa la cantidad");
		int Arreglo[] = new int[leer.nextInt()];
		
		for(int i=0; i< Arreglo.length ; i++ ){
			System.out.println("Ingresa el valor: " + (i+1));
			Arreglo[i] = leer.nextInt();
		}
		
		int suma = 0;
		double promedio =0;
		// Arreglo.length : me indica la cantidad 
		for(int n=0;n<Arreglo.length;n++){ 
			suma = suma + Arreglo[n];
		}
		promedio = suma/Arreglo.length;
		System.out.println("La suma es: " + suma);
		System.out.println("El promedio es: " + promedio);
		
	}

}
