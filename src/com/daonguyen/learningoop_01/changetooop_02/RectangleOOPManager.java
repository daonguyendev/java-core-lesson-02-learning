package com.daonguyen.learningoop_01.changetooop_02;

public class RectangleOOPManager {
    public static void main(String[] args) {
        Rectangle firstRec = new Rectangle(7, 5); // init instance of rectangle for first rectangle
        Rectangle secondRec = new Rectangle(8, 5); // init instance of rectangle for second rectangle
        Rectangle thirdRec = new Rectangle(9, 5); // init instance of rectangle for third rectangle

        System.out.println("Perimeter of first rectangle is: " + calculatePerimeter(firstRec.getLength(), firstRec.getWidth()));
        System.out.println("Perimeter of first rectangle is: " + firstRec.calculatePerimeter(firstRec.getLength(), firstRec.getWidth()));

        System.out.println("Perimeter of second rectangle is: " + calculatePerimeter(secondRec.getLength(), secondRec.getWidth()));
        System.out.println("Perimeter of second rectangle is: " + secondRec.calculatePerimeter(secondRec.getLength(), secondRec.getWidth()));

        System.out.println("Perimeter of third rectangle is: " + calculatePerimeter(thirdRec.getLength(), thirdRec.getWidth()));
        System.out.println("Perimeter of third rectangle is: " + thirdRec.calculatePerimeter(thirdRec.getLength(), thirdRec.getWidth()));
    }

    // Way 1
    private static float calculatePerimeter(float length, float width) {
        return (length + width) * 2;
    }
}
