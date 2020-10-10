package main.lesson5.task5;

public class Passport {
    private String series;
    private String number;
    private static PassportData archive;

    public Passport(String newSeries, String newNumber) {
        try {
            if (newSeries != null) {
                if (newSeries.matches("^\\d{2}\\s\\d{2}$")) {
                    this.series = newSeries;
                } else {
                    System.out.println("Введите верные значения серии и номера паспорта");
                    throw new PassportSeriesArgumentException();
                }
            } else {
                System.out.println("В конструктор в качестве серии паспорта передан null");
                throw new PassportSeriesNullPointerException();
            }
            if (newNumber != null) {
                if (newNumber.matches("^\\d{6}$")) {
                    String passport = newSeries + " " + newNumber;
                    boolean isContains = getArchive().uniquePassport(passport);
                    if (!isContains) {
                        series = newSeries;
                        number = newNumber;
                    } else {
                        System.out.println("Данные серия и номер паспорта уже существуют");
                        throw new PassportAlreadyExistsException();
                    }
                } else {
                    System.out.println("Введите верные значения серии и номера паспорта");
                    throw new PassportNumberArgumentException();
                }
            } else {
                System.out.println("В конструктор в качестве номера паспорта передан null");
                throw new PassportNumberNullPointerException();
            }
        } catch (PassportIllegalArgumentException illegalArgumentException) {
            System.out.println("Ошибка ввода серии или номера паспорта");
        } catch (NullPointerException nullPointerException) {
            System.out.println("Ошибка - отсутствует ввод ссерии или номера паспорта");
        } catch (PassportAlreadyExistsException existsException) {
            System.out.println("Ошибка - повтор паспорта");
        }
    }


    public static PassportData getArchive() {
        if (archive == null) {
            archive = new PassportData();
        }
        return archive;
    }

    Passport getPassport() {
        try {
            if (this.series == null || this.number == null) {
                throw new NullPointerException();
            }
            System.out.printf("Серия:%s, номер:%s%n", this.series, this.number);
            return this;
        } catch (NullPointerException nullPointerException) {
            return null;
        }
    }
}
