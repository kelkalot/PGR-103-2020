public class TestShape2 {
    public static void main(String[] args) {
        // Constructing a Shape instance poses problem!
        Shape s3 = new Shape("green");
        System.out.println(s3);
        System.out.println("Area is " + s3.getArea());  // Invalid output
    }
}
