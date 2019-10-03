package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nro = leer.nextInt();
        if (nro % 2 == 0) {
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }

}
