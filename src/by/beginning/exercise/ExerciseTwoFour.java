package by.beginning.exercise;

import java.util.Random;
import java.util.Scanner;

public class ExerciseTwoFour {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Type an integer number from 0 to 100:");
        Scanner scanner = new Scanner(System.in);
        int countDown = 0;
        int secret = scanner.nextInt();
        int attempt;
        do {
            attempt = random.nextInt(101);

            countDown++;

        } while (attempt != secret);
        scanner.close();
        System.out.println("Number of attempts = " + countDown + ".");
    }
}
