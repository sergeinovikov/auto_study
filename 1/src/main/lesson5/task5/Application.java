package main.lesson5.task5;

public class Application {
    public static void main(String[] args) {
        createPassport("22 22", "123456");
        createPassport("22 2", "123456");
        createPassport("22 22", "1234567");
        createPassport(null, "123456");
        createPassport("22 22", null);
        createPassport("22 22", "123456");
        createPassport("11 11", "123457");
        createPassport("11 11", "123457");
    }

    private static Passport createPassport(String series, String number) {
        try {
            return new Passport(series, number);
        } catch (PassportSeriesArgumentException | PassportNumberArgumentException |
                PassportSeriesNullPointerException | PassportNumberNullPointerException exception) {
            System.out.println("Введите верные значения серии и номера паспорта");
            return null;
        } catch (PassportAlreadyExistsException exception) {
            System.out.println("Данные серия и номер паспорта уже существуют");
            return null;
        }
    }
}
