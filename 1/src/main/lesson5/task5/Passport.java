package main.lesson5.task5;

public class Passport {
    private String series;
    private String number;
    private static PassportData archive;

    public Passport(String newSeries, String newNumber) {
            if (newSeries != null) {
                if (newSeries.matches("^\\d{2}\\s\\d{2}$")) {
                    series = newSeries;
                } else {
                    throw new PassportSeriesArgumentException();
                }
            } else {
                throw new PassportSeriesNullPointerException();
            }
            if (newNumber != null) {
                if (newNumber.matches("^\\d{6}$")) {
                    String passport = newSeries + " " + newNumber;
                    boolean isContains = getArchive().uniquePassport(passport);
                    if (!isContains) {
                        series = newSeries;
                        number = newNumber;
                        System.out.printf("Создан новый паспорт. Данные серии:%s, данные номера:%s%n", series, number);
                    } else {
                        throw new PassportAlreadyExistsException();
                    }
                } else {
                    throw new PassportNumberArgumentException();
                }
            } else {
                throw new PassportNumberNullPointerException();
            }
    }


    public static PassportData getArchive() {
        if (archive == null) {
            archive = new PassportData();
        }
        return archive;
    }

}
