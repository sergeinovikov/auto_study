package main.lesson2.task6;

import java.util.Random;

public class inversion {
    public static void main(String[] args) {
        int number1 = new Random().nextInt(3) + 3;
        int number2 = new Random().nextInt(3) + 3;
        int[][] matrix1 = new int[number1][number2];
        int randomNumber1 = 1 + new Random().nextInt(number1 - 2);
        int randomNumber2 = 1 + new Random().nextInt(number2 - 2);

        matrix1[randomNumber1][randomNumber2] = 2;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (i == randomNumber1 && j == randomNumber2) {
                    System.out.print(matrix1[i][j]);
                } else {
                    matrix1[i][j] = new Random().nextInt(2);
                    System.out.print(matrix1[i][j]);
                }
            }
            System.out.printf("%n");
        }
        System.out.printf("%n");

        int[][] matrix2 = new int[matrix1.length][matrix1[0].length];
        boolean check = false;
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                if (!check & matrix1[i][j] != 2) {
                    matrix2[i][j] = matrix1[i][j];
                } else if (matrix1[i][j] == 2) {
                    matrix2[i][j] = matrix1[i][j];
                    check = true;
                } else if (check) {
                    if (matrix1[i][j] == 1) {
                        matrix2[i][j] = 0;
                    } else {
                        matrix2[i][j] = 1;
                    }
                }
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
