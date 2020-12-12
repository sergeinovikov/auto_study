package main.lesson14.model;

public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;
    private Passport passport;
    private Properties[] properties;
    private Accounts[] accounts;
    private Cards[] cards;

    public Person() {
    }

    public Person(String lastName, String firstName, String patronymic, Passport passport, Properties[] properties, Accounts[] accounts, Cards[] cards) {
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

    public Properties[] getProperties() {
        return properties;
    }

    public void setProperties(Properties[] properties) {
        this.properties = properties;
    }

    public Accounts[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts[] accounts) {
        this.accounts = accounts;
    }

    public Cards[] getCards() {
        return cards;
    }

    public void setCards(Cards[] cards) {
        this.cards = cards;
    }
}
