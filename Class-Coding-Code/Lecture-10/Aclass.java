
//Interface declaration
interface printable{
    void print();
}

//The class Aclass implements the interface
class Aclass implements printable{
    //Print method coming from the interface and implemented in the class
    public void print(){
        System.out.println("Hello");
    }
//main
    public static void main(String args[]){
        Aclass obj = new Aclass();
        obj.print();
    }
}
