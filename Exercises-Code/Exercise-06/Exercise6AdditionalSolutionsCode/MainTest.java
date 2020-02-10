public class MainTest {


    public static void main(String[] args){

    Circle myCircle  = new Circle();
    Circle myCircle2 = new Circle();

    myCircle.setColor("green");
    myCircle.setRadius(5.0);

    myCircle2.setRadius(3.0);
    myCircle2.setColor("blue");

    if(myCircle.getRadius()>myCircle2.getRadius()){
        System.out.print("One is bigger than two"+"\n");
    }

    System.out.println("Area of the circle is: "+myCircle.getArea() );

    myCircle.printCircle();
    myCircle2.printCircle();

    Circle myCircle3 = new Circle(2.5);
    Circle myCircle4 = new Circle(2.5,"green");





   }


}
