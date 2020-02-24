public class Main {
    public static void main(String[] args) {
        //Assignment 1: Aggregation and Composition
        printAuthFromBook();
        printAuthWithBook();

        //Assignment 2: Inheritance
        testShapes();
    }

    //Assignment 1.1:
    static void printAuthFromBook(){
        Author a1 = new Author("Krister","Krister@eh.no",'m');
        Book b1 = new Book("Book of Nothing", a1,77.7,7);
        System.out.println(b1.getAuthor().getName());
        System.out.println(b1.getAuthor().getEmail());
    }

    //Assignment 1.2:
    static void printAuthWithBook(){
        Author a1 = new Author("Krister","Krister@eh.no",'m');
        Book b1 = new Book("Book of Nothing", a1,77.7,7);
        System.out.println(b1.getAuthorName());
        System.out.println(b1.getAuthorEmail());
        System.out.println(b1.getAuthorGender());
    }

    //Assignment 1.3 Multibook is in the multibook class


    // =========================================================
    // Assignment 2 Inheritance
    static void testShapes(){
        Shape c1 = new Circle(7,"Gray",true);
        Shape r1 = new Rectangle(5,8,"Black",false);
        Shape s1 = new Square(9,"White",true);

        //Test Circle
        System.out.println(((Circle) c1).getArea());
        System.out.println(((Circle) c1).getPerimeter());
        System.out.println(c1.toString());

        System.out.println(((Circle) c1).getRadius());
        ((Circle) c1).setRadius(5.6);
        System.out.println(((Circle) c1).getRadius());

        //Test Rectangle
        System.out.println(((Rectangle) r1).getPerimiter());
        System.out.println(((Rectangle) r1).getArea());
        System.out.println(r1.toString());

        System.out.println(((Rectangle) r1).getLength());
        System.out.println(((Rectangle) r1).getWidth());
        ((Rectangle) r1).setLength(9.0);
        ((Rectangle) r1).setWidth(3.0);
        System.out.println(((Rectangle) r1).getLength());
        System.out.println(((Rectangle) r1).getWidth());

        //Test Square
        System.out.println(((Square) s1).getArea());
        System.out.println(((Square) s1).getPerimiter());
        System.out.println(s1.toString());

        System.out.println(((Square) s1).getSide());
        ((Square) s1).setLength(7.0);
        System.out.println(((Square) s1).getSide());
    }

}

