// TODO: change this to the package where your exercise exists in your project
package java_two.array_exercise;

// TODO: change this to wherever your Input class is located
import docrob.util.Input;

public class MoviesApplicationStarter {
    public static final int INVALID_CHOICE = -1;
    public static final int EXIT_CHOICE = 0;

    public static void main(String[] args) {
        Input input = new Input();

        // loop until the user says he/she does not wish to continue
        int choice = INVALID_CHOICE;
        while(choice != EXIT_CHOICE) {
            printMenu();

            choice = input.getInt(0, 5);

            doChoice(choice);

        }
    }

    private static void printMenu() {
        System.out.print("""
                What would you like to do?
                                
                0 - exit
                1 - view all movies
                2 - view movies in the musical category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the scifi category
                            
                Enter your choice: """);
    }

    private static void doChoice(int choice) {
        // TODO: call your functions based on whatever the user's choice is
        switch(choice) {
            case 1:
                // TODO: view all movies
                break;
            case 2:
                // TODO: view movies in the musical category
                break;
            case 3:
                // TODO: view movies in the drama category
                break;
            case 4:
                // TODO: view movies in the horror category
                break;
            case 5:
                // TODO: view movies in the scifi category
                break;
        }
    }

}
