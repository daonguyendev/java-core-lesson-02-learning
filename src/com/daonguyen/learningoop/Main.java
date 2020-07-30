package com.daonguyen.learningoop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // create list of student
        List students = createStudents();

        // calculate average of each student
        calculateAverage(students);

        // rating of each student
        ratingStudent(students);

        // find student have max average
        calculateAverage(students);

        // TODO: print all of weakly students
        findWeaklyStudents(students);
    }

    private static void findWeaklyStudents(List students) {
        List<Student> weaklyStudents = new ArrayList<>();

        String rating = "";
        System.out.println("\nList of weakly student is: ");
        for (int i = 0; i < students.size(); i++) {
            Student student = (Student) students.get(i);
            rating = handleRating(student);

            if (rating.equals("Weak")) {
                weaklyStudents.add(student);
            }
        }

        for (int i = 0; i < weaklyStudents.size(); i++) { // not good here
            Student student = (Student) students.get(i);
            System.out.println("\nAverage of " + student.getName() + "] is: " + student.getAverage());
        }
    }

    private static void calculateAverage(List students) {
        int position = 0;
        for (int i = 0; i < students.size() - 1; i++) {
            Student firstStudent = (Student) students.get(i);
            Student nextStudent = (Student) students.get(i + 1);

            if (firstStudent.getAverage() < nextStudent.getAverage()) {
                position = i + 1;
            }
        }
        Student maxAverage = (Student) students.get(position);
        System.out.println("\nStudent have max average is: ");
        System.out.println(maxAverage.getName() + " with average = " + maxAverage.getAverage());
    }

    private static String handleRating(Student student) {
        float average = student.getAverage();

        if (average >= 9) {
            return "Excellent";
        } else if (average >= 8 && average < 9) {
            return "Good";
        } else if (average >= 7 && average < 8) {
            return "Little Good";
        } else if (average >= 6 && average < 7) {
            return "Average Little Good";
        } else if (average >= 5 && average < 6) {
            return "Average";
        } else {
            return "Weak";
        }
    }

    private static void ratingStudent(List<Student> students) {
        String rating = "";
        System.out.println("\nRating of each student is: ");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            rating = handleRating(student);
            System.out.println("Average of " + student.getName() + " is: " + rating);
        }
    }

    private static List createStudents() {
        Student ty = new Student("Ty", 1, 5, 6, 7);
        Student teo = new Student("Teo", 2, 6, 7, 8);
        Student tin = new Student("Tin", 3, 7, 8, 9);

        List students = new ArrayList<Student>();
        students.add(ty);
        students.add(teo);
        students.add(tin);

        return students;
    }
}