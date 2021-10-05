package arrays;

// imprimir N nros aleatorios del 1 al 20
public class ArrayU3 {
    public static void main(String[] args) {
        int cant =(int)(Math.random()*10+5); // aleatorio del 5 al 10
        int Nros[] = new int[cant];
        for(int m = 0; m < Nros.length ; m++){
            Nros[m] = (int)(Math.random()*20+1);
            System.out.print(Nros[m] + "\t");
        }        
    } 
}
