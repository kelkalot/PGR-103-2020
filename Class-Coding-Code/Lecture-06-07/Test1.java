class ATest1{

    //getA returns this
    ATest1 getA(){
        return this;
    }

    void msg(){
        System.out.println("Hello java");}
}

class Test1{
    public static void main(String args[]){
        //Class ATest1 constructor returnes the current class object. On this class object the msg method is invoked.
        new ATest1().getA().msg();
    }
}  