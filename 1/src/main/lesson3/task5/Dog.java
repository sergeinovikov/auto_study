package main.lesson3.task5;

import java.util.Random;//импортируем утилиты для работы со случаными числами

public class Dog {//объявляем класс собачек
    String name;//объявляем имя
    int age;//объявляем возраст

    Dog() {//объявляем конструктор собачек
        this.name = Names.randomDogName();//обращаемся к randomDogName и присваеваем случайно полученное имя в переменную name
        this.age = new Random().nextInt(16);//генерируем возраст собачки случайным образом
    }
}
