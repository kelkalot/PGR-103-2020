public class MovablePoint implements Movable{

    // instance variables
    int x, y, xSpeed, ySpeed;     // package access, no modifier such as private or protected

    // Constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }



    @Override
    public void moveUp() {
        y += ySpeed; //move up along y axis
    }

    @Override
    public void moveDown() {
        y -= ySpeed; // move down along y axis
    }

    @Override
    public void moveLeft() {
        x -= xSpeed; //move left along x axis
    }

    @Override
    public void moveRight() {
        x += xSpeed; //move down along x axis
    }

    public String toString(){
        return "x is " + this.x + ", y is " + this.y;
    }

}
