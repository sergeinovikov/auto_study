package main.lesson8.task4.entities;

import java.util.Objects;
import java.util.Random;

public class User extends Entity {
    private String jobTitle;

    public User(String name, String jobTitle) {
        super(name);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public String toString() {
        return "Тип объекта=" + getClass().getSimpleName() +
                ", уникальный ID: " + getUuid() +
                ", имя:" + getName() +
                ", должность: " + jobTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        return getJobTitle() != null
                ? getJobTitle().equals(user.getJobTitle()) && getName().equals(user.getName())
                : user.getJobTitle() == null;
    }

    @Override
    public int hashCode() {
        return getJobTitle() != null ? getJobTitle().hashCode() : 0;
    }
}
