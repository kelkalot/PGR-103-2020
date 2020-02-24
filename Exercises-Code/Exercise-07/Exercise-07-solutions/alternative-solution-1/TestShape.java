public class TestShape
{
    public static void main(String[] args)
    {
        // Shape
        
        System.out.println("---Shape---");
        
        Shape s1 = new Shape("red", true);
        System.out.println("s1 color: " + s1.getColor());
        System.out.println("s1 filled: " + s1.isFilled());
        
        s1.setColor("blue");
        s1.setFilled(false);
        
        // Circle
        
        System.out.println("---Circle---");
        
        Circle c1 = new Circle();
        Circle c2 = new Circle(3.0);
        Circle c3 = new Circle(5.0, "yellow", true);
        
        System.out.println("c1: " + c1.getColor() + ", " + c1.getArea());
        System.out.println("c2: " + c2.getPerimenter() + ", " + c2.getRadius());
        
        // Rectangle
        
        System.out.println("---Rectangle---");
        
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2.5, 6.0);
        Rectangle r3 = new Rectangle(3.0, 7.0, "purple", false);
    
        System.out.println("r1: " + r1.getLength() + ", " + r1.getPerimeter());
        System.out.println("r2: " + r2.getColor() + ", " + r2.getArea());
        
        // Square
        
        System.out.println("---Square---");
        
        Square sq1 = new Square();
        Square sq2 = new Square(3.5);
        Square sq3 = new Square(5.5, "orange", true);
        
        System.out.println("sq1: " + sq1.getSide() + ", " + sq1.getArea());
        System.out.println("sq2: " + sq2.getColor() + ", " + sq2.getPerimeter());
        
        // toString()
    
        System.out.println("---toString()---");
        System.out.println(s1.toString());
        System.out.println(c3.toString());
        System.out.println(r3.toString());
        System.out.println(sq3.toString());
    }
}
