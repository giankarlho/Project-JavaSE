package calculadora;

import java.util.Scanner;


public class Calculadora2 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int nro1=0,nro2=0; // -128 a 127 
        Double resultado = 0.0 ; // decimales +-3.4 *10ala38 
        char ope;
        System.out.println("Ing. nro1");
        nro1 = ingreso.nextInt();
        System.out.println("Ingresa el siguiente número");
        nro2 = ingreso.nextInt();
        System.out.println("Ingresa el operador");
        ope = ingreso.next().charAt(0); // + - * / 
        switch(ope){
            case '+': resultado = (double) (nro1 + nro2); break;  
            case '-': resultado = (double) (nro1 - nro2); break;
            case '*': resultado = (double) (nro1 * nro2); break;
            case '/': resultado = (double) (nro1 / nro2); break;
        }
        System.out.println("El resultado es :" + resultado);
    }
}
