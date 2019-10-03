package algoritmos;

import java.util.Scanner;

public class Multiplos2y3 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		try {
			System.out.println("Ingrese la cantidad de elementos");
			int cant = leer.nextInt();
			for (int m=1; m<= cant ; m++){
				System.out.println(m*6);
			}
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Ingresa bien el tipo de datos");
		}
	}
}


