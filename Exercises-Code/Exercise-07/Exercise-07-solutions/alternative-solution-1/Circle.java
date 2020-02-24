class Circle extends Shape
{
    private double radius;
    
    Circle()
    {
        this.radius = 1.0;
    }
    
    Circle(double setRadius)
    {
        this.radius = setRadius;
    }
    
    Circle(double setRadius, String setColor, boolean setFilled)
    {
        super(setColor, setFilled);
        this.radius = setRadius;
    }
    
    double getRadius()
    {
        return this.radius;
    }
    
    void setRadius(double newRadius)
    {
        this.radius = newRadius;
    }
    
    double getArea()
    {
        return Math.PI * (this.radius * this.radius);
    }
    
    double getPerimenter()
    {
        return 2 * Math.PI * this.radius;
    }
    
    @Override
    public String toString()
    {
        return "A Rectangle with radius=" + this.radius + ", which is a subclass of " + super.toString();
    }
}
