package main.lesson12.task1.model;

import java.util.ArrayList;
import java.util.List;

public class House implements Generatable{
    private List<Flat> flats = new ArrayList<>();

    public List<Flat> getFlats() {
        return flats;
    }

    public void setFlats(List<Flat> flats) {
        this.flats = flats;
    }

    @Override
    public <T extends Generatable> T generate() {
        int flatsAmount = 5;
        for (int i = 0; i < flatsAmount; i++) {
            Flat flat = new Flat().generate();
            flats.add(flat);
        }
        return (T) this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        House house = (House) o;

        return getFlats() != null ? getFlats().equals(house.getFlats()) : house.getFlats() == null;
    }

    @Override
    public int hashCode() {
        return getFlats() != null ? getFlats().hashCode() : 0;
    }
}
