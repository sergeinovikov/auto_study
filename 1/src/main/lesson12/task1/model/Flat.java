package main.lesson12.task1.model;

import java.util.ArrayList;
import java.util.List;

public class Flat implements Generatable{
    private List<Room> rooms = new ArrayList<>();

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public <T extends Generatable> T generate() {
        int roomsAmount = 2;
        for (int i = 0; i < roomsAmount; i++) {
            Room room = new Room().generate();
            rooms.add(room);
        }
        return (T) this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flat flat = (Flat) o;

        return getRooms() != null ? getRooms().equals(flat.getRooms()) : flat.getRooms() == null;
    }

    @Override
    public int hashCode() {
        return getRooms() != null ? getRooms().hashCode() : 0;
    }
}
