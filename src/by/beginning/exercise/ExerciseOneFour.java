package by.beginning.exercise;

import java.util.Scanner;

public class ExerciseOneFour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double ourNumb = scanner.nextDouble();
        System.out.println("Enter a second number: ");
        double incomeNumb = scanner.nextDouble();
        scanner.close();
        double tail = ourNumb * 0.1;
        if (ourNumb >= 0 && incomeNumb >= ourNumb - tail && incomeNumb <= ourNumb + tail) {
            System.out.println("close");
        } else if (ourNumb <= 0 && incomeNumb <= ourNumb - tail && incomeNumb >= ourNumb + tail) {
            System.out.println("close");
        } else {
            System.out.println("Far");
        }
    }
}




