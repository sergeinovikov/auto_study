package main.lesson12.task3.document;

import java.util.Objects;

public class Bank {
    private int id;
    private int version;
    private String bic;
    private Object place;
    private Object name;
    private Object placeType;

    public int getId() {
        return id;
    }

    public int getVersion() {
        return version;
    }

    public String getBic() {
        return bic;
    }

    public Object getPlace() {
        return place;
    }

    public Object getName() {
        return name;
    }

    public Object getPlaceType() {
        return placeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bank bank = (Bank) o;

        if (id != bank.id) return false;
        if (version != bank.version) return false;
        if (!Objects.equals(bic, bank.bic)) return false;
        if (!Objects.equals(place, bank.place)) return false;
        if (!Objects.equals(name, bank.name)) return false;
        return Objects.equals(placeType, bank.placeType);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + version;
        result = 31 * result + (bic != null ? bic.hashCode() : 0);
        result = 31 * result + (place != null ? place.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (placeType != null ? placeType.hashCode() : 0);
        return result;
    }
}
