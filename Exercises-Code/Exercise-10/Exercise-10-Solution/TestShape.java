//test class for the shape example, adjusted to the new shape version as abstract class
public class TestShape {

    //test the shape class and its child classes

    public static void main(String[] args) {

        //create a simple shape object for testing

        //HERE it changed because of abstract class
        //Shape s1 = new Shape(); //Not possible anymore since abstract class!!!
        Shape s1 = new Rectangle(); //Can only be created using child object!!!
        System.out.println(s1.toString());

        //change color and filled of the shape object
        s1.setColor("blue");
        s1.setFilled(false);

        //test the toString method of the shaope object
        System.out.println(s1.toString());
        System.out.println(); //just adding some space

        //Test the circle child class
        //test the different constructors
        Circle c1 = new Circle(2.2);
        Circle c2 = new Circle(2.3,"yellow",true);
        Circle c3 = new Circle();

        //print the three created circles
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        //test the getArea and getPerimeter methods
        System.out.println("Radius is: "+c2.getRadius()+" Area is: "+c2.getArea()+" Perimeter is: "+c2.getPerimeter());
        System.out.println(); //just adding some space


        //Test the rectangle child class of shape
        //test the three constructors
        Rectangle r1 = new Rectangle(2.2,2.2);
        Rectangle r2 = new Rectangle(2.3,2.3,"yellow",false);
        Rectangle r3 = new Rectangle();

        //print the three rectangle objects created
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());

        //the the getArea and getPerimeter methods
        System.out.println("Area is: "+r2.getArea()+" Perimeter is: "+r2.getPerimeter());
        System.out.println(); //just adding some space


        //Test the square child class of rectangle
        //Test the three constructors
        Square sq1 = new Square(5.0);
        Square sq2 = new Square(10.0,"yellow",false);
        Square sq3 = new Square();

        //Print the three squares created
        System.out.println(sq1.toString());
        System.out.println(sq2.toString());
        System.out.println(sq3.toString());

        //test the getArea and getPerimeter methods. They do not need to be overwritten because
        //the same formula is valid for rectangle and square so the square class can reuse the rectangle methods for that
        System.out.println("Area is: "+sq2.getArea()+" Perimeter is: "+sq2.getPerimeter());




    }
}
