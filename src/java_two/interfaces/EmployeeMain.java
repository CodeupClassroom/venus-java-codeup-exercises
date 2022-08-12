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

        Employee [] peons = new Employee[3];
        peons[0] = new Accountant("Bob", "Accounting");
        peons[1] = new Salesperson("Sally", "Sales");
        peons[2] = new Manager("Ragnar", "Management");

        // iterate over the peons and ask what they are and if they can lift heavy things
        // if they can lift heavy things, then make them do that
        for (Employee peon : peons) {
            System.out.println("Analyzing " + peon.getName());
            System.out.println("\tIs " + peon.getName() + " an accountant? " + (peon instanceof Accountant));
            System.out.println("\tIs " + peon.getName() + " an salesperson? " + (peon instanceof Salesperson));
            System.out.println("\tIs " + peon.getName() + " an manager? " + (peon instanceof Manager));
            System.out.println("\tCan " + peon.getName() + " lift heavy things? " + (peon instanceof HeavyLifter));
            if(peon instanceof HeavyLifter) {
                HeavyLifter lifter = (HeavyLifter) peon;
                lifter.liftHeavyObject("something heavy");
            }
        }
    }
}
