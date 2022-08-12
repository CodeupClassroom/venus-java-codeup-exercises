package java_two.interfaces;

import java_two.interfaces.Accountant;
import java_two.interfaces.Employee;
import java_two.interfaces.Manager;
import java_two.interfaces.Salesperson;

public class EmployeeMain {
    public static void main(String[] args) {

        Accountant bob = new Accountant("Bob", "Accounting");
        System.out.println(bob.work());

        Salesperson sally = new Salesperson("Sally", "Sales");
        System.out.println(sally.work());

        Manager mgr = new Manager("Ragnar", "Management");
        mgr.eatLunch();

        sally.liftHeavyObject("an anvil");

        Employee genericEmployee = sally;
        ((Salesperson) genericEmployee).liftHeavyObject("a piano");

        mgr.liftHeavyObject("a paper clip");

        HeavyLifter heavyLifter = sally;
        sally.liftHeavyObject("the Rock");
        heavyLifter.liftHeavyObject("the Other Rock");

        // ask sally some questions about herself
        System.out.println("bob is an employee: " + (bob instanceof Employee));
//        System.out.println("sally is an employee: " + (sally instanceof Manager));
        System.out.println("bob is an employee: " + (bob instanceof Accountant));
        System.out.println("bob is an employee: " + (bob instanceof HeavyLifter));
    }
}
