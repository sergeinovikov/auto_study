package main.lesson2.task2;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] twoDimMatrix = new int[8][8];
        TwoDimArray Matrix = new TwoDimArray();
        Matrix.first(twoDimMatrix);
        Matrix.second(twoDimMatrix);
        Matrix.third(twoDimMatrix);
    }

    void first(int[][] matrix) {
        System.out.printf("Цикл For:%n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j]);
            }
            System.out.printf("%n");
        }
        System.out.printf("%n");
    }

    void second(int[][] matrix) {
        System.out.printf("Цикл Foreach:%n");
        for (int[] current: matrix) {
            for (int current2 : current) {
                System.out.print(current2);
            }
            System.out.printf("%n");
        }
        System.out.printf("%n");
    }

    void third(int[][] matrix) {
        System.out.printf("Цикл While:%n");
        int index1 = 0;
        int index2 = 0;
        while (index1< matrix.length) {
            while (index2<matrix[index1].length) {
                System.out.print(matrix[index1][index2]);
                index2++;
            }
            System.out.printf("%n");
            index2=0;
            index1++;
        }
    }

}

