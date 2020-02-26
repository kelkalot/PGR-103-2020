package com.pgr103.composition;

public class Person {

    //composition has-a relationship
    //A job does not exist if there is not a person fulfilling it
    private Job job;

    public Person(){
        this.job=new Job();
        job.setSalary(1000L);
    }
    public long getSalary() {
        return job.getSalary();
    }

}