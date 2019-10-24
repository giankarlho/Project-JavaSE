package servicios;

public class CalcuService {

    public double resultado = 0.0;

    public Double operar(Double nro1, Double nro2, char ope) {
        switch (ope) { // variables int o char
            case '+':
                resultado = nro1 + nro2; break;
            case '-':
                resultado = nro1 - nro2; break;
            case '*':
                resultado = nro1 * nro2; break;
            case '/':
                resultado = nro1 / nro2; break;
            case 'R': // raiz cuadrada
                resultado = Math.sqrt(nro2) ; break; 
            case 'P': // potencia
                resultado = nro2*nro2 ; break;
            case 'S': 
                resultado = nro1/((nro1*nro1)+(nro2*nro2)); break;
            case 'C': 
                resultado = nro2/((nro1*nro1)+(nro2*nro2));; break;
            case 'T':
                resultado = nro1/nro2; break;
            
            
        }
        return resultado;
    }
}
