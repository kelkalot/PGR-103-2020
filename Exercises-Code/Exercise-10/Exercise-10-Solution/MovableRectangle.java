public class MovableRectangle implements Movable{


    // instance variables
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    // Constructor
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {

        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }


    @Override
    public void moveUp() {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }

    public String toString(){
        return "top x is " + topLeft.x + ", top y is " + topLeft.y + ", bottom x is " + bottomRight.x + ", bottom y is " + bottomRight.y ;
    }

}
