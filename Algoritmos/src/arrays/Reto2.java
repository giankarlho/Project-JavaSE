
package reto;

public class Reto2 {

    public static void main(String[] args) {
        int[][] lista = new int[5][5];
        int a = 0;
        int b =0;
        int c=0;
                
        int d =0;
                int e=0;

        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[0].length; j++) {
                lista[i][j] = a;
                if (i == 0) {
                   
                    a +=2;
                    lista[i][j] = a;
                }
                if (i == 1) {
                   
                    b+= 3;
                    lista[i][j] = b;
                }
                if (i == 2) {
                     c+=4;
                    lista[i][j] = c;
                }
                if (i == 3) {
                     d+=5;
                    lista[i][j] = d;
                }
                if (i == 4) {
                     e+=6;
                    lista[i][j] = e;
                }
            }

        }
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[0].length; j++) {
                System.out.print("\t" + lista[i][j]);

            }
            System.out.println("");
        }
    }
}
