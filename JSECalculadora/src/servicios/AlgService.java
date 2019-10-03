package servicios;

public class AlgService {

    public static String respuesta = "";
    public static Double resultado = 0.0;
    public static int resultadoInt = 0;

    public static String primo(Double nro) {
        int div = 0;
        for (int i = 1; i <= nro; i++) {
            if (nro % i == 0) {
                div++;
            }
        }
        if (div == 2) {
            respuesta = "Es primo";
        } else {
            respuesta = "No es primo";
        }
        return respuesta;// es primo o no es mi primo
    }
    
    public static Double factorial(Double nro){
        resultado = 1.0;
        for (int i = 1; i <=nro; i++) {
            resultado*= i;                    
        }       
        return resultado;        
    }
    
    public static String cantPrimo(Double nro){ // 3 ptos.
        return respuesta;
    }
    
    public static String perfecto(Double nro){
        int div = 0;
        for(int z = 1;z<nro;z++){
            if(nro%z==0){
                div = div + z;
            }
        }
        if(nro==div){
            respuesta ="eres perfecto";
      
        }else{
            respuesta = "no eres perfecto";
        }
       return respuesta; 
    }
    
    public static String fibonacci(Double nro){ // 1 1 2 3 5 8 13 21 34 ....
       return respuesta; 
    }
    
    public static Integer sumaCifras(int nro){
        return resultadoInt;
    }
    
}
