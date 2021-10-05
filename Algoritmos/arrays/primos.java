
package reto;


public class primos {
    public static void main(String[] args) {
        int [][] lista = new int [5][5];
int a =1;
boolean acceso=true;
int cont =0;
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[0].length; j++) {
                lista[i][j]= a;
                
                while (acceso==true) {
                    a++;
                    for (int k = 1; k <= a; k++) {
                        if (a%k==0) {
                            cont++;
                        }
                        
                    }
                    if (cont==2) {
                        acceso=false;
                    }
                    cont=0;
                }
                 acceso=true;
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
