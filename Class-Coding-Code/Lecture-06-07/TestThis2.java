class StudentTestThis2{
    int rollno;
    String name;
    float fee;
    StudentTestThis2(int rollno,String name,float fee){
        //This is used
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}
}

class TestThis2{
    public static void main(String args[]){
        StudentTestThis2 s1=new StudentTestThis2(111,"Karl",5000f);
        StudentTestThis2 s2=new StudentTestThis2(112,"Karli",6000f);
        s1.display();
        s2.display();
    }}  