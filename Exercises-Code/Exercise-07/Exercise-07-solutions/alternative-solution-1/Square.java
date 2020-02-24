class Square extends Rectangle
{
    Square()
    {
        super();
    }
    
    Square(double side)
    {
        super(side, side);
    }
    
    Square(double side, String setColor, boolean setFilled)
    {
        super(side, side, setColor, setFilled);
    }
    
    double getSide()
    {
        return super.getLength();
    }
    
    void setSide(double side)
    {
        super.setWidth(side);
        super.setLength(side);
    }
    
    @Override
    void setWidth(double newWidth)
    {
        setSide(newWidth);
    }
    
    @Override
    void setLength(double newLength)
    {
        setSide(newLength);
    }
    
    @Override
    public String toString()
    {
        return "A Square with side=" + this.getSide() + " which is a subclass of " + super.toString();
    }
}
