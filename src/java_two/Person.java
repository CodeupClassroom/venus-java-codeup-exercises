package java_two;

public class Person {
    public static long worldPopulation = 7_500_000_000L; // class property

    // fields go first
    private String firstName;
    private String lastName;

    // constructors
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        // ... maybe 10 more lines of complicated stuff to create a person
    }

    public Person() {
        this("Default", "java_two.oo_exercise.Person");
    }

    public String sayHello() {
        Person.worldPopulation++;
        System.out.println(worldPopulation);
        return String.format("Hello from %s %s!", this.firstName, this.lastName);
    }

    public String sayHelloWithLove() {
        String myHello = sayHello();
        myHello += " I love pie!";
        return myHello;
    }

    public static void sayHi() {
        System.out.println("Hi");
    }


    public static Person buildPerson(String firstName, String lastName) {
        // do all the necessary stuff to make a new person object and return it
        Person newPerson = new Person(firstName, lastName);
        return newPerson;
    }

    // accessors

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        Person sue = new Person();
        System.out.println(sue.sayHello());

        Person rick = new Person("Rick", "Sanchez");

        System.out.println(rick.firstName);

        Person bob = new Person("Bob", "Smith");

        System.out.println(rick.sayHello());
        System.out.println(rick.sayHelloWithLove());

        System.out.println(bob.sayHello());

        System.out.println(worldPopulation);

        Person.sayHi();


        // prints "Hello from Rick Sanchez!"
    }
}
