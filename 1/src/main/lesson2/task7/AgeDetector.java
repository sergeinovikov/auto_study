package main.lesson2.task7;

public class AgeDetector {
    public static void main(String[] args) {
        AgeDetector ageSort = new AgeDetector();
        ageSort.ageCheck(32);
        ageSort.ageCheck(52);
        ageSort.ageCheck(66);
        ageSort.ageCheck(82);
        ageSort.ageCheck(25);
        ageSort.ageCheck(44);
        ageSort.ageCheck(60);
        ageSort.ageCheck(75);
        ageSort.ageCheck(22);
        ageSort.ageCheck(119);
    }

    void ageCheck(int age) {
        if (age >= 25 && age < 44) {
            System.out.println("Молодой возраст");
        } else if (age >= 44 && age < 60) {
            System.out.println("Средний возраст");
        } else if (age >= 60 && age < 75) {
            System.out.println("Пожилой возраст");
        } else if (age >= 75 && age < 90) {
            System.out.println("Старческий возраст");
        } else {
            System.out.println("Неизвестный возраст");
        }
    }
}

