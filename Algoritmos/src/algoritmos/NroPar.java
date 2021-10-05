package algoritmos;

import java.util.Scanner;

public class NroPar {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int cantnro = leer.nextInt();
		
		// 1era. forma
		int j = 0;
//		for (int k = 0; k < cantnro; k++ ){
		for (int k = 1; k <= cantnro; k++ ){
			j+=2;
			System.out.println(j);
		}
		
		// 2da. forma
//		for (int k = 1; k <= cantnro; k+=2 ) // nro. impar
		for (int k = 0; k < cantnro*2; k+=2 ){
			System.out.println(k+2);
		}
	}
}
