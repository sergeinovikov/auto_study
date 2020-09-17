package main.lesson1.task3;

public class EvenOdd {
    public static void main(String[] args) {
        EvenOdd N = new EvenOdd();
        System.out.println(N.EvenOrOdd(19));
    }

    boolean EvenOrOdd (int number) {
        return !(number % 2==0);
    }
}
