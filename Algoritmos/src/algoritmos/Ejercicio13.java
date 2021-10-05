package ejercicios;
// Se pide representar el algoritmo que nos calcule la suma de los N primeros números
// pares. Es decir, si insertamos un 5, nos haga la suma de 6+8+10+12+14
// 5: 6 8 10 12 14
// 4: 6 8 10 12

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ing. un nro");
        int cant = leer.nextInt();
        int nro = cant;
        if (nro % 2 != 0) { // si el nro es impar
            nro += 1; // nro = nro + 1            
        }
        for (int i = 1; i <= cant; i++) {
            System.out.println((nro + (i *2-2)) );
        }
    }
}
