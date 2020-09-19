package main.lesson1.task4;

public class MetersAmount {
    public static void main(String[] args) {
        MetersAmount amount = new MetersAmount();
        System.out.println(amount.count(115));
        System.out.println(amount.count(800));
        System.out.println(amount.count(278));
    }

    int count (int centimeter) {
        return centimeter / 100;
    }
}
