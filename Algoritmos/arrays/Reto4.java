
package reto;


public class Reto4 {
    public static void main(String[] args) {
        int[][] lista = new int[5][5];
        int a = 1;
        int b =2;
        int c=3;     
        int d =4;
        int e =5;

        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                lista[i][j] = a;
                if (i == 0 ) {
                   
                   
                    lista[i][j] = a;
                      a *=2;
                }
                if (i == 1) {
                   
                   
                    lista[i][j] = b;
                     b*= 3;
                }
                if (i == 2) {
                     
                    lista[i][j] = c;
                    c*=4;
                }
                if (i == 3) {
                   
                    lista[i][j] = d;
                      d*=5;
                }
                if (i == 4) {
                   
                    lista[i][j] = e;
                     e*=6;
                }
            }

        }
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[0].length; j++) {
                System.out.print("\t" + lista[j][i]);

            }
            System.out.println("");
        }
    }
}
