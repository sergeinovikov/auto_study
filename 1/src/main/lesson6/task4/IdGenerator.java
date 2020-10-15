package main.lesson6.task4;

import java.util.Random;

public class IdGenerator {
    public static String generator(IdentityDocumentType document) {
        StringBuilder seriesAndNumber = new StringBuilder();
        int index = 0;
        if (document == IdentityDocumentType.MILITARY_ID) {
            while (index < 9) {
                if (index == 0 || index == 1) {
                    seriesAndNumber.append(randomLetter());
                } else if (index == 2) {
                    seriesAndNumber.append(" ");
                } else if (index == 3) {
                    boolean exist = new Random().nextBoolean();
                    if (exist) {
                        seriesAndNumber.append(randomDigit());
                    }
                } else {
                    seriesAndNumber.append(randomDigit());
                }
                index++;
            }
        } else if (document == IdentityDocumentType.DIPLOMATIC_PASSPORT || document == IdentityDocumentType.RUSSIAN_PASSPORT) {
            while (index < 9) {
                if (index == 2) {
                    seriesAndNumber.append(" ");
                } else {
                    seriesAndNumber.append(randomDigit());
                }
                index++;
            }
        } else if (document == IdentityDocumentType.FOREIGN_PASSPORT) {
            while (index < 25) {
                seriesAndNumber.append(randomCharacter());
                index++;
            }
        } else if (document == IdentityDocumentType.RUSSIAN_ID) {
            while (index < 12) {
                if (index == 2 || index == 5) {
                    seriesAndNumber.append(" ");
                } else {
                    seriesAndNumber.append(randomDigit());
                }
                index++;
            }
        }
        return seriesAndNumber.toString();
    }

    private static int randomDigit() {
        return new Random().nextInt(10);
    }

    private static char randomLetter() {
        String letters = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЫЬЪЭЮЯ";
        return letters.charAt(new Random().nextInt(letters.length()));
    }

    private static char randomCharacter() {
        String rusAlphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЫЬЪЭЮЯ";
        String engAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerRusAlphabet = rusAlphabet.toLowerCase();
        String lowerEngAlphabet = engAlphabet.toLowerCase();
        String digits = "1234567890";
        String allCharacters = rusAlphabet + engAlphabet + lowerRusAlphabet + lowerEngAlphabet + digits;
        return allCharacters.charAt(new Random().nextInt(allCharacters.length()));
    }
}
