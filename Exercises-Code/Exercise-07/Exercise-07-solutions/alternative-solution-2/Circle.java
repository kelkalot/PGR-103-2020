class Circle extends Shape {
    private double radius = 1.0;

    Circle(){}

    Circle(double radius){
        this();
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled){
        this(radius);
        this.setColor(color);
        this.setFilled(filled);

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "+ radius + ", which is a subclass of " + super.toString();
    }
}


