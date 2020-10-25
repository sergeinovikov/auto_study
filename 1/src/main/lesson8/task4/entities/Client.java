package main.lesson8.task4.entities;

import java.util.Random;

public class Client extends Entity {
    private String address;

    public Client(String name, String address) {
        super(name);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Тип объекта=" + getClass().getSimpleName() +
                ", уникальный ID: " + getUuid() +
                ", имя:" + getName() +
                ", адрес: " + address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;

        Client client = (Client) o;

        return getAddress() != null
                ? getAddress().equals(client.getAddress()) && getName().equals(client.getName())
                : client.getAddress() == null;
    }

    @Override
    public int hashCode() {
        return getAddress() != null ? getAddress().hashCode() : 0;
    }
}
