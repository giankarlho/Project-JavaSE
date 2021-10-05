package algoritmos;

import java.util.Scanner;

public class PromedioNotas {

    public static void main(String[] args) {        
        Scanner ingreso = new Scanner(System.in);
        int cantN = 0, suma = 0;
        int opcion = 1;  // por defecto voy a ingresar una nota
        while (opcion == 1) {            
            cantN++;
            System.out.println("Ingresa la nota " + cantN);
            Scanner leerNota = new Scanner(System.in);
            suma = leerNota.nextInt() + suma;
            System.out.println("Pon 1: para seguir y 2: para salir");
            opcion = ingreso.nextInt();
        }
        System.out.println("El promedio es : " + suma/cantN);
    }
}
