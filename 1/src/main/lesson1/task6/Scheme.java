package main.lesson1.task6;

public class Scheme {
    public static void main(String[] args) {
        Scheme schemeResult = new Scheme();
        System.out.println(schemeResult.result(false, false, false, false));
        System.out.println(schemeResult.result(true, true, true, true));
        System.out.println(schemeResult.result(false, true, false, true));
        System.out.println(schemeResult.result(true, false, true, false));
        System.out.println(schemeResult.result(true, true, false, false));
        System.out.println(schemeResult.result(true, true, false, false));
    }

    boolean result (boolean a, boolean b, boolean c, boolean d) {
        return (a&&b)&&!(c||d);
    }
}
