package main.lesson7.task1;

public class Application {

    public static void main(String[] args) {
        MyArrayList strings = new MyArrayList();
        strings.add(0, "zero");
        strings.add(2, "two");
        strings.get(2);
        strings.add("last number");
        strings.size();
        strings.contains("zero");
        strings.contains("one");
    }
}


