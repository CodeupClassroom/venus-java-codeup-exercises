package java_two.interfaces;

public interface HeavyLifter {
    public static final int MAX_LIFT_AMOUNT = 500_000;

    public abstract void liftHeavyObject(String heavyObject);
    public default void liftLightObject(String lightObject) {
        System.out.println("don't care");
    }
}
