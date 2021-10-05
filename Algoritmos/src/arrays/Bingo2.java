package retos;

import java.util.Scanner;

public class Bingo2 {

    public static void main(String[] args) {
        //Ingresar el numero de cartillas
        int s = 1;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el numero de cartillas");
        int cart = leer.nextInt();
        while (s <= cart) {
            // De la letra B
            int cant = (int) (Math.random() * 10 + 5); // aleatorio del 5 al 10
            int Nros[] = new int[cant];
            int pruebita;
            // De la letra I
            int cant1 = (int) (Math.random() * 10 + 5); // aleatorio del 5 al 10
            int Nros1[] = new int[cant1];
            int pruebita1;
            // De la letra N
            int cant2 = (int) (Math.random() * 10 + 5); // aleatorio del 5 al 10
            int Nros2[] = new int[cant2];
            int pruebita2;
            // De la letra G
            int cant3 = (int) (Math.random() * 10 + 5); // aleatorio del 5 al 10
            int Nros3[] = new int[cant3];
            int pruebita3;
            // De la letra O
            int cant4 = (int) (Math.random() * 10 + 5); // aleatorio del 5 al 10
            int Nros4[] = new int[cant4];
            int pruebita4;

            //Recorrer B
            for (int m = 0; m < Nros.length; m++) {
                pruebita = (int) (Math.random() * 15 + 1);
                for (int i = 0; i < Nros.length; i++) {
                    if (pruebita == Nros[i]) { // si encuentro el nro
                        pruebita = (int) (Math.random() * 15 + 1);
                        i = -1;
                    }
                }
                Nros[m] = pruebita;
            }
            //Recorrer I
            for (int n = 0; n < 5; n++) {
                pruebita1 = (int) (Math.random() * 15 + 16);
                for (int j = 0; j < 5; j++) {
                    if (pruebita1 == Nros1[j]) { // si encuentro el nro
                        pruebita1 = (int) (Math.random() * 15 + 16);
                        j = -1;
                    }

                }
                Nros1[n] = pruebita1;
            }
            //RECORRER N
            for (int n = 0; n < 5; n++) {
                pruebita2 = (int) (Math.random() * 15 + 31);
                for (int j = 0; j < 5; j++) {
                    if (pruebita2 == Nros2[j]) { // si encuentro el nro
                        pruebita2 = (int) (Math.random() * 15 + 31);
                        j = -1;
                    }
                }
                Nros2[n] = pruebita2;
            }
            //RECORRER G
            for (int n = 0; n < 5; n++) {
                pruebita3 = (int) (Math.random() * 15 + 46);
                for (int j = 0; j < 5; j++) {
                    if (pruebita3 == Nros3[j]) { // si encuentro el nro
                        pruebita3 = (int) (Math.random() * 15 + 46);
                        j = -1;
                    }
                }
                Nros3[n] = pruebita3;
            }  //RECORRER O
            for (int n = 0; n < 5; n++) {
                pruebita4 = (int) (Math.random() * 15 + 61);
                for (int j = 0; j < 5; j++) {
                    if (pruebita4 == Nros4[j]) { // si encuentro el nro
                        pruebita4 = (int) (Math.random() * 15 + 61);
                        j = -1;
                    }
                }
                Nros4[n] = pruebita4;
            }
            //IMPRIMIR BINGO
            System.out.println("\t-- CARTILLA " + s + " --\n");
            System.out.println("B \tI\t N\t G\t O");
            for (int i = 0; i < 5; i++) {
                System.out.println(Nros[i] + " \t" + Nros1[i] + "\t " + Nros2[i] + "\t " + Nros3[i] + "\t " + Nros4[i]);
            }
            System.out.println("");
            s++;
        }
    }
}
