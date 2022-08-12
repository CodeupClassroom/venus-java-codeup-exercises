package java_two.poly_exercise;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Square box2 = new Square(5);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

        Rectangle [] rects = new Rectangle[2];
        rects[0] = box1;
        rects[1] = box2;
        // if we want to change the side of the square
        // , we have to do it using Rectangle functions
//        box2.setLength(6);
//        box2.setWidth(6);

        // OR we can temporarily CAST box2 to a Square
//        ((Square) box2).setSide(6);
        Square aSquare = (Square) box2;
        aSquare.setSide(6);
        System.out.println(aSquare.getPerimeter());
        System.out.println(aSquare.getArea());

        Object o = new Square(10);
        System.out.println(o.toString());
    }
}
