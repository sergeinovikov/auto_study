package main.lesson10.task4.entities;

import java.util.Random;

public class Passport implements Generatable {
    private String series;
    private String number;

    @Override
    public Passport generate() {
        int seriesLength = Property.PASSPORT_SERIES_DIGITS;
        StringBuilder series = new StringBuilder();
        for (int i = 0; i < seriesLength; i++) {
            series.append(new Random().nextInt(10));
        }
        this.series = series.toString();

        int numberLength = Property.PASSPORT_NUMBER_DIGITS;
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < numberLength; i++) {
            number.append(new Random().nextInt(10));
        }
        this.number = number.toString();

        return this;
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }
}
