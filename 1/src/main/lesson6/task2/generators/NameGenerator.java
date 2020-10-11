package main.lesson6.task2.generators;

import java.util.Random;

public class NameGenerator {
    public String generate() {
        String letters = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЫЬЪЭЮЯ";
        StringBuilder name = new StringBuilder();
        int randomLenght = new Random().nextInt(8) + 5;
        for (int i = 0; i < randomLenght; i++) {
            int randomDigit = new Random().nextInt(letters.length());
            char randomLetter = letters.charAt(randomDigit);
            if (i == 0) {
                name.append(randomLetter);
            } else {
                name.append(Character.toLowerCase(randomLetter));
            }
        }
        return name.toString();
    }
}
