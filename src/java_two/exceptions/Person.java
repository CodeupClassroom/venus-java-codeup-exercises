package java_two.exceptions;

public class Person {
    private String name;

    public Person(String name) {
        // what does a person object with an invalid name look like?
        // VALIDATOR name must be > 2 characters
        if(name.length() < 3) {
            // can't make a person from this
            throw new IllegalArgumentException("Name must be more than 2 characters!");
        }

        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hi, my name is " + name);
    }

    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}
