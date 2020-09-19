package main.lesson1.task5;

public class Logic1 {
    public static void main(String[] args) {
        Logic1 decision = new Logic1();
        System.out.println("Переменная ИЛИ");
        System.out.println(decision.or(false,false));
        System.out.println(decision.or(false,true));
        System.out.println(decision.or(true,false));
        System.out.println(decision.or(true,true));
        System.out.println("Переменная И");
        System.out.println(decision.and(false,false));
        System.out.println(decision.and(false,true));
        System.out.println(decision.and(true,false));
        System.out.println(decision.and(true,true));
    }

    boolean or (boolean a, boolean b) {
        return !(a||b);
    }

    boolean and (boolean a, boolean b) {
        return !(a)&&!(b);
    }
}
