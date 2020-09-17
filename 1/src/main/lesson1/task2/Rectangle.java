package main.lesson1.task2;

public class Rectangle {
    public static void main(String[] args){
        Rectangle Answer = new Rectangle();
        System.out.println(Answer.SquareBigger(6,3));
    }

    boolean SquareBigger (int height, int width) {
        return (height*width)>(2*(height+width));
    }
}
