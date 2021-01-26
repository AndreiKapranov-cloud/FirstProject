package by.beginning.exercise;

import java.util.Random;

public class ExerciseThreeOne {


    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 100; i++) {
            sb.append(random.nextInt(1001)).append(" ");
        }
        String str = sb.toString();
        System.out.println(str);

    }
}


