public class LineSub extends Point {
    // A line needs two points: begin and end.
    // The begin point is inherited from its superclass Point.
    // Private variables
    Point end;               // Ending point

    // Constructors
    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);             // construct the begin Point
        this.end = new Point(endX, endY);  // construct the end Point
    }
    public LineSub (Point begin, Point end) {  // caller to construct the Points
        super(begin.getX(), begin.getY());      // need to reconstruct the begin Point
        this.end = end;
    }

    // Public methods
    // Inherits methods getX() and getY() from superclass Point

    public Point getBegin(){ return new Point(super.getX(),super.getY());}
    public Point getEnd() { return  end; }
    public void setBegin(int x,int y){ super.setXY(x,y); }
    public void setEnd(int x, int y){ setEnd(x,y); }

    public int getBeginX(){ return super.getX(); }
    public int getBeginY(){ return super.getY(); }
    public int getEndX(){ return end.getX(); }
    public int getEndY(){ return end.getY(); }

    public void setBeginX(int x) {super.setX(x);}
    public void setBeginY(int y) {super.setY(y);}
    public void setBeginXY(int x, int y){super.setXY(x,y);}
    public void setEndX(int x){end.setX(x);}
    public void setEndY(int y){end.setY(y);}
    public void setEndXY(int x, int y){end.setXY(x,y);}

    // Length of the line
    // Math.sqrt(xDiff*xDiff + yDiff*yDiff)
    public int getLength(){
        int xDifference;
        int yDifference;

        //check if bigger
        if(getBeginX() > getEndX()){
            xDifference = getBeginX() - getEndX();
        } else {
            xDifference = getEndX() - getBeginX();
        }

        //check if bigger
        if(getBeginY() > getEndY()){
            yDifference = getBeginY() - getEndY();
        } else {
            yDifference = getEndY() - getBeginY();
        }
        return (int) Math.sqrt((xDifference * xDifference)+(yDifference * yDifference));
    }

    // Gradient in radians
    // Math.atan2(yDiff, xDiff)
    public double getGradient(){
        int xDifference;
        int yDifference;

        //check if bigger
        if(getBeginX() > getEndX()){
            xDifference = getBeginX() - getEndX();
        } else {
            xDifference = getEndX() - getBeginX();
        }

        //check if bigger
        if(getBeginY() > getEndY()){
            yDifference = getBeginY() - getEndY();
        } else {
            yDifference = getEndY() - getBeginY();
        }
        return Math.atan2(yDifference,xDifference);
    }

    //toString method
    public String toString() {
        //return "LineSub(" + super.toString() + " - " + super.toString() + ")";
        return "LineSub[end=" + super.toString() + ", begin= " + end.toString() + "]";
    }
}