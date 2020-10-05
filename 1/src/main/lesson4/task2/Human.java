package main.lesson4.task2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    private String lastName;
    private String firstName;
    private Date birthDate;

    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

    public void setLastName(String newLastName) {
        if (newLastName.matches("^([А-Я-Ё])([а-я-ё]{2,})$")) {
            this.lastName = newLastName;
            setCorrectPrint(this.lastName);
        } else {
            setIncorrectPrint(newLastName);
        }
    }

    public String getLastName() {
        //getPrint(lastName);
        return lastName;
    }

    public void setFirstName(String newFirstName) {
        if (newFirstName.matches("^([А-Я-Ё])([а-я-ё]{2,})$")) {
            this.firstName = newFirstName;
            setCorrectPrint(this.firstName);
        } else {
            setIncorrectPrint(newFirstName);
        }
    }

    public String getFirstName() {
        //getPrint(firstName);
        return firstName;
    }

    public void setBirthDate(Date newDate) {
        Date current = new Date();

        if (newDate.before(current)) {
            this.birthDate = newDate;
            setCorrectPrint(this.birthDate);
        } else {
            setIncorrectPrint(sdf.format(newDate));
        }
    }

    public Date getBirthDate() {
        //getPrint(birthDate);
        return birthDate;
    }

    public void getPrint(Object textToPrint) {
        if (textToPrint == this.lastName) {
            System.out.printf("Получено значение фамилии: %s%n", textToPrint);
        } else if (textToPrint == this.firstName) {
            System.out.printf("Получено значение имени: %s%n", textToPrint);
        } else if (textToPrint == this.birthDate) {
            System.out.printf("Получено значение даты рождения: %s%n", sdf.format(textToPrint));
        }
    }

    public void setCorrectPrint(Object textToPrint) {
        if (textToPrint == this.lastName) {
            System.out.printf("Установлено корректное значение фамилии: %s%n", textToPrint);
        } else if (textToPrint == this.firstName) {
            System.out.printf("Установлено корректное значение имени: %s%n", textToPrint);
        } else if (textToPrint == this.birthDate) {
            System.out.printf("Установлено корректное значение даты рождения: %s%n", sdf.format(textToPrint));
        }
    }

    public void setIncorrectPrint(Object textToPrint) {
        System.out.printf("Введенное значение некорректно: %s%n", textToPrint);
    }
}
