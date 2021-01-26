package by.beginning.exercise;

public class ExerciseThreeFour {
    public static void main(String[] args) {
        String str = "Cat dog dog cat dog cat cat .";
        String cat = "cat";
        String dog = "dog";
        int counterForDog = 0;
        int counterForCat = 0;
        for (String result : str.split(" ")) {
            System.out.println(result);

            if (result.equalsIgnoreCase(cat)) {
                counterForCat++;
            }
            if (result.equalsIgnoreCase(dog)) {
                counterForDog++;
            }
        }

        System.out.println(counterForCat + " cats and " + counterForDog + " dogs.");
    }
}


