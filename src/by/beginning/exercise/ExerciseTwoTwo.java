package by.beginning.exercise;

import java.util.Scanner;

public class ExerciseTwoTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        int number;
        do {
            System.out.println("Enter the month:");
            month = scanner.nextInt();

        } while ((month <= 0) || (month > 12));
        do {
            System.out.println("Enter the day:");
            number = scanner.nextInt();
        } while ((number <= 0) || (number > 31));
        scanner.close();
        int[] shortMonths = new int[]{2, 4, 6, 9, 11};
        int[] longMonths = new int[]{1, 3, 5, 7, 8, 10, 12};

        for (int i = 0; i < shortMonths.length; i++) {

//go through the months,not forgetting about February.
            if (((month == shortMonths[i]) && (number == 31)) || ((month == 2) && (number > 28))) {


                System.out.println("There is no such day in the month.");
                break;
            }
            if (((month == shortMonths[i]) && (number < 31) && (month != 2)) || ((month == 2) &&
                    (number < 29))) {
                System.out.println("There is such a day in the month.");
                break;
            }

        }
        for (int i = 0; i < longMonths.length; i++) {
            if (month == longMonths[i]) {
                System.out.println("There is such a day in the month.");
            }

        }

    }


}

