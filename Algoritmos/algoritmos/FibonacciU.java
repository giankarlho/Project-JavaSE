package algoritmos;

import java.util.Scanner;

public class FibonacciU {

	public static void main(String[] args) {
		try {
			Scanner leer = new Scanner(System.in);
			System.out.println("Ingrese la cantidad de elementos");
			int cant = leer.nextInt();		
			int Fibo[] = new int[cant];
			Fibo[0]=0;
			Fibo[1]=1;		
			System.out.print("0 , 1 , ");
			for (int i = 2 ; i < cant; i++){
				Fibo[i]=Fibo[i-1] + Fibo[i-2];
				System.out.print(Fibo[i] + " , ");
			}
			leer.close();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Ingresa un entero");
		}
	}
}
