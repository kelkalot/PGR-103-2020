//Example of an abstract class that has abstract and non-abstract methods
//Out abstract class
abstract class JapanBike{
    //Constructor
    JapanBike(){
        System.out.println("bike is created");
    }

    //Abstract method run
    abstract void run();

    //Non abstract method changeGear
    void changeGear(){
        System.out.println("gear changed");
    }
}

//Creating a child class which inherits abstract class
class Kawasaki extends JapanBike{
    //Implement the run method which was abstract in the super class
    void run(){
        System.out.println("running safely..");
    }
}

//Creating a Test class which calls abstract and non-abstract methods
class TestAbstraction2{
    public static void main(String args[]){
        JapanBike myBike = new Kawasaki();
        //Abstract method called
        myBike.run();
        //Non abstract metho called
        myBike.changeGear();
    }
}
