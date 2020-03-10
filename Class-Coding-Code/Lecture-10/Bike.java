
//our abstract class bike
abstract class Bike{
    //contains also and abstract method callced run
    abstract void run();
}

//The honda class extends our abstract class bike
class Honda extends Bike{

    //by extending it we need to provide an implementation for run
    void run(){
        System.out.println("Honda is running safely");
    }

    //Main program
    public static void main(String args[]){
        Bike obj = new Honda();
        obj.run();

    }
}