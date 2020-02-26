//The Electrician class extends the Worker class which enables it to use the public attributes of the Worker class
public class Electrician extends Worker{ //#A

//Instance variable
private double wiringCost = 0.0;

//Constructor
public Electrician(String firstname, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate){
        super(firstname, lastName, address, idNumber, hoursWorked, hourlyRate);
         }

//Methods
public void setWiringCosts(double amount){
    this.wiringCost = amount;
         }

//Overridden from worker
public String doWork(){
    return "Install electrical components";
        }

        @Override
public String toString() {
    return "Electrician: "+super.toString() + "\n" + doWork();
        }

public double calculatePay(){
    return hoursWorked * hourlyRate + wiringCost; //calculate pay for the electricioan, including wiring cost
        }
}