package by.beginning.exercise;

import java.util.Scanner;

public class ExerciseThreeThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        scanner.close();

        String template = "Good morning,%s.Happy %dth Birthday!";

        System.out.println(String.format(template, name, age));
    }
}

