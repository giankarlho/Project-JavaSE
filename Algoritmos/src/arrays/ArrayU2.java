package arrays;

import java.util.Scanner;

public class ArrayU2 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        System.out.println("Ingr. la cant. de notas");
        int cant = ingresar.nextInt();
        int notas[] = new int[cant];
        double suma = 0.0;
        for(int f=0; f < notas.length; f++){
            System.out.println("Ing. la nota " + (f+1));            
            notas[f] = ingresar.nextInt();
            suma+= notas[f];
        }
        for(int i=0; i < notas.length; i++){
            System.out.println("Las notas " + notas[i]);
        }
        System.out.println("El promedio es " + suma/cant);
    }

}
