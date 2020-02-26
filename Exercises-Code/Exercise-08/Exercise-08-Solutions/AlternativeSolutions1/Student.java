public class Student extends Person {

   //instance variables
    private String program;
    private int year;
    private double fee;

    //constructor
    Student(String name, String address, String program, int year, double fee){
        //chain to parent constructor
        super(name,address);
        this.program=program;
        this.year=year;
        this.fee=fee;
    }

    //getter and setter methods
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    //to String method
    public String toString(){
        return "Student["+super.toString()+",program="+this.program+",year="+this.year+",fee="+this.fee+"]";
    }
}
