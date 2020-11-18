package main.lesson11.task1;

public class Calculator {

    public static int addition(int... values) {
        int result = 0;
        for (int i = 0; i < values.length; i++) {
            if (i == 0)
                result = values[i];
            else
                result += values[i];
        }
        System.out.println("Результат сложения - " + result);
        return result;
    }

    public static int multiplication(int... values) {
        int result = 0;
        for (int i = 0; i < values.length; i++) {
            if (i == 0)
                result = values[i];
            else
                result *= values[i];
        }
        System.out.println("Результат умножения - " + result);
        return result;
    }

}
