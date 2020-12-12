package main.lesson14.model;

import java.util.List;

public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;
    private Passport passport;
    private List<Properties> properties;
    private List<Accounts> accounts;
    private List<Cards> cards;

    public Person() {
    }

    public Person(String lastName, String firstName, String patronymic, Passport passport, List<Properties> properties, List<Accounts> accounts, List<Cards> cards) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.passport = passport;
        this.properties = properties;
        this.accounts = accounts;
        this.cards = cards;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public List<Properties> getProperties() {
        return properties;
    }

    public void setProperties(List<Properties> properties) {
        this.properties = properties;
    }

    public List<Accounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Accounts> accounts) {
        this.accounts = accounts;
    }

    public List<Cards> getCards() {
        return cards;
    }

    public void setCards(List<Cards> cards) {
        this.cards = cards;
    }
}
