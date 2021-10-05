
package ejercicios;

// Calcular el factorial de un nro

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        System.out.println("Ing. el nro");
        Scanner ingreso = new Scanner(System.in);
        int N = ingreso.nextInt();
        double factorial = 1;        
        for(int k=N ; k >= 1 ; k--){
           factorial*=k; // factorial = factorial*k
        }                
        System.out.println("El factorial es: " + factorial);
    }
}
