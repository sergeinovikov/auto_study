package main.lesson1.task2;

public class Rectangle {
    public static void main(String[] args){
        Rectangle answer = new Rectangle();
        System.out.println(answer.squareBigger(2,7));
        System.out.println(answer.squareBigger(6,5));
        System.out.println(answer.squareBigger(6,3));
    }

    boolean squareBigger (int height, int width) {
        return (height*width)>(2*(height+width));
    }
}
