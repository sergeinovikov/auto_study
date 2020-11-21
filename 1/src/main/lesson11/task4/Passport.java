package main.lesson11.task4;

public class Passport {
    private String series;
    private String number;

    public String getSeries() {
        return series;
    }

    public Passport setSeries(String series) {
        this.series = series;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public Passport setNumber(String number) {
        this.number = number;
        return this;
    }
}
