package algoritmos;

import java.util.Scanner;

public class NroPerfecto {
    public static void main(String[] args) {
        int sumDiv = 0;        
        System.out.println("Ingresa el nro.");
        Scanner leer = new Scanner(System.in);
        int nro = leer.nextInt();
        for (int p=1 ; p < nro ; p++){
            if (nro % p == 0){
                sumDiv = sumDiv + p;
            }
        }        
        if (nro == sumDiv){
            System.out.println("Eres perfecta para mí");
        }else{
            System.out.println("No eres perfecta para él");
        }
    }
}
