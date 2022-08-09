package java_two.shapes;


//import docrob.util.Input;
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
            if(!input.yesNo("Do you want to keep making circles? yes/no ")) {
                break;
            }
        }

    }
}
