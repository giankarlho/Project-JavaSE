package arrays;

public class ArrayB1 {

    public static void main(String[] args) {
        int matrix[][] = new int[4][4]; // una matriz de 4x4
        int valor = 2;
        for (int j = 0; j < 4; j++) { // columnas
            for (int k = 0; k < 4; k++) { // filas
                matrix[j][k] = valor;
                valor += 2; // valor = valor + 2
            }
        }
        for (int j = 0; j < 4; j++) { // columnas
            for (int k = 0; k < 4; k++) { // filas
                System.out.print(matrix[j][k] + "\t") ;                
            }
            System.out.println(" ");
        }
    }
}
