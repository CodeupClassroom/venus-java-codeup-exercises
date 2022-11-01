package java_two.annotations;

public class AnnotationDemo {
    @Deprecated
    public int age;


    @Deprecated
    public String foo() {
        return "bar";
    }

//    @Override
    public String toString() {
        return "AnnotationDemo{}";
    }

    public static void main(String[] args) {
        AnnotationDemo a = new AnnotationDemo();
//        a.age = 42;

        System.out.println(a.foo());
    }
}
