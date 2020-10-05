package main.lesson4.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

    public boolean whiteSpaceValidation(String text) {
        Pattern whiteSpace = Pattern.compile(" ");
        Matcher validWhiteSpace = whiteSpace.matcher(text);
        int count = 0;
        while (validWhiteSpace.find()) {
            count++;
        }
        boolean result = count == 2;
        if (!result) {
            System.out.println("Введено не корректное значение");
        }
        return result;
    }

    public String[] arrayValidation(String text) {
        return text.split(" ");
    }

    public boolean classValidation(Human person, String[] data) {
        person.setFirstName(data[0]);
        person.setLastName(data[1]);
        try {
            person.setBirthDate(sdf.parse(data[2]));
        } catch (ParseException exception) {
            System.out.println("Введены не корректные данные, повторите ввод");
            return false;
        }

        String firstName = person.getFirstName();
        String lastName = person.getLastName();
        Date birthday = person.getBirthDate();
        boolean result = firstName != null && lastName != null && birthday != null;
        if (!result) {
            System.out.println("Введены не корректные данные, повторите ввод");
        }
        return result;
    }

    public boolean arrayOfHumansValidation(Human[] humans) {
        boolean isFull = false;
        int index = 0;
        for (Human current : humans) {
            if (current == null) {
                index++;
            }
        }
        if (index==0) {
            System.out.println("Массив заполнен");
            isFull = true;
        }
        return isFull;
    }

}
