package main.lesson3.task5;

import java.util.Random; // импортируем утилиты для работы со случайными числами

public class Names {
    static String[] humanNames = {"Василий", "Владимир", "Оксана", "Пётр", "Евгений", "Валентина", "Екатерина", "Юлия", "Анатолий", "Мария"}; //объявляем массим имён для людей
    static String[] catNames = {"Барсик", "Шерри", "Маркиз", "Алиса", "Бетти", "Дымка", "Марсик", "Персик", "Котэ", "Кити"}; //объявляем массим имён для кошек
    static String[] dogNames = {"Арчи", "Жучка", "Шарик", "Мухтар", "Тузик", "Бим", "Белка", "Стрелка", "Джесси", "Никки"}; //объявляем массим имён для собак

    static String randomHumanName() { //метод, с помощью которого получаем случайное имя для человека
        int random = new Random().nextInt(humanNames.length); //получаем случайное число в пределах количества элементов массива humanNames
        return humanNames[random]; //возвращаем случайное имя из массива с именами humanNames туда, откуда пошло изначальное обращение к методу randomHumanName
    }

    static String randomCatName() { //метод, с помощью которого получаем случайное имя для человека
        int random = new Random().nextInt(catNames.length);//получаем случайное число в пределах количества элементов массива catNames
        return catNames[random];//возвращаем случайное имя из массива с именами humanNames туда, откуда пошло изначальное обращение к методу randomCatName
    }

    static String randomDogName() { //метод, с помощью которого получаем случайное имя для человека
        int random = new Random().nextInt(dogNames.length);//получаем случайное число в пределах количества элементов массива dogNames
        return dogNames[random];//возвращаем случайное имя из массива с именами humanNames туда, откуда пошло изначальное обращение к методу randomDogName
    }
}
