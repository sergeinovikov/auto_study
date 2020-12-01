package main.lesson12.task3.person;

import java.util.Arrays;
import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private Mother mother;
    private String[] children;
    private Boolean married;
    private Object dog;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Mother getMother() {
        return mother;
    }

    public String[] getChildren() {
        return children;
    }

    public Boolean getMarried() {
        return married;
    }

    public Object getDog() {
        return dog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!Objects.equals(name, person.name)) return false;
        if (!Objects.equals(mother, person.mother)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(children, person.children)) return false;
        if (!Objects.equals(married, person.married)) return false;
        return Objects.equals(dog, person.dog);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (mother != null ? mother.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(children);
        result = 31 * result + (married != null ? married.hashCode() : 0);
        result = 31 * result + (dog != null ? dog.hashCode() : 0);
        return result;
    }
}
