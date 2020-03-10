//Interface declaration
interface Drawable{
    void draw();
}

//Implementation
class Square implements Drawable{
    public void draw(){

        System.out.println("drawing square");}
}

class Circle implements Drawable{
    public void draw(){
        System.out.println("drawing circle");
    }
}

//Using interface
class TestInterface1{
    public static void main(String args[]){
        Drawable d=new Circle();
        d.draw();
    }
}
