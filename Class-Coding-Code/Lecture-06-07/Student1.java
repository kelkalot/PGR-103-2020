//Let us see another example of default constructor  
//which displays the default values  
class Student1{
    int id;
    String name;
    //method to display the value of id and name
    void display(){System.out.println(id+" "+name);}

    //main method
    public static void main(String args[]){
//creating objects  
        Student1 s1=new Student1();
        Student1 s2=new Student1();
//displaying values of the object  
        s1.display();
        s2.display();
    }
} 