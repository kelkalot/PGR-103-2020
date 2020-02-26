//The Carpenter class extends the Worker class which enables it to use the public attributes

public class Carpenter extends Worker {

private double lumberCosts;

//Constructor
public Carpenter(String firstname, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate){
        super(firstname, lastName, address, idNumber, hoursWorked, hourlyRate);
}

//methods
public void setLumberCosts(double amount){
    lumberCosts = amount;
}

public String doWork(){ //#C
    return "Complete carpentry work";
}

//overridden tostring
@Override
public String toString() {
    return "Carpenter: "+super.toString() + "\n" + doWork();
    }

public double calculatePay(){
    return hoursWorked * hourlyRate + lumberCosts;
        }




}
