package main.lesson2.task3;

public class PhoneNumber {
    public static void main(String[] args) {
        PhoneNumber number = new PhoneNumber();
        System.out.println("Регулярные выражения:");
        System.out.println(number.checkFormatRegExp("+7(910)423-73-12"));
        System.out.println(number.checkFormatRegExp("7(910)423-73-12"));
        System.out.println(number.checkFormatRegExp("89215310934"));
        System.out.println(number.checkFormatRegExp("+5(911)310-12-74"));
        System.out.println(number.checkFormatRegExp("+7(9fg)125-42-99"));
        System.out.println(number.checkFormatRegExp("+7(122)2342343"));
        System.out.println(number.checkFormatRegExp("++(125)123-10-10"));
        System.out.printf("%nЦиклы:%n");
        number.checkFormatCycles("+7(910)423-73-12");
        number.checkFormatCycles("7(910)423-73-12");
        number.checkFormatCycles("89215310934");
        number.checkFormatCycles("+5(911)310-12-74");
        number.checkFormatCycles("+7(9fg)125-42-99");
        number.checkFormatCycles("+7(122)2342343");
        number.checkFormatCycles("++(125)123-10-10");
        number.checkFormatCycles("+7(910)423-73-127");
    }

    boolean checkFormatRegExp(String number) {
        return number.matches("^(\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2})$");
    }

    void checkFormatCycles(String number) {
        boolean firstCheck = false;
        boolean secondCheck = false;
        boolean thirdCheck = false;
        boolean fourthCheck = false;
        boolean fifthCheck = false;
        boolean sixthCheck = false;
        boolean once = false;
        int[] digits = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
        for (int i = 0; i < number.length(); i++) {
            if (!once) {
                if (i == 0) {
                    if (number.charAt(i) == '+') {
                        firstCheck = true;
                    }
                } else if (i == 1) {
                    if (number.charAt(i) == '7') {
                        secondCheck = true;
                    }
                } else if (i == 2) {
                    if (number.charAt(i) == '(') {
                        thirdCheck = true;
                    }
                } else if (i == 6) {
                    if (number.charAt(i) == ')') {
                        fourthCheck = true;
                    }
                } else if (i == 10 || i == 13) {
                    if (number.charAt(i) == '-') fifthCheck = true;
                } else if (number.length()==16){
                    for (int digit : digits) {
                        if (number.charAt(i) == digit) {
                            sixthCheck = true;
                            break;
                        } else {
                            sixthCheck = false;
                        }
                    }
                    if (!sixthCheck) {
                        once = true;
                    }
                }
            }
        }
        System.out.println(firstCheck & secondCheck & thirdCheck & fourthCheck & fifthCheck && sixthCheck&& !once);
    }
}

