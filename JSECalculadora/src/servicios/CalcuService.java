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
            case 'S': // seno
            case 'C': // coseno
        }
        return resultado;
    }
}
