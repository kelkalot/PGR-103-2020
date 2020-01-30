//Java program to initialize the values from one object to another
class Student4{

    int id;
    String name;

    //constructor to initialize integer and string
    Student4(int i,String n){
        id = i;
        name = n;
    }

    //constructor to initialize another object
    Student4(Student4 studentTocopy){
        id = studentTocopy.id;
        name =studentTocopy.name;
    }

    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String args[]){
        Student4 s1 = new Student4(111,"Ola");
        Student4 s2 = new Student4(s1); //s1 is handed over for copying
        //Both objects contain the same value at the end
        s1.display();
        s2.display();
    }
}
