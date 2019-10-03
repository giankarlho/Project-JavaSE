package algoritmos;

import java.util.Scanner;

public class NroPrimo {
    public static void main(String[] args) {
        int div = 0; // asignando un valor
        System.out.println("Primo o no ?, ingresa p");
        Scanner leer = new Scanner(System.in);
        int nro = leer.nextInt();
        for (int a = 1 ; a<= nro ; a++){
            if (nro % a == 0){
                div++; // div = div + 1
            }
        } 
        if (div == 2){ // comparando
            System.out.println("Es primo");
        }else{
            System.out.println("No eres mi primo");
        }
    }   
}
