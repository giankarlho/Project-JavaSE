package algoritmos;

import java.util.Scanner;

public class SumImpar {
        public static void main(String[] args) {
        int suma = 0;
        System.out.println("Ingresa el nro. !");
        Scanner ingreso = new Scanner(System.in);
        int N = ingreso.nextInt();
        for (int j=1 ; j <=N ; j++){
            suma = suma + (j*2-1);            
//            System.out.println(j*2);
        }
        System.out.println("La suma es: " + suma);
    }
}
