
//Abstract bank class
abstract class Bank{
    abstract int getRateOfInterest();
}

//Extensions of bank implementing the getRateofInterest method
class Sbanken extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}

class DNB extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}

//Test class
class TestBank{
    public static void main(String args[]){
        Bank b;
        b=new Sbanken();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
        b=new DNB();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
    }
}
