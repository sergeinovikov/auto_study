package main.lesson5.task4;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Cat[] cat = new Cat[10];
        for (int i = 0; i < cat.length; i++) {
            int randomAge = new Random().nextInt(101) - 50;
            try {
                cat[i] = new Cat("котяра", randomAge);
                System.out.printf("Имя: %s, возраст: %d%n", cat[i].getName(), cat[i].getAge());
            } catch (AgeTooHighException exception) {
                System.out.println("Слишком большой возраст для кота");
            } catch (NullPointerException npe) {
                System.out.println("Ошибка вывода данных");
        }
        }
    }
}
