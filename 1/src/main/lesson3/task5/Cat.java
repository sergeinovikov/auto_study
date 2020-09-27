package main.lesson3.task5;

import java.util.Random;//импортируем утилиты для работы со случаными числами

public class Cat {//объявляем класс кошек
    String name;//объявляем имя
    int age;//объявляем возраст

    Cat() {//объявляем конструктор кошек
        this.name = Names.randomCatName();//обращаемся к randomCatName и присваеваем случайно полученное имя в переменную name
        this.age = new Random().nextInt(16);//генерируем возраст кошки случайным образом
    }
}
