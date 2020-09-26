package main.lesson3.task1;

public class Calculator {
    public static void summ (double number1, double number2) {
        System.out.println(Math.round(number1+number2));
    }

    public static void substract (double number1, double number2) {
        System.out.println(Math.round(number1-number2));
    }

    public static void multiply (double number1, double number2) {
        System.out.println(Math.round(number1*number2));
    }

    public static void divide (double number1, double number2) {
        System.out.println(Math.round(number1/number2));
    }
}
