//The Plumber class extends the Worker class which enables it to use the public attributes of the Worker class
public class Plumber extends Worker{

//Instance variables
private double plumbingMaterials = 0;

//Constructor
public Plumber(String firstName, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate){
        super(firstName, lastName, address, idNumber, hoursWorked, hourlyRate); //#B
        }

//methods
public void setPlumbingCosts(double amount){
    plumbingMaterials = amount;
         }

@Override
public String doWork(){
    return "Install plumbing"; //doWork method overridden from worker
         }

@Override
public String toString() {
    return "Plumber: "+super.toString() + "\n" + doWork(); //to String overidden from worker
        }

public double calculatePay(){
    return hoursWorked * hourlyRate + plumbingMaterials;
        }
}
