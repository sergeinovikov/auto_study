package main.lesson10.task2;

import java.util.Random;

public class StringHelper extends Config {

    public String generate() {
        int randomLenght = new Random().nextInt(LINES_MAX_LENGHT - LINES_MIN_LENGHT + 1) + LINES_MIN_LENGHT;
        StringBuilder randomWord = new StringBuilder();
        for (int i = 0; i < randomLenght; i++) {
            int randomLetter = new Random().nextInt(LINES_PATTERN.length());
            randomWord.append(LINES_PATTERN.charAt(randomLetter));
        }
        System.out.printf(LINES_MESSAGE, randomWord.toString());
        return randomWord.toString();
    }
}
