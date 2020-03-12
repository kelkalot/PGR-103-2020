//Rectangle class which is a child of shape
public class Rectangle extends Shape {

    //two new datafields for the class are needed
    private double width; //widht of the rectangle
    private double length; //length of the rectangle

    //default construcotr
    Rectangle(){
        super();
    }

    //constructor with length and width
    Rectangle(double width, double length){
        super(); //calls super class constructor for color and filled
        this.width=width;
        this.length=length;
    }

    //constructor with width, length, color and filled
    Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    // A public method for retrieving the width
    public double getWidth() {
        return width;
    }

    // A public method for setting the width
    public void setWidth(double width) {
        this.width = width;
    }

    // A public method for retrieving the length
    public double getLength() {
        return length;
    }

    // A public method for setting the length
    public void setLength(double length) {
        this.length = length;
    }

    // A public method for computing the area of rectangle. overridden from the abstract class
    public double getArea(){

        return length*width;
    }

    // A public method for computing the perimeter of the rectangle. overridden from the abstract class
    public double getPerimeter(){

        return 2*(length+width);
    }

    // To string method for the rectangle as done in shape and circle
    public String toString(){
        return "A Rectangle with width = "+ width + " and length = "+ length +", which is a subclass of " + super.toString();
    }

}
