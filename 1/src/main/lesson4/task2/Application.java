package main.lesson4.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Application {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
    private static boolean arrayIsNotFull = true;
    public static int count = 0;

    public static void main(String[] args) throws IOException {
        Validator validate = new Validator();
        Human[] persons = new Human[3];

        while (!validate.arrayOfHumansValidation(persons)) {
            System.out.printf("Введите имя, фамилию и дату рождения человека:%n");
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String text = input.readLine();
            if (validate.whiteSpaceValidation(text)) {
                String[] humanData = validate.arrayValidation(text);
                persons[count] = new Human();
                if (validate.classValidation(persons[count], humanData)) {
                    count++;
                }
            }
        }
    }
}
