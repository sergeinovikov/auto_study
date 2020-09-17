package main.lesson1.task4;

public class MetersAmount {
    public static void main(String[] args) {
        MetersAmount Amount = new MetersAmount();
        System.out.println(Amount.Count(278));
    }

    int Count (int centimeter) {
        return centimeter / 100;
    }
}
