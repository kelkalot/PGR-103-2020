class StudentTestThis7{
    int rollno;
    String name,course;
    float fee;
    StudentTestThis7(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    StudentTestThis7(int rollno,String name,String course,float fee){
        this(rollno,name,course);//reusing constructor
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
}
class TestThis7{
    public static void main(String args[]){
        StudentTestThis7 s1=new StudentTestThis7(111,"Uta","java");
        StudentTestThis7 s2=new StudentTestThis7(112,"Yavus","java",6000f);
        s1.display();
        s2.display();
    }}