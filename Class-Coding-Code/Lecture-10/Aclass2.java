
//Two interfaces are declared
interface Printable{
    void print();
}
interface Showable{
    void show();
}

//Multiple inheritance due to the fact that the class implements two interfaces
class Aclass2 implements Printable,Showable{
    public void print(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("World");
    }

//Main
    public static void main(String args[]){
        Aclass2 obj = new Aclass2();
        obj.print();
        obj.show();
    }
} 