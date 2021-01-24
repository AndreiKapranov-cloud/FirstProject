package by.beginning.exercise;

import java.util.Scanner;

public class ExerciseTwoOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive enteger number: ");
        int topOfThePiramid = scanner.nextInt();
        scanner.close();
        int length = topOfThePiramid * 2 - 1;

        int[][] piramid = new int[length][length];
        for (int i = 0; i < piramid.length; i++) {
            for (int j = 0; j < piramid[0].length; j++) {
                for (int x = 0; x < topOfThePiramid - 1; x++) {


                    piramid[topOfThePiramid - 1][topOfThePiramid - 1] = topOfThePiramid;
// Go through each side of the square of equal numbers.

                    if (i == x && j > (x - 1) && (j < piramid.length - x)) {
                        piramid[i][j] = x + 1;
                    }

                    if ((i == piramid.length - (x + 1)) && (j < piramid.length - x) && (j > (x - 1))) {
                        piramid[i][j] = x + 1;
                    }

                    if (j == x && i > (x - 1) && (i < piramid.length - x)) {
                        piramid[i][j] = x + 1;
                    }
                    if ((j == piramid.length - (x + 1)) && (i < piramid.length - x) &&
                            (i > (x - 1))) {
                        piramid[i][j] = x + 1;
                    }
                }

                System.out.print(" " + piramid[i][j] + " ");

            }
            System.out.println();
        }
    }


}
