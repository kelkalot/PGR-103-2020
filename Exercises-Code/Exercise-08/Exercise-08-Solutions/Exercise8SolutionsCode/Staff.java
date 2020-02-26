
public class Staff extends Person {

    //instance variables
    private String school;
    private double pay;


    //constructor

    Staff(String name, String address, String school, double pay){
        super(name,address);
        this.school=school;
        this.pay=pay;
    }

//getter and setter methods
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }


    //to string method
    public String toString(){
        return "Staff["+super.toString()+",school="+this.school+",pay="+this.pay+"]";
    }


}
