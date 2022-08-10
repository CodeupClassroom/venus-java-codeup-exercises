package java_two.array_exercise;

import java_two.oo_exercise.Person;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

        Person[] people = new Person[3];
        System.out.println(Arrays.toString(people));

        people[0] = new Person("Bob");
        people[1] = new Person("Sue");
        people[2] = new Person("Tom");

        for(Person person : people) {
            System.out.println(person);
        }

        people = addPerson(people, new Person("Lou"));
        for(Person person : people) {
            System.out.println(person);
        }

    }

    private static Person [] addPerson(Person [] people, Person newPerson) {
        // 1. create a new array that is size of people + 1
        Person [] newArray = Arrays.copyOf(people, people.length + 1);

        // 2. plug newPerson into the last element of the new array
        newArray[newArray.length - 1] = newPerson;

        // 3. return the new array
        return newArray;
    }
}
