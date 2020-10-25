package main.lesson8.task4.entities;

import java.util.Objects;
import java.util.Random;

public class Account extends Entity {
    private String accountNumber;

    public Account(String name, String accountNumber) {
        super(name);
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Тип объекта=" + getClass().getSimpleName() +
                ", уникальный ID: " + getUuid() +
                ", имя:" + getName() +
                ", аккаунт: " + accountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;

        Account account = (Account) o;

        return getAccountNumber() != null
                ? getAccountNumber().equals(account.getAccountNumber()) && getName().equals(account.getName())
                : account.getAccountNumber() == null;
    }

    @Override
    public int hashCode() {
        return getAccountNumber() != null ? getAccountNumber().hashCode() : 0;
    }
}

