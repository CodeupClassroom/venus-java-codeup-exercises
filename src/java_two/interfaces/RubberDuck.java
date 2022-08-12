package java_two.interfaces;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super(0, 0);
    }

    public RubberDuck(int flySpeed, int swimSpeed) {
        super(flySpeed, swimSpeed);
    }

    @Override
    public void quack() {
        System.out.println("Squeak squeak");
    }

    @Override
    public void eat() {
        System.out.println("The rubber duck looks at you with blank eyes.");
    }

    @Override
    public void fly() {
        // if fly speed is 0 the say something snarky
        if(this.flySpeed == 0) {
            System.out.println("Try throwing the duck instead");
        } else {
            super.fly();
        }
    }
}
