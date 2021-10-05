package arrays;

public class MatrizPares {

    public static void main(String[] args) {
        int cant = 0;
        for (int j = 1; j <= 3; j++) {  // filas
            for (int i = 1; i <= 5; i++) { // columnas
                cant++;
                System.out.print("  " + cant * 2 + " ");
            }
            cant--;  // cant = cant - 1
            cant++;  // cant = cant + 1
            System.out.println(" ");
        }
    }
}
