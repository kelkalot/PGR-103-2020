
/*
Programmer object can access the field of own
class as well as of Employee class i.e. code reusability.
*/

//Employee super class
class Employee{
    float salary=40000;
}

//programmer subclass, extends employee
//inherits salary field adds bonus field
class Programmer extends Employee{
    int bonus=10000;
    public static void main(String args[]){
        Programmer p=new Programmer();
        System.out.println("Programmer salary is:"+p.salary);
        System.out.println("Bonus of Programmer is:"+p.bonus);
    }
}
