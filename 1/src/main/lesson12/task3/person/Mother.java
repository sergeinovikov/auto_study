package main.lesson12.task3.person;

import java.util.Objects;

public class Mother {
    private final String name;
    private final int age;

    public Mother(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mother)) return false;

        Mother mother = (Mother) o;

        if (age != mother.age) return false;
        return Objects.equals(name, mother.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
