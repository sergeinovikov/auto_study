package main.lesson3.task3;

import java.sql.SQLOutput;

public class Application {
    public static void main(String[] args) {
        Human valery = new Human("Валерий", 75, null, null);
        Human ivan = new Human("Иван", 77, null, null);
        Human aleksandra = new Human("Александра", 72, null, null);
        Human sergey = new Human("Сергей", 38, valery, aleksandra);
        Human marina = new Human("Марина", 35, ivan, null);
        Human vitaly = new Human("Виталий", 12, sergey, marina);
        Human elena = new Human("Елена", 10, sergey, marina);

        System.out.println("Дедушки и бабушки Елены:");
        for (Human greatParents : elena.grandparents) {
            if (greatParents != null) {
                System.out.printf("Имя: %s, Возраст: %d%n", greatParents.name, greatParents.age);
            }
        }
    }

}
