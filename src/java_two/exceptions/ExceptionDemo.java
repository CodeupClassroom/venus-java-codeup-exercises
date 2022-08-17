package java_two.exceptions;

import docrob.util.Input;

public class ExceptionDemo {
    public static void main(String[] args) {

//        int [] array = new int[10];
//
//        try {
//            System.out.println(array[11]);
//
//        } catch(ArrayIndexOutOfBoundsException e) {
//            // code that handles this particular exception
//            System.out.println("Not a valid index!");
//
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//
//        } finally {
//            // close files and db connection and release tons of memory back to program
//            System.out.println("finally called");
//        }
//        int a = 0;
//        try {
//            throw new FileNotFoundException("docrob's exception!");
//        } catch (RuntimeException | FileNotFoundException e) {
//            a = 5;
//            System.out.println("an exception was caught");
//        }
//        // a cannot be seen here
//        System.out.println(a);
        Input input = new Input();

        while(true) {
            try {
                System.out.println("Enter a person's name: ");
                String personName = input.getString();
                Person p = new Person(personName);

                // if we get here: what do we know?
                System.out.println("You made: " + p.getName());
                System.out.println("Done");
                return;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

//        Person [] people = new PersonBuilder().setFirstName("Bob").setFirstName("Sue").setFirstName("Steve").build();

    }
}
