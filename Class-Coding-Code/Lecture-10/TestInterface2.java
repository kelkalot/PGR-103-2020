//Bank interface
interface Bank2{
    float rateOfInterest();
}

//implementations
class Sparebank implements Bank2{
    public float rateOfInterest(){
        return 9.15f;
    }
}

class Nordea implements Bank2{
    public float rateOfInterest(){
        return 9.7f;
    }
}

//Main test
class TestInterface2{
    public static void main(String[] args){

        Bank2 myBank1=new Sparebank();
        System.out.println("ROI: "+myBank1.rateOfInterest());

        Bank2 myBank2=new Nordea();
        System.out.println("ROI: "+myBank2.rateOfInterest());
    }
}
