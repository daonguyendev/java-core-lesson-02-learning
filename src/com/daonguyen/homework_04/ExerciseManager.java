package com.daonguyen.homework_04;

import java.util.Scanner;

public class ExerciseManager {

    public static void main(String[] args) {
        int[] array = createInputOutput();

        int totalEvenNumbers = calculateTotalOfEvenNumbers(array);
        System.out.println("Total even numbers is: " + totalEvenNumbers);

        int numberOfOddNumbers = countNumberOfOddNumbers(array);
        System.out.println("Number of odd numbers is: " + numberOfOddNumbers);

        int totalOddNumbers = calculateTotalOfOddNumbers(array);
        System.out.println("Total odd numbers is: " + totalOddNumbers);

        int maxInArray = findMaxInArray(array);
        System.out.println("Max number in array is: " + maxInArray);

        int firstOddInArray = findFirstOddInArray(array);
        System.out.println("First odd in array is: " + firstOddInArray);
    }

    private static int findFirstOddInArray(int[] array) {
        // Input: array -> parameter

        // Handle: find max number
        int firstOddInArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                firstOddInArray = array[i];
                break;
            }
        }

        // Output: first odd in array
        return firstOddInArray;
    }

    private static int findMaxInArray(int[] array) {
        // Input: array -> parameter

        // Handle: find max number
        int maxNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
        }

        // Output: max number
        return maxNumber;
    }

    private static int calculateTotalOfOddNumbers(int[] array) {
        // Input: array -> parameter

        // Handle:
        // - Find odd numbers
        // - Calculate total of odd numbers
        int totalOddNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                totalOddNumbers += array[i];
            }
        }

        // Output: total of even numbers
        return totalOddNumbers;
    }

    private static int countNumberOfOddNumbers(int[] array) {
        // Input: array -> parameter

        // Handle:
        // - Find odd numbers
        // - Count number of odd numbers
        int countOfOddNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOfOddNumbers++;
            }
        }

        // Output: number of odd numbers
        return countOfOddNumbers;
    }

    private static int calculateTotalOfEvenNumbers(int array[]) {
        // Input: array -> parameter

        // Handle:
        // - Find even numbers
        // - Calculate total of even numbers
        int totalEvenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                totalEvenNumbers += array[i];
            }
        }

        // Output: total of even numbers
        return totalEvenNumbers;
    }

    private static int[] createInputOutput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n integer: ");
        int n = scanner.nextInt();
        int array[] = new int[n];

        System.out.println("Enter each element in array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("array["+ i +"]: ");
            int e = scanner.nextInt();
            array[i] = e;
        }

        System.out.println("Our array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        return array;
    }


}
