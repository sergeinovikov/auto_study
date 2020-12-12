package main.lesson14.model;

public class Properties {
    private String type;
    private String address;
    private Double price;

    public Properties() {
    }

    public Properties(String type, String address, Double price) {
        this.type = type;
        this.address = address;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

