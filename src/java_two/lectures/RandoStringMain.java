package java_two.lectures;

import java_two.array_exercise.ServerNameGenerator;

public class RandoStringMain {
    public static void main(String[] args) {
        String [] myStrings = {"apple", "banana", "dog"};
        System.out.println(ServerNameGenerator.getRandomStringFromArray(myStrings));
    }
}
