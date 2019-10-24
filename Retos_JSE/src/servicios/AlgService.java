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

    public static Double factorial(Double nro) {
        resultado = 1.0;
        for (int i = 1; i <= nro; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static int cantPrimo(int nro) { // 3 ptos.
        resultadoInt = 1;
        int cont = 1;
        int vers = 0;
        while (cont <= nro) {
            for (int i = 1; i <= cont; i++) {
                if (cont % i == 0) {
                    vers++;
                }

            }
            if (vers == 2) {
                resultadoInt++;
            }
            cont++;
            vers = 0;
        }
        return resultadoInt;
    }

    public static int sumcifra(int nro) {
        resultadoInt = 0;
        int n = nro;
        while (n != 0) {
            resultadoInt = resultadoInt + n % 10;
            n = n / 10;
        }
        return resultadoInt;
    }

    public static int fibonacci(int nro) { // 1 1 2 3 5 8 13 21 34 ....
        int a = 0;
        int b;
        resultadoInt = 1;
        for (int i = 1; i < nro; i++) {
            b = a;
            a = resultadoInt;
            resultadoInt = b + a;
        }
        return resultadoInt;
    }

    public static String binario(int nro) {
        resultadoInt = nro;
        return Integer.toBinaryString(resultadoInt);
    }

    public static String octal(int nro) {
        resultadoInt = nro;
        return Integer.toOctalString(resultadoInt);
    }

    public static String hexadecimal(int nro) {
        resultadoInt = nro;
        return Integer.toHexString(resultadoInt);
    }

    public static String bisiesto(int nro) {
        if ((nro % 4 == 0) && ((nro % 100 != 0) || (nro % 400 == 0))) {
            respuesta = "El año es bisiesto";
        } else {
            respuesta = "El año no es bisiesto";
        }
        return respuesta;
    }

}
