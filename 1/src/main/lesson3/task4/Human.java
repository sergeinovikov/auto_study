package main.lesson3.task4;

import java.util.Arrays; //импортируем готовое решения для массивов

public class Human { //объявляем сущность типа Human - человек
    String name; //имя человека
    Human[] friends; //пустой список друзей человека

    Human(String name, Human... friends) { //конструктор для создания человека, который принимает его имя и список друзей, если они есть (друзья не обязательны - vararg)
        this.name = name; //передаём имя, которое получили из конструктора и присваеваем его созданной сущности Human
        this.friends = friends; //передаём список друзей, который получили из конструктора и присваеваем его созданной сущности Human
    }

    void addFriend(Human friend) { //метод добавления друга, который принимает в аргумент друга - сущность типа Human
        if (!isFriend(friend)) { //обращение к методу isFriend на проверку наличия дружбы между человеком и добавляемым другом
            if (friends.length<1) { //если дружбы нет между человеком и новым другом нет, то проверяем длину массива друзей человека
                friends = new Human[1]; //если массив друзей не содержит элементов, то создаём новый элемент в массиве друзей человека
            } else { //если массив друзей человека содержит как минимум 1 элемент
                friends = Arrays.copyOf(friends, friends.length + 1); //то копируем массив друзей человека, увеличиваем его на 1 элемент и присваеваем вновь созданный массив обратно массиву друзей человека
            }
            friends[friends.length-1] = friend; //добавляем в последний свободный элемент массива друзей человека сущность нового друга

            if (friend.friends.length<1) { //если дружбы нет между человеком и новым другом нет, то проверяем длину массива друзей нового друга
                friend.friends = new Human[1]; //если массив друзей нового друга не содержит элементов, то создаём новый элемент в массиве друзей нового друга
            } else { //если массив друзей нового друга содержит как минимум 1 элемент
                friend.friends = Arrays.copyOf(friend.friends, friend.friends.length + 1); //то копируем массив друзей нового друга, увеличиваем его на 1 элемент и присваеваем вновь созданный массив обратно массиву друзей нового друга
            }
            friend.friends[friend.friends.length-1] = this; //добавляем в последний свободный элемент массива друзей нового друга сущность человека (обратная дружба)
        } else {
            System.out.println("Данный друг уже добавлен"); //если между человеком и новым другом уже есть дружбы, выводим на экран оповещение об этом
        }
    }

    boolean isFriend(Human name) { //метод, отвечающий на вопрос - является ли добавлеямая сущность уже другом (возвращает да или нет)
        boolean isAlreadyFriend = false; //объявляем переменную, которая обозначает наличие дружбы, по умолчаниб задаём значение нет
        for (Human human : friends) { //объявляем цикл, в котором последовательно проходимся по всем сущностям в списке друзей человека
            if (human == name) { //сравниваем текущего друга с новым добавляемым другом
                isAlreadyFriend = true; //если сущность друга одна и та же - переменная дружбы принимает значение да
                break; //выходим из цикла, так как подтверждение дружбы уже найдено
            }
        }
        return isAlreadyFriend; //возвращаем ответ про наличие дружбы (да или нет)
    }
}

