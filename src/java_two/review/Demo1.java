package java_two.review;

public class Demo1 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int anInt : array) {
            sum += anInt;
        }

        // js equivalent
//        array.forEach(function(anInt) {
//            sum += anInt;
//        });
    }

    public static int square(int x) {
        return x * x;
    }
}
