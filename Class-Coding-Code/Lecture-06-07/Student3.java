//Java program to overload constructors in java  
class Student3{
    int id;
    String name;
    int age;

    //creating two arguments constructor
    Student3(int i,String n){
        id = i;
        name = n;
    }

    //creating three arguments constructor
    Student3(int i,String n,int a){
        id = i;
        name = n;
        age=a;
    }

    //printing method
    void display(){
        System.out.println(id+" "+name+" "+age);
    }

    //main program
    public static void main(String args[]){
        Student3 s1 = new Student3(111,"Ask");
        Student3 s2 = new Student3(222,"Embla",25);
        s1.display();
        s2.display();
    }
} 