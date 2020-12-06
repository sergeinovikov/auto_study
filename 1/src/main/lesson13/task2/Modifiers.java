package main.lesson13.task2;


public class Modifiers {

    public static Boolean invert(Boolean input) {
        Modifier<Boolean> invert = (object) -> !object;
        return invert.modify(input);
    }


    public static Integer absolute(Integer input) {
        Modifier<Integer> absolute = Math::abs;
        return absolute.modify(input);
    }

    public static String reverse(String input) {
        Modifier<String> reverse = (object) -> new StringBuilder(object).reverse().toString();
        return reverse.modify(input);
    }
}
