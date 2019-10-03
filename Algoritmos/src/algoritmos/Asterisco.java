package algoritmos;

import java.util.Scanner;

public class Asterisco {

	public static void main(String[] args) {
		Scanner ast = new Scanner(System.in);
		
		System.out.println("Ingrese la cant.");
		int elem = ast.nextInt();
		int var = elem;
		int esp = 0;
		for (int i=1; i<= elem; i++){  // filas
			for(int k=0;k<= esp; k++){ // espacio en blanco
				System.out.print(" ");
			}
			esp++;
			for (int j=var; j>=1 ; j--){ // 
				System.out.print("*");
			}			
			var--;
			System.out.println("");
		}		
	}
}
