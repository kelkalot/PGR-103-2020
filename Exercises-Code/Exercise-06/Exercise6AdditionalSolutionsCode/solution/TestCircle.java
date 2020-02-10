public class TestCircle {
    public static void main(String[] args) {
        // Declare an instance of Circle class called c1.
        // Construct the instance c1 by invoking the "default" constructor
        // which sets its radius and color to their default value.
        Circle c1 = new Circle();
        // Invoke public methods on instance c1, via dot operator.
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());

        // Declare an instance of class circle called c2.
        // Construct the instance c2 by invoking the second constructor
        // with the given radius and default color.
        Circle c2 = new Circle(2.0);
        // Invoke public methods on instance c2, via dot operator.
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());


        //Test the modified and extended circle class (Circle2)
        Circle2 c4 = new Circle2();   // construct an instance of Circle
        c4.setRadius(5.0);          // change radius
        System.out.println("radius is: " + c4.getRadius()); // Print radius via getter
        c4.setColor("blue");        // Change color
        System.out.println("color is: " + c4.getColor());   // Print color via getter

        // You cannot do the following because setRadius() returns void,
        // which cannot be printed.
       // System.out.println(c4.setRadius(4.0));

        //Test the string method
        Circle3 c5 = new Circle3(5.0);
        System.out.println(c5.toString());   // explicit call

        Circle3 c6 = new Circle3(1.2);
        System.out.println(c6.toString());  // explicit call
        System.out.println(c6);             // println() calls toString() implicitly, same as above
        System.out.println("Operator '+' invokes toString() too: " + c6);  // '+' invokes toString() too

        //Same with a circle object that does not have toString implemented
        System.out.println(c2.toString());  // explicit call
        System.out.println(c2);             // println() calls toString() implicitly, same as above
        System.out.println("Operator '+' invokes toString() too: " + c2);  // '+' invokes toString() too

        //Compare with method test
        System.out.println(c5.compareArea(c6));
        System.out.println(c6.compareArea(c5));

        //how many shapes are created?
        Circle3.shapesCreated();


    }
}