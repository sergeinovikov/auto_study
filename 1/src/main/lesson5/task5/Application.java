package main.lesson5.task5;

public class Application {
    public static void main(String[] args) {
        Application passportSoftware = new Application();
        passportSoftware.createPassport("22 22", "123456");
        passportSoftware.createPassport("22 2", "123456");
        passportSoftware.createPassport("22 2", "1234567");
        passportSoftware.createPassport(null, "123456");
        passportSoftware.createPassport("22 22", null);
        passportSoftware.createPassport("22 22", "123456");
        passportSoftware.createPassport("11 11", "123457");
        passportSoftware.createPassport("11 11", "123457");
    }

    public Passport createPassport(String series, String number) {
        Passport passport = new Passport(series, number);
        return passport.getPassport();
    }
}
