package main.lesson11.task2;

public class Human {
    private String firstName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.matches("^([А-Я-Ё])([а-я-ё]{3,12})$")) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("Некорректное имя: " + firstName);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Некорректный возраст: " + age);
        }
    }
}
