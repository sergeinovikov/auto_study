package main.lesson10.task4.entities;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Employee implements Generatable {
    private String firstName;
    private String lastName;
    private Passport passport;
    private Double salary;

    @Override
    public Employee generate() {
        passport = new Passport().generate();
        int firstNameLength = Property.EMPLOYEE_FIRSTNAME_LENGHT;
        int lastNameLength = Property.EMPLOYEE_LASTNAME_LENGHT;
        String pattern = Property.EMPLOYEE_NAME_PATTERN;
        Double salaryMin = Property.EMPLOYEE_SALARY_MIN;
        Double salaryMax = Property.EMPLOYEE_SALARY_MAX;

        StringBuilder firstName = new StringBuilder();
        firstName.append("Auto");
        for (int i = 0; i < firstNameLength; i++) {
            int randomLetterPosition = new Random().nextInt(pattern.length());
            char letter = pattern.charAt(randomLetterPosition);
            firstName.append(letter);
        }
        this.firstName = firstName.toString();

        StringBuilder lastName = new StringBuilder();
        lastName.append("Auto");
        for (int i = 0; i < lastNameLength; i++) {
            int randomLetterPosition = new Random().nextInt(pattern.length());
            char letter = pattern.charAt(randomLetterPosition);
            lastName.append(letter);
        }
        this.lastName = lastName.toString();

        this.salary = ThreadLocalRandom.current().nextDouble(salaryMin, salaryMax);

        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Passport getPassport() {
        return passport;
    }

    public Double getSalary() {
        return salary;
    }
}
