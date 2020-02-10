/*
 * The Circle class models a circle with a radius and color.
 */
public class Circle3 {
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;
    private static int shapesCounter;

    // The default constructor with no argument.
    // It sets the radius and color to their default value.
    public Circle3() {
        radius = 1.0;
        color = "red";
        shapesCounter++;
    }

    // 2nd constructor with given radius, but color default
    public Circle3(double radius) {
        //this indicates its the objects radius not the methods one!
        this.radius = radius;
        color = "red";
        shapesCounter++;
    }


    // 3rd constructor with given radius and color
    public Circle3(double radius, String color) {
        this.radius = radius;
        this.color = color;
        shapesCounter++;
    }

    // A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }

    // A public method for computing the difference of the areas between two circle objects
    public double compareArea(Circle3 circle) {
        double difference = this.getArea() - circle.getArea();
        return difference;
    }

    // A public method for computing the area of circle
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public String getColor() {
        return color;
    }

    // Setter for instance variable radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Setter for instance variable color
    public void setColor(String color) {
        this.color = color;
    }

    // Return a description of this instance in the form of
    // Circle[radius=r,color=c]
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

    static void shapesCreated(){
        System.out.println(shapesCounter);
    }


}