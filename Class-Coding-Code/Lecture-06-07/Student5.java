class Student5{

    //copy object wihtou constructor

    int id;
    String name;

    Student5(int i,String n){
        id = i;
        name = n;
    }

    Student5(){}
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String args[]){
        Student5 s1 = new Student5(111,"Olav");
        Student5 s2 = new Student5();
        //copy by assigning
        s2.id=s1.id;
        s2.name=s1.name;
        //Both have the same value
        s1.display();
        s2.display();
    }
}
