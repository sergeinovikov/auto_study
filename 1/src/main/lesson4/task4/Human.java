package main.lesson4.task4;

public class Human {
    private String lastName;
    private String firstName;
    private int age;
    private final Passport passport = new Passport();

    public Human setFirstName(String newFirstName) {
        if (newFirstName.matches("^([А-Я-Ё])([а-я-ё]{2,})$")) {
            this.firstName = newFirstName;
            System.out.print("Имя валидно, ");
        } else {
            System.out.print("Имя не валидно, ");
        }
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Human setLastName(String newLastName) {
        if (newLastName.matches("^([А-Я-Ё])([а-я-ё]{2,})$")) {
            this.lastName = newLastName;
            System.out.print("фамилия валидна, ");
        } else {
            System.out.print("фамилия не валидна, ");
        }
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Human setPassport(String newSeries, String newNumber) {
        this.passport.setSeries(newSeries).setNumber(newNumber);
        return this;
    }

    public Passport getPassport() {
        return passport;
    }

    public Human setAge(int newAge) {
        if (newAge > 0 && newAge < 120) {
            this.age = newAge;
        } else {
            System.out.printf("возраст не валиден%n");
        }
        return this;
    }

    public int getAge() {
        return age;
    }


}
