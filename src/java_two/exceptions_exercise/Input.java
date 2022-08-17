package java_two.exceptions_exercise;

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

    public int getInt() {
//        return scanner.nextInt();

        // 2. TRY to convert the string into an int using parseInt
//        while(true) {
            // 1. get user input as a string
            String userInput = getString();

            try {
                int userInt = Integer.parseInt(userInput);

                // 3. if successful, return the int
                return userInt;
            } catch (NumberFormatException e) {
                // 4. else output an error msg to user
                System.out.println("\nThis isn't int. :(");

            }
//        }
            return getInt();

        // 5. keep doing this until we can get an int (use a loop OR recursion)


    }

    public int getInt(int min, int max, String prompt) {
        // print prompt everytime this method is called!
        System.out.print(prompt);

        // get int from user
        int userInt = getInt();

        // if int is not between min and max, ask user for another int
        if(userInt < min || userInt > max) {
            System.out.println("What are you, stoopid?");
            userInt = getInt(min, max, prompt);
        }

        // else return the int
        return userInt;
    }

    public double getDouble() {
        String userInput = getString();

        try {
            double userDouble = Double.parseDouble(userInput);

            // 3. if successful, return the int
            return userDouble;
        } catch (NumberFormatException e) {
            // 4. else output an error msg to user
            System.out.println("\nDoubtful it's a double. :|");

        }
//        }
        return getDouble();
    }

    public double getDouble(double min, double max) {
        // get double from user
        double userDouble = getDouble();

        // if double is not between min and max, ask user for another double
        if(userDouble < min || userDouble > max) {
            System.out.println("Double is not between " + min + " and " + max + ". Enter another double: ");
            userDouble = getDouble(min, max);
        }

        // else return the double
        return userDouble;
    }

    public static void main(String[] args) {
        Input input = new Input();
//        System.out.print("Enter a string: ");
//        System.out.println(input.getString());
//
//        System.out.print("Continue (y/n)? ");
//        System.out.println(input.yesNo());
//
//        System.out.print("Enter an int: ");
//        System.out.println(input.getInt());

        System.out.println(input.getInt(10, 20, "Enter an int between 10 and 20: "));

//        System.out.print("Enter a double between 10 and 20: ");
//        System.out.println(input.getDouble(10, 20));
    }
}
