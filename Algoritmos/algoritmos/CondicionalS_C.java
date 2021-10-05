package algoritmos;

import java.util.Scanner;

public class CondicionalS_C {

	public static void main(String[] args) {
		Scanner Yosoy = new Scanner (System.in);
		
		System.out.println("Ingrese la cantidad de obreros");
		int N = Yosoy.nextInt();
		for(int i=0; i< N; i++){	// N obreros
			System.out.println("Ingrese la cantidad de Horas del obrero " + (i+1));
			int Choras = Yosoy.nextInt();
			if (Choras <= 20){			
				System.out.println("El pago es: " + (20*25));
			}else  {
				System.out.println("El pago es: " + ((20*25)+(Choras-20)*20));
			}
		}
	}

}
