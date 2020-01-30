class StudentTestThis1{
    int rollno;
    String name;
    float fee;
    StudentTestThis1(int rollno,String name,float fee){
        //This not used, open to more than one interpretation; can lead to inexactness.
        //We get default values as output
        rollno=rollno;
        //lets try this to see what happens!
        //this.rollno=rollno;
        name=name;
        fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}
}
class TestThis1{
    public static void main(String args[]){
        StudentTestThis1 s1=new StudentTestThis1(111,"Frank",5000f);
        StudentTestThis1 s2=new StudentTestThis1(112,"Bill",6000f);
        s1.display();
        s2.display();
    }}