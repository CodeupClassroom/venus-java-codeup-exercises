package java_two.shapes;


//import java_two.oo_exercise.util.Input;

import docrob.util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        while(true) {
            double radius = input.getDouble("Enter a radius: ");
            Circle circle = new Circle(radius);
            System.out.println(circle.getArea());
            System.out.println(circle.getCircumference());

            // ask user if they want to keep making circles
            boolean keepMakingCircles = input.yesNo("Do you want to keep making circles? yes/no ");
            if(keepMakingCircles == false) {
                break;
            }
        }

    }
}
