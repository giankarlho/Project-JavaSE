
package reto;


public class Reto1 {


    public static void main(String[] args) {
int [][] lista = new int [5][5];
int a =2;

        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[0].length; j++) {
                lista[i][j]= a;
                a= a+2;
                
            }
            
        }
          for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[0].length; j++) {
                System.out.print("\t"+lista[i][j]);
                
            }
              System.out.println("");
        }
    }
    
}
