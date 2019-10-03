package algoritmos;

import java.util.Scanner;

public class Arbolito {

    public static void main(String[] args) {
        System.out.println("Ingresa la cantidad de filas de *");
        Scanner leer = new Scanner(System.in);
        int cant = leer.nextInt();
        System.out.println("Lo quieres paradito P  o hechadito H ?");
        Scanner ingreso = new Scanner(System.in);
        String opcion = ingreso.next();
        int col = 0;
        switch (opcion) {
            case "P": // arbolito paradito
                col = 0;
                for (int i = 1; i <= cant; i++) {   // filas            
                    col++;
                    for (int j = 1; j <= col; j++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;
            case "H": // arbolito hechadito
                col = cant;
                for (int i = 1; i <= cant; i++) {   // filas            
                    for (int j = 1; j <= col; j++) {
                        System.out.print("* ");
                    }
                    col--;
                    System.out.println(" ");
                }
                break;
            default:
                System.out.println("Ingrese P  o H, monse");
        }
    }
}
