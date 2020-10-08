package main.lesson5.task2;

public class Application {
    public static void main(String[] args) {
        Cat[] carArray = new Cat[5];

        carArray[0] = new Cat("Леопольд", 1);
        carArray[1] = new Cat("Барсик", 2);
        carArray[3] = new Cat("Васька", 3);
        carArray[4] = new Cat("Борис", 4);

        for (Cat current : carArray) {
            try {
                System.out.printf("Имя: %s, возраст: %d%n", current.name, current.age);
            } catch (RuntimeException exception) {
                System.out.printf("Возникла непредвиденная ошибка: элемент в массиве содержит ошибочное значение - %s", exception.getMessage());
                break;
            }
        }
    }
}
