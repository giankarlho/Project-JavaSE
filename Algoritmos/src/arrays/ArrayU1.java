package arrays;

import java.util.Scanner;

public class ArrayU1 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        int notas[] = new int[3];
        for(int f=0; f < notas.length; f++){
            System.out.println("Ing. la nota " + (f+1));
            notas[f] = ingresar.nextInt();
        }
        for(int i=0; i < notas.length; i++){
            System.out.println("Las notas " + notas[i]);
        }
    }

}
