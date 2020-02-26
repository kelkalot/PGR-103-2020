package com.pgr103.com.pgr103.aggregation.example2;

public class Employee {
    int id;
    String name;
    Address address;

    public Employee(int id, String name,Address address) {
        this.id = id;
        this.name = name;
        this.address=address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        Address address1=new Address("oslo","ostfold","norway");
        Address address2=new Address("bergen","vestlande","norway");

        Employee e=new Employee(111,"olav",address1);
        Employee e2=new Employee(112,"arun",address2);

        e.display();
        e2.display();

    }
}