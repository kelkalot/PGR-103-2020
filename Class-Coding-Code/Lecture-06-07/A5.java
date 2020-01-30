class A5{
//both printed reference objects are the same. Therefore we now they reference to the same object!
    void m(){
        System.out.println(this);//prints same reference java object ID
    }

    public static void main(String args[]){
        A5 obj=new A5();
        System.out.println(obj);//prints the reference java object ID
        obj.m();
    }
} 