package main.lesson5.task5;

import java.util.Arrays;

public class PassportData {
    private static String[] passportsData;

    public boolean uniquePassport(String passport) {
        boolean isContains = false;
        if (passportsData == null) {
            passportsData = new String[1];
            passportsData[0] = passport;
        } else {
            for (String current : passportsData) {
                if (current.equals(passport)) {
                    isContains = true;
                    break;
                } else {
                    passportsData = Arrays.copyOf(passportsData, passportsData.length + 1);
                    passportsData[passportsData.length - 1] = passport;
                }
            }
        }
        return isContains;
    }
}
