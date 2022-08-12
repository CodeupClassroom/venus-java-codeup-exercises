package java_two.poly_exercise;

public class Square extends Rectangle {

    // dont want to use this one
    // because I should only need 1 arg for a square
    public Square(int length, int width) {
        super(length, width);
    }

    public Square(int side) {
        super(side, side);
    }

    @Override
    public int getArea() {
        System.out.println("square getArea");
        return length * length;
    }

    @Override
    public int getPerimeter() {
        System.out.println("square getPerimeter");
        return 4 * length;
    }

    public void setSide(int side) {
        this.length = side;
        this.width = side;
    }
}
