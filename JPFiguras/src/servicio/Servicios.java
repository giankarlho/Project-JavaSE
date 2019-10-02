package servicio;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Servicios {

    public static String resultado;

    // https://es.stackoverflow.com/questions/97868/redondear-2-decimales-en-java
    public static String redondear(Double nro) {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        resultado = String.valueOf(df.format(nro));
        return resultado;
    }
}
