package java_two;


import java.util.Arrays;

public class ArraysLessonMain {

    public static String [] createFruits() {
        // make a new array
        String [] fruits = new String[3];

        // fill it with delicious fruit
        fruits[0] = "grapes";
        fruits[1] = "orange";
        fruits[2] = "durian";

//        Arrays.fill(fruits, "generic fruit");

        // return it
        return fruits;
    }

    public static void printStringArray(String [] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i]);
            // if i is not the last iteration, then print comma and space
            if(i < (stringArray.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String [] fruits = createFruits();
                // {"plum", "peach", "tangerine"};

//        String aString = "my string";

        printStringArray(fruits);

        String [] moreFruits = createFruits();

        System.out.println(fruits == moreFruits);
        System.out.println(Arrays.equals(fruits, moreFruits));

        moreFruits[0] = fruits[2];
        moreFruits[2] = fruits[0];
        System.out.println(Arrays.equals(fruits, moreFruits));
        System.out.println(Arrays.toString(moreFruits));

        // make room in fruits for more fruit
        fruits = Arrays.copyOf(fruits, 5);
        System.out.println(Arrays.toString(fruits));
        fruits[3] = "banana";
        fruits[4] = "cake";

        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));


//        Person [] myPeople = new Person[2];
//        myPeople[0] = new Person("Bob", "Smith");
//        myPeople[1] = new Person("Jill", "Williams");

        Person [] myPeople = {new Person("Bob", "Smith"), new Person("Jill", "Williams")};

//        fruits = new String[5];
//        System.out.println(fruits[0]); // plum
//
//        fruits[0] = "Banana";
//        System.out.println(fruits);
//        System.out.println(fruits[0]);
//
//        // assign fruits var to a new array
//        fruits = new String[13];
//        System.out.println(fruits);
//
//        // print the contents of the array
//        System.out.println(Arrays.toString(fruits));
//
//        Input input = new Input();
//        System.out.print("Enter a fruit: ");
//        fruits[0] = input.getString();
//        System.out.println(Arrays.toString(fruits));
    }
}
