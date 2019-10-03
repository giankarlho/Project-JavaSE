package algoritmos;

import java.util.Scanner;

public class CuaRec {
    public static void main(String[] args) {
        System.out.println("Ingresa la altura");
        Scanner leerH = new Scanner(System.in);
        int altura = leerH.nextInt();
        System.out.println("Ingresa la base");
        Scanner leerB = new Scanner(System.in);
        int base = leerB.nextInt();
        if(altura == base){
            System.out.print("Es un cuadrado ");
            System.out.println("con área " + base*base);
        }else{
            System.out.print("Es un rectángulo ");
            System.out.println("con área " + base*altura);
        }
    }
  
}
