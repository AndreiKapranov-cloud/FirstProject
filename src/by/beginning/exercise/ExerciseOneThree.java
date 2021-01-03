package by.beginning.exercise;

import java.util.Scanner;

public class ExerciseOneThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numA: ");
        double numA = scanner.nextDouble();
        System.out.println("Enter numB: ");
        double numB = scanner.nextDouble();
        System.out.println("Enter numC: ");
        double numC = scanner.nextDouble();
        scanner.close();
        double average;
        if (numA > numB && numA > numC) {
            System.out.println("numA is max");
        }
        if (numB > numA && numB > numC) {
            System.out.println("numB is max");
        }
        if (numC > numA && numC > numB) {
            System.out.println("numC is max");
        }
        if (numA < numB && numA < numC) {
            System.out.println("numA is min");
        }
        if (numB < numA && numB < numC) {
            System.out.println("numB is min");
        }
        if (numC < numA && numC < numB) {
            System.out.println("numC is min");
        }
        //what if some of the numbers are equal?
        if (numA == numB && numA > numC) {
            System.out.println("both numA and numB are max");
        }
        if (numA == numC && numA > numB) {
            System.out.println("both numA and numC are max");
        }
        if (numB == numC && numB > numA) {
            System.out.println("both numB and numC are max");
        }
        if (numA == numB && numA < numC) {
            System.out.println("both numA and numB are min");
        }
        if (numA == numC && numA < numB) {
            System.out.println("both numA and numC are min");
        }
        if (numB == numC && numB < numA) {
            System.out.println("both numB and numC are min");
        }
        //It's dumb,but what if three numbers are equal.
        if (numA == numB && numA == numC) {
            System.out.println("equal numbers");
        }
        average = (numA + numB + numC) / 3;
        System.out.println("average = " + average);
    }
}
