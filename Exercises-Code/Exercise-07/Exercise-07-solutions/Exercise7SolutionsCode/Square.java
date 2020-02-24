//Square class which is a child of Rectangle
public class Square extends Rectangle {

    //default constructor, invokes the parent default
    public Square(){
        super();
    }

    //constructor with side
    public Square(double side) {
        super(side, side);  // Call superclass Rectangle(double, double)
    }

    //constructor with side, color and filled
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);  // Call superclass Rectangle(double, double, String, boolean)
    }

    // A public method for retrieving the side
    public double getSide(){
        return super.getLength();
    }

    //Set side which is basically setting length and width of the parent to the same size
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    //Overridden method for setWidth in case of square, length and width always need to be same size for square
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    //Overridden method for setLength in case of square, length and width always need to be same size for square
    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    //to string method for teh square method as done previously
    public String toString(){
        //with super we call the parent method
        //the partent method also calls the parent with super and so on until we reach shape. Therefore we get a long string of
        //all super string methods
        return "A Square with side = " + this.getSide() +", which is a subclass of " + super.toString();
    }

}
