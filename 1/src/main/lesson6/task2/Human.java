package main.lesson6.task2;

import java.util.HashMap;
import java.util.Map;

public class Human {
    private String firstName;
    private String lastName;
    private int age;


    private final Map<Enum, String> phones = new HashMap<>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<Enum, String> getPhones() {
        return phones;
    }

    public void setPhones(Enum type, String phone) {
        phones.put(type, phone);
    }
}
