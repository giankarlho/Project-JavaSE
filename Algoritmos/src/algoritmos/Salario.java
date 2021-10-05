package algoritmos;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Ingrese la cantidad de Obreros");
		int cobrero = leer.nextInt();
		
		for (int i=0; i< cobrero; i++){
			System.out.println("Ingrese las horas trabajadas del obrero: " + (i+1));
			int cantH = leer.nextInt();
			if (cantH <= 20){
				System.out.println("El salario del obrero" + (i+1)+ "es: " + 25*cantH );				
			}
			else {
				System.out.println("El salario del obrero" + (i+1)+ "es: " + ((25*20) + (cantH -20)*20) );
			}
		}
		leer.close();
	}
}
