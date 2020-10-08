package main.lesson5.task1;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        int m = new Random().nextInt(6) + 5;
        int n = new Random().nextInt(6) + 5;

        //new Random().nextInt(10) ;// от 0 до 9

        int[] dividends = new int[m];
        int[] dividers = new int[n];

        System.out.printf("Массив dividends:%n");
        for (int i = 0; i < dividends.length; i++) {
            dividends[i] = new Random().nextInt(6) + 4;
            System.out.printf("%d ", dividends[i]);
        }
        System.out.println();

        System.out.printf("Массив dividers:%n");
        for (int i = 0; i < dividers.length; i++) {
            dividers[i] = new Random().nextInt(4);
            System.out.printf("%d ", dividers[i]);
        }
        System.out.println();

        System.out.printf("Массив result:%n");
        int[][] result = new int[n][m];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                try {
                    result[i][j] = dividends[i] / dividers[j];
                } catch (RuntimeException exception) {
                    result[i][j] = -1;
                }
                System.out.printf("%d ", result[i][j]);
            }
            System.out.printf("%n");
        }
    }
}
