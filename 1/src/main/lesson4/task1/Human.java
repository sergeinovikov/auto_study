package main.lesson4.task1;

import java.util.Date;

public class Human {
    private String lastName;
    private String firstName;
    private Date birthDate;

    public void setLastName(String newLastName) {
        if (newLastName.matches("^([А-Я-Ё])([а-я-ё]{2,})$")) {
            this.lastName = newLastName;
            setCorrectPrint(this.lastName);
        } else {
            setIncorrectPrint(newLastName);
        }
    }

    public String getLastName() {
        getPrint(lastName);
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
        getPrint(firstName);
        return firstName;
    }

    public void setBirthDate(Date newBirthDate) {
        Date currentDay = new Date();
        if (newBirthDate.before(currentDay)) {
            this.birthDate = newBirthDate;
            setCorrectPrint(this.birthDate);
        } else {
            setIncorrectPrint(newBirthDate);
        }
    }

    public Date getBirthDate() {
        getPrint(birthDate);
        return birthDate;
    }

    public void getPrint(Object textToPrint) {
        if (textToPrint == this.lastName) {
            System.out.printf("Получено значение фамилии: %s%n", textToPrint);
        } else if (textToPrint == this.firstName) {
            System.out.printf("Получено значение имени: %s%n", textToPrint);
        } else if (textToPrint == this.birthDate) {
            System.out.printf("Получено значение даты рождения: %s%n", textToPrint);
        }
    }

    public void setCorrectPrint(Object textToPrint) {
        if (textToPrint == this.lastName) {
            System.out.printf("Установлено корректное значение фамилии: %s%n", textToPrint);
        } else if (textToPrint == this.firstName) {
            System.out.printf("Установлено корректное значение имени: %s%n", textToPrint);
        } else if (textToPrint == this.birthDate) {
            System.out.printf("Установлено корректное значение даты рождения: %s%n", textToPrint);
        }
    }

    public void setIncorrectPrint(Object textToPrint) {
        System.out.printf("Введенное значение некорректно: %s%n", textToPrint);
    }
}
