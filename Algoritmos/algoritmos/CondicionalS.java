package algoritmos;

import java.util.Scanner;

public class CondicionalS {

	public static void main(String[] args) {
	// Par N obreros
	// Si el obrero trabaja menos o igual a 20 horas, se le paga
	// $25. Caso contrario $20 por cada hora adicional
		
//		Scanner Yosoy;		// declaro		
//		Yosoy = new Scanner(System.in);	// instancia o creo el objeto
		
		Scanner Yosoy = new Scanner (System.in);
		double tpago = 0;
		int horasext = 0;
		System.out.println("Ingrese la cantidad de obreros");
		int N = Yosoy.nextInt();
		for(int i=0; i<N; i++){	// N obreros
			System.out.println("Ingrese la cantidad de Horas del obrero " + (i+1));
			int Choras = Yosoy.nextInt();
			if (Choras <= 20){
				tpago = 20*25;
				System.out.println("El pago es: " + tpago);
			}else if(Choras>20){
				tpago = 20*25;
				horasext = Choras - 20 ;
				tpago = tpago + horasext*20;
				System.out.println("El pago es: " + tpago);
			}
		}
	}
}
