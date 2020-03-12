/*
 * The Circle class a child class of shape
 */
public class Circle extends Shape{ //inherits from shape
    // private instance variable, not accessible from outside this class
    private double radius;

    // The default constructor with no argument.
    //Calls the constructor from the super class for color and filled (constructor chaining)
    // It sets the radius directly to the default value.
    public Circle() {
        super();
        radius = 1.0;
    }

    // 2nd constructor with given radius, but color and filled default
    public Circle(double radius) {
        super();
        //this indicates its the objects radius not the methods one!
        this.radius = radius;
    }


    // 3rd constructor with given radius, color and filled
    public Circle(double radius, String color, boolean filled) {
        super(color,filled); //super parameterized constructor is called to set the color and filled
        this.radius = radius;
    }

    // A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }


    // A public method for computing the area of circle. overridden from the abstract class
    public double getArea() {

        return (radius*radius)*Math.PI;
    }

    // A public method for computing the perimeter of circle. overridden from the abstract class
    public double getPerimeter() {

        return 2*Math.PI*radius;
    }

    // Setter for instance variable radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Return a description of this instance in the form
    //A Circle with radius=xxx, which is a subclass of yyy"
    public String toString() {

        return "A Circle with radius = "+ radius + ", which is a subclass of " + super.toString();
    }

}