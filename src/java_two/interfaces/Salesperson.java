package java_two.interfaces;

public class Salesperson extends Employee implements HeavyLifter {

    public Salesperson(String name, String department) {
        super(name, department);
    }

    @Override
    public String work() {
        return this.name + " sellz seashells";
    }

    @Override
    public void liftHeavyObject(String heavyObject) {
        System.out.println(this.name + " lifts " + heavyObject);
    }

}
