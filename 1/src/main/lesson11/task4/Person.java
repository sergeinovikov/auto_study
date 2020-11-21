package main.lesson11.task4;

import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    private String patronymicName;
    private Date birthDate;
    private Passport passport;

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public Person setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
        return this;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Person setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public Passport getPassport() {
        return passport;
    }

    public Person setPassport(Passport passport) {
        this.passport = passport;
        return this;
    }
}
