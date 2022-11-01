package java_two.annotations;

public class Main {

    @SuppressWarnings("all")
    public static void main(String[] args) {
        AnnotationDemo a = new AnnotationDemo();
        System.out.println(a.foo());
    }
}
