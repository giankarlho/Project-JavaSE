package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        System.out.println("Ingresa la clave secreta");
        Scanner ingreso = new Scanner(System.in);
        String texto = ingreso.next();
        int intentos = 1;
        while (intentos < 3) {
            if (texto.equals("yosoy")) {
                System.out.println("Chevere, ingresaste !!!");
                break;
            } else {
                System.out.println("Ing. la clave otra vez, intento " + (intentos+1));
                texto = ingreso.next();
                intentos++; // intentos = intentos + 1
            }
        }
        if (intentos==3){
            System.out.println("Fuera!!! acabaste tus intentos insecto...");
        }        
    }
}
// Teniendo en cuenta que la clave es “yosoy”, escribir un algoritmo que nos pida una
// clave. Solo tenemos 3 intentos para acertar, si fallamos los 3 intentos nos mostrara un
// mensaje indicándonos que hemos agotado esos 3 intentos. Si acertamos la clave, saldremos
// directamente del programa