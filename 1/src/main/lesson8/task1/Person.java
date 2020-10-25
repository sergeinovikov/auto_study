package main.lesson8.task1;

import java.util.Random;

public class Person {
    private String firstName;
    private String lastName;

    Person() {
        firstName = "Имя-" + new Random().nextInt(20) + 1;
        lastName = "Фамилия-" + new Random().nextInt(20) + 1;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Фамилия: " + lastName + ", Имя: " + firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!firstName.equals(person.firstName)) return false;
        return lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }
}
