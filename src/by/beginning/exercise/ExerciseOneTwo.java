package by.beginning.exercise;

import java.util.Scanner;

public class ExerciseOneTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstPoint = -10;
        int secondPoint = 5;
        System.out.println("Please,enter an integer number:");
        int input = scanner.nextInt();
        scanner.close();
        if (input <= firstPoint) {
            System.out.println("First range.");
        } else if (input > firstPoint && input <= secondPoint) {
            System.out.println("Second range.");
        } else {
            System.out.println("Third range.");
        }
    }
}


