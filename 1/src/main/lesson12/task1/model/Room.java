package main.lesson12.task1.model;

public class Room implements Generatable{
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public <T extends Generatable> T generate() {
        width = 5;
        height = 3;
        return (T) this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (getWidth() != room.getWidth()) return false;
        return getHeight() == room.getHeight();
    }

    @Override
    public int hashCode() {
        int result = getWidth();
        result = 31 * result + getHeight();
        return result;
    }
}
