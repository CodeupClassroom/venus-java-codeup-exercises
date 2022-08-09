package java_two.util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        // get a string from user input
        String userInput = getString();

        // if user typed y or yes then return true
        if(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            return true;
        }
        // else return false
        return false;
    }

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString());

        System.out.printf("Continue (y/n)? ");
        System.out.println(input.yesNo());

    }
}
