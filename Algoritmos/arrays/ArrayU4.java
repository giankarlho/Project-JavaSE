package arrays;

// imprimir N nros aleatorios del 1 al 20
public class ArrayU4 {
    public static void main(String[] args) {
        int cant =(int)(Math.random()*10+5); // aleatorio del 5 al 10
        int Nros[] = new int[cant]; int pruebita;
        for(int m = 0; m < Nros.length ; m++){
            pruebita = (int)(Math.random()*20+1);
            for(int i = 0; i < Nros.length ; i++){
               if(pruebita == Nros[i]){ // si encuentro el nro
                  pruebita = (int)(Math.random()*20+1); 
                  i=-1;
               } 
            }
            Nros[m] = pruebita;
            System.out.print(Nros[m] + "\t");
        }        
    } 
}
