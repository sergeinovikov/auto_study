package main.lesson8.task4.entities;

public class Branch extends Entity {
    String address;

    public Branch(String name, String address) {
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
        if (!(o instanceof Branch)) return false;

        Branch branch = (Branch) o;

        return getAddress() != null
                ? getAddress().equals(branch.getAddress()) && getName().equals(branch.getName())
                : branch.getAddress() == null;
    }

    @Override
    public int hashCode() {
        return getAddress() != null ? getAddress().hashCode() : 0;
    }
}
