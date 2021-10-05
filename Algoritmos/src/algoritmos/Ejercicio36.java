package ejercicios;
// En una empresa se requiere calcular el salario semanal de cada uno de los N obreros
// que laboran en ella. El Salario se obtiene de la siguiente forma:

import java.util.Scanner;

// Si el obrero trabaja 20 horas o menos se le paga $25 por hora.
//  Si trabaja más de 20 horas se le paga $25 por cada una de las 20 horas y $20 por
// adicional
public class Ejercicio36 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantTrab = leer.nextInt(); double totalSueldos=0.0,sueldo = 0.0;
        for (int j = 1; j <= cantTrab; j++) { // pido los N trabajadores
            System.out.println("Ing. la cant. horas del trabajador " + j);
            int horas = leer.nextInt();
            if (horas <= 20) {
                sueldo = horas*25;
            }else{
                sueldo = horas*25 + (horas-20)*20;
            }
            totalSueldos += sueldo; // totalSueldos = totalSueldos + sueldo
            System.out.print("El sueldo del trabajador " + j + "es " + sueldo + "\t");
        }
        System.out.print("Y el monto desenbolsado es: " + totalSueldos + "\t");
    }

}
