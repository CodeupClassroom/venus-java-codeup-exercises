package java_two;

import java_two.Person;

public class OOLessonMain {

    public static void main(String[] args) {
        Person rick = new Person("Rick", "Sanchez");
        rick.setFirstName("Not Rick");
        System.out.println(rick.sayHello());

        Person bob = Person.buildPerson("Bob", "Smith");

        System.out.println(Math.abs(Math.PI));
    }
}
