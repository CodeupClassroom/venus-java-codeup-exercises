package java_two.interfaces;

public class Duck extends Bird {
    private int swimSpeed;

    public Duck(int flySpeed) {
        super(flySpeed);
        swimSpeed = 2;
    }

    public Duck(int flySpeed, int swimSpeed) {
        super(flySpeed);
        this.swimSpeed = swimSpeed;
    }

    public void swim() {
        System.out.println("The duck swims at " + swimSpeed + " speed");
    }

    public void quack() {
        System.out.println("Quack quack");
    }
}
