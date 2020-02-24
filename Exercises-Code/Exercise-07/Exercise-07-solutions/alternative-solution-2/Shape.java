public class Shape {
    private String color = "red";
    private boolean filled = true;

    Shape(){}

    Shape(String color, boolean filled){
        this();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        String filledOrNot = "";
        if(isFilled()){
            filledOrNot += "filled";
        } else {
            filledOrNot += "not filled";
        }
        return "A Shape with color of "+ color + " and " + filledOrNot;
    }
}
