interface Printable1{
    void print();
}

interface Showable1{
    void print();
}

class TestInterface3 implements Printable1, Showable1{

    //We basically merge the two prints into one implementation
    public void print(){
        System.out.println("Hello");
    }


    public static void main(String args[]){
        TestInterface3 obj = new TestInterface3();
        obj.print();
    }
}
