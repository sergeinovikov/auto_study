package main.lesson3.task2;

public class Cat {
    int age;
    int weight;
    String name;

    Cat (int age1, int weight1, String name1) {
        age = age1;
        weight = weight1;
        name = name1;
    }

    public static int compareCats(Cat a, Cat b) {
        return a.name.compareTo(b.name);
    }
}
