
package servicios;

import java.util.Random;

public class BingoService {

    public int[] resultadoB = new int[15];
    public int[] resultadoI = new int[15];
    public int[] resultadoN = new int[15];
    public int[] resultadoG = new int[15];
    public int[] resultadoO = new int[15];

    int res;

    public void sortear() {
        Random rnd = new Random();
        int n = 15;  //numeros aleatorios
        int k = 15;  //auxiliar de B;
        int kI = 15;  //auxiliar de I;
        int kN = 15;  //auxiliar de N;
        int kG = 15;  //auxiliar de G;
        int kO = 15;  //auxiliar de O;
        int[] numerosB = new int[n];
        int[] numerosI = new int[n];
        int[] numerosN = new int[n];
        int[] numerosG = new int[n];
        int[] numerosO = new int[n];
    // del 0 a 15
        for (int i = 0; i < n; i++) {
            numerosB[i] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            res = rnd.nextInt(k);
            resultadoB[i] = numerosB[res];
            numerosB[res] = numerosB[k - 1];
            k--;
        }

    // del 16 a 30
        for (int i = 0; i < n; i++) {
            numerosI[i] = i + 16;
        }
        for (int i = 0; i < n; i++) {
            res = rnd.nextInt(kI);
            resultadoI[i] = numerosI[res];
            numerosI[res] = numerosI[kI - 1];
            kI--;
        }
   // del 31 a 45
        for (int i = 0; i < n; i++) {
            numerosN[i] = i + 31;
        }
        for (int i = 0; i < n; i++) {
            res = rnd.nextInt(kN);
            resultadoN[i] = numerosN[res];
            numerosN[res] = numerosN[kN - 1];
            kN--;
        }
        //se rellena una matriz ordenada del 46 al 60(1..n)
        for (int i = 0; i < n; i++) {
            numerosG[i] = i + 46;
        }
        for (int i = 0; i < n; i++) {
            res = rnd.nextInt(kG);
            resultadoG[i] = numerosG[res];
            numerosG[res] = numerosG[kG - 1];
            kG--;
        }

        //se rellena una matriz ordenada del 61 al 75(1..n)
        for (int i = 0; i < n; i++) {
            numerosO[i] = i + 61;
        }
        for (int i = 0; i < n; i++) {
            res = rnd.nextInt(kO);
            resultadoO[i] = numerosO[res];
            numerosO[res] = numerosO[kO - 1];
            kO--;
        }

    }

}
