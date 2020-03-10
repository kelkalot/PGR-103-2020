//Example of abstract class

//The abstract shape class
abstract class Shape{
    abstract void draw();
}

//The implementation is provided by others i.e. unknown by end user
//Rectangle extends shape to a rectangle object implementing the draw method
class Rectangle extends Shape{
    void draw(){
        System.out.println("drawing rectangle");
    }
}
//Circle extends shape to a circle object implementing the draw method
class Circle1 extends Shape{
    void draw(){
        System.out.println("drawing circle");
    }
}

//In a real programm usually the method is called by programmer or user
class TestAbstraction1{
    public static void main(String args[]){
        Shape s=new Circle1();//In a real scenario, an object is usually provided through a method, e.g., getShape() method
        s.draw();
        Shape s2 = new Rectangle();
        s2.draw();
    }
}
