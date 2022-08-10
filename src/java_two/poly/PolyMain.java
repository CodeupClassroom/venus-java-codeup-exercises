package java_two.poly;

public class PolyMain {
    public static void main(String[] args) {

        Bird parrot = new Bird(2);
        parrot.fly();

        Duck duck1 = new Duck(1, 3);
        duck1.fly();
        duck1.eat();
        duck1.swim();
        duck1.quack();

        RubberDuck codey = new RubberDuck();
        codey.quack();
        codey.eat();

        Bird [] birds = new Bird[3];
        birds[0] = parrot;
        birds[1] = duck1;
        birds[2] = codey;
        for (Bird bird : birds) {
            bird.fly();
//            bird.quack();
        }

        Bird weirdBird = new RubberDuck();
//        weirdBird.qu
    }
}
