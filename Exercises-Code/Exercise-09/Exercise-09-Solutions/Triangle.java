/*
 * The Triangle class, subclass of Shape
 */
public class Triangle extends Shape {
    // Private member variables
    private int base;
    private int height;

    // Constructor
    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
    }

    // Override the inherited getArea() to provide the proper implementation
    @Override
    public double getArea() {
        return 0.5*base*height;
    }
}