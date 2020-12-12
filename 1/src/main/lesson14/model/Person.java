package main.lesson14.model;

import java.util.List;

public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;
    private Passport passport;
    private List<Property> properties;
    private List<Account> accounts;
    private List<Card> cards;

    public Person() {
    }

    public Person(String lastName, String firstName, String patronymic, Passport passport, List<Property> properties, List<Account> accounts, List<Card> cards) {
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

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
