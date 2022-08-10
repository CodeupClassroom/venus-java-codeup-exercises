package java_two.array_exercise;

import java.util.Random;

public class ServerNameGenerator {
    private static Random random = new Random();

    public static String[] adjectives = {"giddy", "serendipitous", "eager", "austere", "idyllic", "unique", "stupendous", "thicc", "fire", "cosmic"};
    public static String[] nouns = {"lung", "cello", "abode", "tesla", "honda", "pheasant", "toe", "flier", "commons", "flashlight"};

    public static void main(String[] args) {
        String randomAdjective = getRandomStringFromArray(adjectives);
        String randomNoun = getRandomStringFromArray(nouns);
        System.out.println("Here is your server name:\n"
                + randomAdjective + "-" + randomNoun);
    }

    public static String getRandomStringFromArray(String[] strings) {
        // 1. generate a random index from 0 to last element in strings
//        int rando = (int) (Math.random() * strings.length);
        int rando = random.nextInt(strings.length);

        // 2. return the element at the random index in strings
        return strings[rando];
    }
}
