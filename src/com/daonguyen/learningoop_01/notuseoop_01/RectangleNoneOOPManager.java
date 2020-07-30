package com.daonguyen.learningoop_01.notuseoop_01;

import java.util.Scanner;

public class RectangleNoneOOPManager {
    // declare 3 times 2 variables: length, width and calculate perimeter for each rectangle
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        float length1 = scanner.nextFloat();

        System.out.print("Enter width of rectangle: ");
        float width1 = scanner.nextFloat();

        System.out.print("Enter length of rectangle: ");
        float length2 = scanner.nextFloat();

        System.out.print("Enter width of rectangle: ");
        float width2 = scanner.nextFloat();

        System.out.print("Enter length of rectangle: ");
        float length3 = scanner.nextFloat();

        System.out.print("Enter width of rectangle: ");
        float width3 = scanner.nextFloat();

        System.out.println("Perimeter of first rectangle is: " + calculatePerimeter(length1, width1));
        System.out.println("Perimeter of second rectangle is: " + calculatePerimeter(length2, width2));
        System.out.println("Perimeter of third rectangle is: " + calculatePerimeter(length3, width3));
    } // duplicate 2 variables length, width for each rectangle => need to change to object class at package changetooop

    private static float calculatePerimeter(float length, float width) {
        return (length + width) * 2;
    }
}
