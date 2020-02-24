class Rectangle extends Shape
{
    private double width;
    private double length;
    
    Rectangle()
    {
        this.width = 1.0;
        this.length = 1.0;
    }
    
    Rectangle(double setWidth, double setLength)
    {
        this.width = setWidth;
        this.length = setLength;
    }
    
    Rectangle(double setWidth, double setLength, String setColor, boolean setFilled)
    {
        super(setColor, setFilled);
        this.width = setWidth;
        this.length = setLength;
    }
    
    double getWidth()
    {
        return this.width;
    }
    
    void setWidth(double newWidth)
    {
        this.width = newWidth;
    }
    
    double getLength()
    {
        return this.length;
    }
    
    void setLength(double newLength)
    {
        this.length = newLength;
    }
    
    double getArea()
    {
        return this.length * this.width;
    }
    
    double getPerimeter()
    {
        return (this.length * 2) + (this.width * 2);
    }
    
    @Override
    public String toString()
    {
        return "A Rectangle with width=" + this.width + " and length=" + this.length
                                         + ", which is a subclass of " + super.toString();
    }
}
