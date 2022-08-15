package java_two.interface_exercise.shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(4, 5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        myShape = new Square(6);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        ((Quadrilateral) myShape).getLength();
    }
}
