package main.lesson3.task5;

import java.util.Arrays;//импортируем утилиты для работы с массивами
import java.util.Random;//импортируем утилиты для работы со случайными числами

public class Human { //объявляем класс людей
    String name; //объявляем имя
    Cat[] cats; //объявляем массив кошек (без размера)
    Dog[] dogs; //объявляем массив собак (без размера)

    Human() { //объявляем конструктор класса
        this.name = Names.randomHumanName(); //обращаемся к randomHumanName и присваеваем случайно полученное имя в переменную name
        int randomCatNumber = new Random().nextInt(4); //получаем слуайное количество кошек
        int randomDogNumber = new Random().nextInt(4); //получаем случайное количество собак

        for (int i = 0; i < randomCatNumber; i++) { //объявляем массив, в котром запишем всех кошек в масив cats (число кошек получено случайным образом)
            if (cats == null) { //если кошек нет, то
                cats = new Cat[1]; //создадим первый элемент массива cats
            } else { //иначе
                cats = Arrays.copyOf(cats, cats.length + 1);//скопируем структуру массива cats, увеличим количество его элементов на 1 и вставим обратно в массив cats
            }
            Cat cat = new Cat(); //создаём нового кота или кошку
            cats[cats.length - 1] = cat; //записываем созданное животное в последнюю ячейку массива cats
        }

        for (int i = 0; i < randomDogNumber; i++) { //объявляем массив, в котром запишем всех собачек в масив dogs (число собачек получено случайным образом)
            if (dogs == null) {//если собачек нет, то
                dogs = new Dog[1];//создадим первый элемент массива dogs
            } else {//иначе
                dogs = Arrays.copyOf(dogs, dogs.length + 1);//скопируем структуру массива dogs, увеличим количество его элементов на 1 и вставим обратно в массив dogs
            }
            Dog dog = new Dog();//создаём новую собачку
            dogs[dogs.length - 1] = dog;//записываем созданное животное в последнюю ячейку массива dogs
        }
    }
}
