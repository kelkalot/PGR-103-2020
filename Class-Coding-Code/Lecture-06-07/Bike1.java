//Java Program to create and call a default constructor  
class Bike1{

    //creating a default constructor
    //Function with class name
    //calls print function when object is created!
    Bike1(){
        System.out.println("Bike is created");
    }

    //main method
    public static void main(String args[]){
        //calling a default constructor
        Bike1 b=new Bike1();
        Bike1 b2=new Bike1();
    }
}  