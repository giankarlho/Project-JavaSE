package Benja;

import java.util.ArrayList;
import java.util.Random;

public class Bingo1 {

    public static void main(String[] args) {
        bingoCarta();
    }

    public static int drawNum() {
        Random rand = new Random();
        int num = rand.nextInt(75) + 1;
        return num;
    }

    public static void bingoCarta() {
        int[][] card = new int[5][5];
        ArrayList<Integer> alreadyUsed = new ArrayList<Integer>();
        boolean valid = false;
        int tmp = 0;
        for (int i = 0; i <= 4; i++) {
            for (int row = 0; row < card.length; row++) {
                while (!valid) {
                    tmp = (int) (Math.random() * 15) + 1 + 15 * i;
                    if (!alreadyUsed.contains(tmp)) {
                        valid = true;
                        alreadyUsed.add(tmp);
                    }
                }
                card[row][i] = tmp;
                valid = false;
            }
        }
        card[2][2] = 0;
        String title[] = {"B", "I", "N", "G", "O"};
        for (int i = 0; i < title.length; i++) {
            System.out.print(title[i] + "\t");
        }
        System.out.println();
        for (int row = 0; row < card.length; row++) {
            for (int col = 0; col < card[row].length; col++) {
                System.out.print(card[row][col] + "\t");
            }
            System.out.println();
        }
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
