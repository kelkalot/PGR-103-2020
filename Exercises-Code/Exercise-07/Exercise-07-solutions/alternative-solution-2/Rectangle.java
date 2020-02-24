class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    Rectangle(){};

    Rectangle(double width, double length){
        this();
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimiter(){
        return width + width + length + length;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "+ width + " and length = "+ length +", which is a subclass of " + super.toString();
    }
}

class Square extends Rectangle{
    Square(){}

    Square(double side){
        super(side,side);
    }

    Square(double side, String color, boolean filled){
        this(side);
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getSide(){
        return getWidth();
        //Alternatively Return Length
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "A Square with sides = "+ super.getLength() + ", which is a subclass of " + super.toString();
    }
}
