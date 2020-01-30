class AA{
    void m(){System.out.println("hello m");}

    void n(){
        System.out.println("hello n");

        //m();//will output the same as this.m()
        this.m();
    }
}
class TestThis4{
    public static void main(String args[]){
        AA a=new AA();
        a.n();
    }}