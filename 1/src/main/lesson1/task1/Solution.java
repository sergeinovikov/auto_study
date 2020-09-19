package main.lesson1.task1;

public class Solution {
    public static void main(String[] args) {
        Solution circle = new Solution();
        System.out.println(circle.areaOfACircle(0));
        System.out.println(circle.areaOfACircle(2));
        System.out.println(circle.areaOfACircle(100));
        }
    double areaOfACircle(int radius) {
        return 3.14*radius*radius;
    }
}
