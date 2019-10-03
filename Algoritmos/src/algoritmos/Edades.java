package algoritmos;

import java.util.Scanner;

public class Edades {
    public static void main(String[] args) {
        System.out.println("Ingresa tu edad");
        Scanner leerEdad = new Scanner(System.in);
        byte edad = leerEdad.nextByte();
        if (edad < 5){
            System.out.println("Bebito");
        } else if (edad > 4 && edad < 12){
            System.out.println("Es una niña...");
        } else if (edad > 11 && edad < 18){
            System.out.println("Es una nena joven");
        } else if (edad > 17 && edad < 25){
            System.out.println("Es adolecente");
        }else if (edad > 24 && edad < 61){
            System.out.println("Es adulto");
        }else {
            System.out.println("Es adulto mayor");
        }        
    }  
}
