package main.lesson6.task1;

import java.util.Random;

public class PhoneGenerator {
    public String generate() {
        StringBuilder phone = null;
        for (int i = 0; i < 16; i++) {
            int randomNumber = new Random().nextInt(10);
            if (i == 0) {
                phone = new StringBuilder("+");
            } else if (i == 1) {
                phone.append("7");
            } else if (i == 2) {
                phone.append("(");
            } else if (i == 6) {
                phone.append(")");
            } else if (i == 10 || i == 13) {
                phone.append("-");
            } else {
                phone.append(randomNumber);
            }
        }
        return phone.toString();
    }
}
