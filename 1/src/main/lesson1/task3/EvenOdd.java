package main.lesson1.task3;

public class EvenOdd {
    public static void main(String[] args) {
        EvenOdd n = new EvenOdd();
        System.out.println(n.evenOrOdd(19));
        System.out.println(n.evenOrOdd(14));
    }

    boolean evenOrOdd (int number) {
        return !(number % 2==0);
    }
}
