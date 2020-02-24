//The main shape class
public class Shape {

    // two variables of the class
    private String color;     //color of the shape
    private boolean filled;   // if the shape is filled true otherwise false

    //constructors
    //default constructor
    Shape(){
         this.color="red";
         this.filled=true;
    }

    //parameterized constructor 1
    Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    //getColor method returns the color
    public String getColor() {
        return color;
    }

    //set color allows to set the color value
    public void setColor(String color) {
        this.color = color;
    }

    //is filled return true or false if filled or not
    public boolean isFilled() {
        return filled;
    }

    //Set if it is filled or not
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //toString method returns the shape object as a string in the form: A Shape with color of xxx and filled/Not filled
    public String toString(){
        String s;
        if(this.isFilled()==true)
            return "A Shape with color of "+ color +" and filled.";
        else return  "A Shape with color of "+ color +" and not filled.";
    }

}
