package main.lesson4.task4;

import java.util.Arrays;

public class PassportData {
    private static String[] passportsData;

    public boolean uniquePassport(String passport) {
        boolean isContains = false;
        if (passportsData == null) {
            passportsData = new String[1];
            passportsData[0] = passport;
            System.out.println("Паспорт уникальный");
        } else {
            for (String current : passportsData) {
                if (current.equals(passport)) {
                    isContains = true;
                    System.out.println("Данные паспорта не уникальны");
                    break;
                } else {
                    passportsData = Arrays.copyOf(passportsData, passportsData.length + 1);
                    passportsData[passportsData.length - 1] = passport;
                    System.out.println("Паспорт уникальный");
                }
            }
        }
        return isContains;
    }
}
