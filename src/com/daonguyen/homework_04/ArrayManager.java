package com.daonguyen.homework_04;

public class ArrayManager {

    // Loops: for, while, do-while, foreach
    public static void main(String[] args) {
//        int count = 0;
//
//        while (count < 5) {
//            System.out.println("Do homework");
//            System.out.println("count = " + count);
//            count++;
//        }
//
//        System.out.println("------------");
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Do homework");
//            System.out.println("i = " + i);
//        }
//
//        System.out.println("------------");

        int array[] = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("------------");

        for (int item : array) {
            System.out.println(item);
        }

        // difference between for and foreach:
        // foreach will get actual value, for will get index
        // foreach is lower than for
    }
}
