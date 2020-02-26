public class Person {

    //instance variables
    private String name;
    private String address;



    //constructor
    Person(){
    }

    Person(String name, String address){
        this.name=name;
        this.address=address;
    }

    //getter and setter methods
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String toString(){
        return "Person[name="+name+",address="+address+"]";
    }

}
