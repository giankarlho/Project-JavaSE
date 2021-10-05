package algoritmos;

import java.util.Scanner;

public class ParNroIng {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingresa el number");
		int cant = leer.nextInt();
		int sum =  0;	// declarar la suma que empiece en 0
		int nro;		// declarando el numero �ndice
		nro= cant;		// asignando la cantidad al n�mero
		if (cant % 2 != 0){	// si es impar; lo vuelvo par
			nro-=1;			// nro = nro - 1
		}
		int acu = nro;
		for (int b=1; b<= cant; b++){	// cant. n�mero ingresado
			acu+=2;			// acu = acu + 2
			System.out.print(acu + " ");
			sum+=acu;		// sum = sum + acu	
		}
		System.out.println(" ");
		System.out.println("La suma es: " + sum);
	}
}
