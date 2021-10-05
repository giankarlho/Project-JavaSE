package ejercicios;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ing. un nro");
        int nro = leer.nextInt();
        int u,d,c;
        c = nro % 10;
        d = (nro % 100)/10;
        u = nro / 100;
        System.out.println("El nro. invertido es: " + c + d + u);
        System.out.println("La suma de sus cifras es: " + (c + d + u));
    }
}
