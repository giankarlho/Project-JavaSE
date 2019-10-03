package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ing. el 1er nro");
        Scanner ingreso = new Scanner(System.in);
        int nro1 = ingreso.nextInt();
        System.out.println("Ing. el 2do nro");
        int nro2 = ingreso.nextInt();
        if(nro1 > nro2){
            System.out.println("El nro1 es mayor"); 
        }else if(nro2 > nro1){
            System.out.println("El nro2 es mayor"); 
        }else{
            System.out.println("Son iguales"); 
        }
    }   
}
