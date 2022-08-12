package java_two.interfaces;

public abstract class Bird {
    protected int flySpeed;

    public Bird(int flySpeed) {
        this.flySpeed = flySpeed;
    }

    public void fly() {
        System.out.println("Bird is flying at " + flySpeed + " speed");
    }

    public void eat() {
        System.out.println("The bird looks happy");
    }

    // accessors

    public int getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(int flySpeed) {
        this.flySpeed = flySpeed;
    }
}
