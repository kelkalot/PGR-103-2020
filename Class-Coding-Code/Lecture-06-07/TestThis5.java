class AAA{

    //default constructor
    AAA(){System.out.println("hello a");}

    //parameterized constructor
    AAA(int x){
        //calls the default constructor
        this();
        System.out.println(x);
    }
}
class TestThis5{
    public static void main(String args[]){

        AAA a=new AAA(10);
    }}