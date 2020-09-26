package main.lesson2.task5;
import java.util.Random;

public class MatrixTransposition {
    public static void main(String[] args) {
        int number1 = new Random().nextInt(3) + 3;
        int number2 = new Random().nextInt(3) + 3;
        int[][] matrix1 = new int[number1][number2];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = new Random().nextInt(9);
                System.out.print(matrix1[i][j]);
            }
            System.out.printf("%n");
        }
        System.out.printf("%n");

        int[][] matrix2 = new int[matrix1[0].length][matrix1.length];
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = matrix1[j][i];
            }
        }

        for (int[] ints : matrix2) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.printf("%n");
        }
    }
}
