package main.lesson3.task4;

public class Application {
    public static void main(String[] args) {
        Human sergey = new Human("Сергей"); //создаём нового человека без друзей
        Human valery = new Human("Валерий");
        Human grigorii = new Human("Григорий");
        Human egor = new Human("Егор");
        Human aleksandr = new Human("Александр");
        Human michael = new Human("Михаил");
        Human stanislav = new Human("Станислав");

        sergey.addFriend(valery); //добавляем нового друга к человеку
        sergey.addFriend(valery); //проверяем повторное добавление одного и того же друга
        valery.addFriend(sergey); //проверяем взаимную дружбу
        sergey.addFriend(grigorii);
        valery.addFriend(stanislav);
        stanislav.addFriend(michael);
        grigorii.addFriend(egor);
        egor.addFriend(aleksandr);
        aleksandr.addFriend(michael);

        isFriend(sergey, grigorii); //Проверяем друзья ли эти 2 человека
        isFriend(sergey, aleksandr);
        isFriend(sergey, valery);
        isFriend(stanislav, michael);
        isFriend(michael, stanislav); //Проверяем друзья ли эти 2 человека просто поменяв местами имена (проверка взаимной дружбы)
        isFriend(michael, valery);
    }

    public static void isFriend(Human name1, Human name2) { //проверка на дружбу между двумя людьми
        System.out.printf("Результат проверки дружбы %s и %s - %s%n", name1.name, name2.name, name1.isFriend(name2)); //выводим на экран результат выполнения метода isFriend из класса Human- друзья или нет
    }
}