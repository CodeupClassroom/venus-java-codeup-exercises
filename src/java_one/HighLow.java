package java_one;

import docrob.util.Input;

public class HighLow {
    private static final int LOW_VAL = 1;
    private static final int HIGH_VAL = 100;
    private static Input input = new Input();

    public static void main(String[] args) {
        // 1. initialize the answer (randomly generate a # from 1 to 100)
        int answer = getRandomNumber(LOW_VAL, HIGH_VAL);
//        System.out.println("DEBUG: answer is " + answer);

        // 2. keep looping until the user guesses the answer
        while(true) {
            int guess = getUserGuess();

            if(guess < answer) {
                System.out.println("HIGHER");
            } else if(guess > answer) {
                System.out.println("LOWER");
            } else {
                System.out.println("CORRECT!");
                break;
            }
        }
    }

    private static int getUserGuess() {
        return input.getInt(LOW_VAL, HIGH_VAL,
                "Enter a number from " + LOW_VAL + " to " + HIGH_VAL + ": ");
    }

    private static int getRandomNumber(int low, int high) {
        return (int) (Math.random() * high + low);
    }
}
