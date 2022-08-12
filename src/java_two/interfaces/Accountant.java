package java_two.interfaces;

public class Accountant extends Employee {


    public Accountant(String name, String department) {
        super(name, department);
    }

    @Override
    public String work() {
        return name + " counts beans";
    }
}
