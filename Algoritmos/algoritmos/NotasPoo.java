package algoritmos;

import java.util.Scanner;

public class NotasPoo {

    public static void main(String[] args) {
        System.out.println("Ingresa tu evaluación: 5 ,10,15,20");
               
        Scanner leer = new Scanner(System.in);
        int nota = leer.nextInt();
        switch (nota){ // variable int: 5, 10 o char 'M', 'S'
            case 5: 
                System.out.println("Preocupante, ni lo mires");
                break;
            case 10:
                System.out.println("No lo contrates");
                break;
            case 15:
                System.out.println("Calificado");
                break;
            case 20: 
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Ingresa los nros. que te mencioné opa");
                break;
        }
    }
}
