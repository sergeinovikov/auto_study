package main.lesson6.task2.generators;

import java.util.Random;

public class PhoneGenerator {
    public String generate() {
        StringBuilder phone = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            int randomDigit = new Random().nextInt(10);
            if (i == 0) {
                phone.append("+");
            } else if (i == 1) {
                phone.append("7");
            } else if (i == 2) {
                phone.append("(");
            } else if (i == 3) {
                phone.append("9");
            } else if (i == 6) {
                phone.append(")");
            } else if (i == 10 || i == 13) {
                phone.append("-");
            } else {
                phone.append(randomDigit);
            }
        }
        return phone.toString();
    }
}
