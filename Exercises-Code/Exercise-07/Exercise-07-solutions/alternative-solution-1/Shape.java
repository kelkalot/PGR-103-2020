class Shape
{
    private String color;
    private boolean filled;
    
    Shape()
    {
        this.color = "green";
        this.filled = true;
    }
    
    Shape(String setColor, boolean setFilled)
    {
        this.color = setColor;
        this.filled = setFilled;
    }
    
    String getColor()
    {
        return this.color;
    }
    
    void setColor(String newColor)
    {
        this.color = newColor;
    }
    
    boolean isFilled()
    {
        return this.filled;
    }
    
    void setFilled(boolean newFilled)
    {
        this.filled = newFilled;
    }
    
    @Override
    public String toString()
    {
        return "A Shape with color of " + this.color + " and is " + ((this.filled) ? "filled" : "not filled");
    }
}
