public class Circle {

    private double radius;
    private String color;

    Circle(){
        this.radius = 1.0;
        this.color = "red";
    }

    Circle(double radius){
        this.radius=radius;
    }

    Circle(double radius, String color){
         this.radius=radius;
         this.color=color;

        System.out.print("Circle with color and radius created");


    }


    public double getArea(){
        double area = 0.0;
        double pi = 3.14;
        area = pi*this.radius*this.radius;
        return area;
    }

    public void printCircle(){
        System.out.println(this.radius);
        System.out.println(this.color);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setColor(String color) {
        this.color = color;
    }




}
