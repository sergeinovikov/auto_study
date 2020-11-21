package main.lesson11.task3;

import java.util.Random;

public class Generator {
    public static int randomInteger(int start, int end) {
        return new Random().nextInt(end - start + 1) + start;
    }

    public static String randomString(int startLength, int endLength) {
        String pattern = "ABCDEFGHIJKLMNOPQRSTQVWZYZabcdefghijklmnopqrstuvwxyz";
        int randomLenght = new Random().nextInt(endLength - startLength + 1) + startLength;
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < randomLenght; i++) {
            word.append(pattern.charAt(new Random().nextInt(pattern.length())));
        }
        return word.toString();
    }
}
