package algoritmos;

import java.util.Scanner;

public class CantPrimos {

    public static void main(String[] args) {
        int nroPrimo = 0;
        int nro = 1;
        Scanner leer = new Scanner(System.in);
        int cantPrimo = leer.nextInt(); // cantidad de primos: 5
        while (nroPrimo < cantPrimo) {
            // algoritmo para saber si es primo o no ?
            int div = 0;                
            nro++;      // nro = nro + 1
            for (int a = 1; a <= nro; a++) {
                if (nro % a == 0) {
                    div++; // div = div + 1
                }
            }
            if (div == 2) { // comparando si es Primo
                nroPrimo++; // nroPrimo = nroPrimo + 1
                System.out.print("  " + nro);
            }
        }
    }
}
