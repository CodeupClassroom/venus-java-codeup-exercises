package java_two.exceptions_exercise;

public class ExceptionsMain {

    public static void main(String[] args) {
        Input input = new Input();

//        int myInt = input.getInt();
//        int myInt = input.getInt(10, 30, "Enter an int between 10 and 30: ");
        double myDouble = input.getDouble(10, 30);
        System.out.println(myDouble);
    }
}
