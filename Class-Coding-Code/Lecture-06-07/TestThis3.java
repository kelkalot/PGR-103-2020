class StudentTestThis3{
    int rollno;
    String name;
    float fee;
    StudentTestThis3(int r,String n,float f){
        rollno=r;
        name=n;
        fee=f;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}
}

class TestThis3{
    public static void main(String args[]){
        StudentTestThis3 s1=new StudentTestThis3(111,"Frank",5000f);
        StudentTestThis3 s2=new StudentTestThis3(112,"The Tank",6000f);
        s1.display();
        s2.display();
    }}