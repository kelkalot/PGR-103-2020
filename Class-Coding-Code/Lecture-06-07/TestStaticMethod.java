//Java Program to demonstrate the use of a static method.  
class StudentStaticMethod{

    int rollno;
    String name;
    static String college = "ITS";
    //static method to change the value of static variable
    static void change(){
        college = "BBDIT";
    }
    //constructor to initialize the variable
    StudentStaticMethod(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display values
    void display(){System.out.println(rollno+" "+name+" "+college);}
}

//Test class to create and display the values of object  
public class TestStaticMethod{
    public static void main(String args[]){
        StudentStaticMethod.change();//calling change method

        //creating objects
        StudentStaticMethod s1 = new StudentStaticMethod(111,"Olav");
        StudentStaticMethod s2 = new StudentStaticMethod(222,"Koriander");
        StudentStaticMethod s3 = new StudentStaticMethod(333,"Goku");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
} 