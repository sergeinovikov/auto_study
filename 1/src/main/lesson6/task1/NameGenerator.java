package main.lesson6.task1;

import java.util.Random;

public class NameGenerator {
    public String generate() {
        String upperCaseLetters = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЬЫЪЭЮЯ";
        int randomNumberForWord = new Random().nextInt(8) + 5;
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < randomNumberForWord; i++) {
            int randomNumberForLetter = new Random().nextInt(upperCaseLetters.length());
            if (word.length() < 1) {
                word.append("" + upperCaseLetters.charAt(randomNumberForLetter));
            } else {
                String str = "" + upperCaseLetters.charAt(randomNumberForLetter);
                word.append(str.toLowerCase());
            }
        }
        return word.toString();
    }


}
