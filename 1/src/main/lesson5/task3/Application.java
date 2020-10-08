package main.lesson5.task3;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        int total = new Random().nextInt(501) + 500;
        int failed = 0;

        for (int i = 0; i < total; i++) {
            int m = new Random().nextInt(5);
            int n = new Random().nextInt(5);
            try {
                int result = m / n;
            } catch (RuntimeException exception) {
                failed++;
            }
        }

        System.out.printf("Из %d операций деления %d было выполнено с ошибкой", total, failed);
    }
}
