class ATestThis6{
    //Default constructor
    ATestThis6(){
        //calls the parameterized constructor
        this(5);
        System.out.println("hello a");
    }
    //Parameterized constructor
    ATestThis6(int x){

        System.out.println(x);
    }
}
//Test mehtod
class TestThis6{
    public static void main(String args[]){
        ATestThis6 a=new ATestThis6();
    }}