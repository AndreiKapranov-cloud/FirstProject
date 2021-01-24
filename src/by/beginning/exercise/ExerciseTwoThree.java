package by.beginning.exercise;

import sun.plugin.dom.css.Counter;

import java.util.Scanner;

public class ExerciseTwoThree {
    public static void main(String[] args) {
        int numOfAttempts = 4;
        int answer;
        int countDown = 0;
        System.out.println("Let's start our quiz.If you don't know the answer-type 1." +
                "The number of attempts is " + numOfAttempts + ".");
        System.out.println("What is the distance between the Moon and Earth. ");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Type the correct answer:");
            answer = scanner.nextInt();
            countDown++;
            if (answer == 384400) {
                System.out.println("Right you are!");
                break;
            }
            if ((countDown == numOfAttempts) || (answer == 1)) {
                System.out.println("You lose.");
                break;
            }


        }
        while (answer != 384400);
        scanner.close();


    }
}
