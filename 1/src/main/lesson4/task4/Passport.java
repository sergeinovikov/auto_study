package main.lesson4.task4;

public class Passport {
    private String series;
    private String number;
    private String tempSeries;
    private String tempNumber;
    private static PassportData archive;

    public Passport setSeries(String newSeries) {
        if (newSeries != null) {
            if (newSeries.matches("^\\d{4}$")) {
                System.out.print("Данные серии паспорта валидны, ");
                tempSeries = newSeries;
            } else {
                System.out.print("Данные серии паспорта не валидны, ");
            }
        } else {
            System.out.print("Данные серии паспорта не валидны, ");
        }
        return this;
    }

    public String getSeries() {
        return series;
    }

    public void setNumber(String newNumber) {
        if (newNumber != null) {
            if (newNumber.matches("^\\d{6}$")) {
                System.out.printf("данные номера паспорта валидны%n");
                tempNumber = newNumber;
                if (tempSeries != null) {
                    String passport = tempSeries + " " + tempNumber;
                    checkPassport(passport);
                }
            } else {
                System.out.printf("данные номера паспорта не валидны%n");
            }
        }
    }

    public void checkPassport(String passport) {
        boolean isInArchive = getArchive().uniquePassport(passport);
        if (!isInArchive) {
            series = tempSeries;
            number = tempNumber;
        }
    }

    public String getNumber() {
        return number;
    }

    public static PassportData getArchive() {
        if (archive == null) {
            archive = new PassportData();
        }
        return archive;
    }
}
