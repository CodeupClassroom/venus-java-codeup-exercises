package JavaOne;

public class SyntaxTypeVariablesLecture {

    public static void main(String[] args) {

        //Statements
        System.out.println("We need to end a statement with a piece of punctuation - the semi-colon [;]");

        System.out.println("Try to run me");

        //Comments

//        We can write a comment like this
        /* Write another one - don't forget to develop good commenting habits */
        /* KH - when you come back to this on Monday, you're right in the middle
         */

        //Escaping from characters in strings
        //And showing \n and \t
        System.out.println("\"");
        System.out.println("\\");
        System.out.print("This needs a newline right about here \n Okay, thanks\n");
        System.out.print("This needs a tab after my newline please  \n\t Okay, thanks");


        //Variables - declaring and initializing
        int myFavNum;

        myFavNum = 7;

        System.out.println("myFavNum = " + myFavNum);

        myFavNum = 13;

        System.out.println("myFavNum = " + myFavNum);

        int myAge = 33;

        System.out.println();
        //Final is a way to set up constants = similar rules in declaring/initializing + will give a CTE if we try to reassign

        final String myName = "Kenneth Berserker Howell";

//        myName = "Jenneth Pandrew Powell";

        //Binary vs Unary

        System.out.println(5 + 10);

        System.out.println(myFavNum++);
        System.out.println("Now it should have incremented: " + myFavNum);

        System.out.println(myFavNum += 6);

        //Casting

        int myFavoriteNumberAgain = 13;

        long myFavoriteNumberPrecisely = myFavoriteNumberAgain;

        byte lessPreciseNumber = (byte) myFavoriteNumberPrecisely;
        System.out.println();
        //What's the problem?
        double yourPayCheck = 950.99;

        System.out.println("Congratulations - you got paid " + yourPayCheck);

        int woopsWrongType = (int) yourPayCheck;

        System.out.println("Congratulations - you got paid " + woopsWrongType);
    }


}
