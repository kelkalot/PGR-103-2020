/*
 * The Circle class models a circle with a radius and color.
 */
public class Circle2 {
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // The default constructor with no argument.
    // It sets the radius and color to their default value.
    public Circle2() {
        radius = 1.0;
        color = "red";
    }

    // 2nd constructor with given radius, but color default
    public Circle2(double r) {
        radius = r;
        color = "red";
    }


    // 3rd constructor with given radius and color
    public Circle2(double r, String c) {
        radius = r;
        color = c;
    }

    // A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }

    // A public method for computing the area of circle
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public String getColor() {
        return color;
    }

    // Setter for instance variable radius
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    // Setter for instance variable color
    public void setColor(String newColor) {
        color = newColor;
    }


}