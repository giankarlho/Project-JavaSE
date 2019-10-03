package calculadora;
// Esta es una calculadora acumulada y con manejor de error

import java.util.Scanner;

public class Calculadora3 {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int  condicion = 1 ; // -128 a 127 
        Double nro1,nro2,resultado = 0.0; // decimales +-3.4 *10ala38 
        char ope;
        System.out.println("Ing. nro1");
        nro1 = ingreso.nextDouble();
        while (condicion == 1) {
            System.out.println("Ingresa el operador");
            ope = ingreso.next().charAt(0); // + - * / 
            System.out.println("Ingresa el siguiente número");
            nro2 = ingreso.nextDouble();
            switch (ope) {
                case '+': resultado = nro1 + nro2;  break;
                case '-': resultado = nro1 - nro2;  break;
                case '*': resultado = nro1 * nro2;  break;
                case '/': resultado = nro1 / nro2;  break;
            }
            System.out.println("Deseas seguir: SI-1, NO-2");
            condicion = ingreso.nextInt(); 
            nro1 = resultado;
            System.out.println("El resultado es :" + resultado);
        }        
    }
}
