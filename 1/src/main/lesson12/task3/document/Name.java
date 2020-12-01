package main.lesson12.task3.document;

import java.util.Objects;

public class Name {
    private final String ru_RU;

    public Name(String ru_RU) {
        this.ru_RU = ru_RU;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Name name = (Name) o;

        return Objects.equals(ru_RU, name.ru_RU);
    }

    @Override
    public int hashCode() {
        return ru_RU != null ? ru_RU.hashCode() : 0;
    }
}
