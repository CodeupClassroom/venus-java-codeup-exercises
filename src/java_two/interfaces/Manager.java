package java_two.interfaces;

public class Manager extends Employee implements HeavyLifter {

    public Manager(String name, String department) {
        super(name, department);
    }

    @Override
    public String work() {
        return this.name + " bosses someone around";
    }

    @Override
    public void liftHeavyObject(String heavyObject) {
        System.out.println(this.name + " tells someone else to lift " + heavyObject);
    }
}
