//Worker class

public class Worker {


//instace variables
public String firstName, lastName;
public Address address;
public int idNumber;
public double hoursWorked;
public double hourlyRate;

//constructors
//Default constructor
public Worker(){

}

public Worker(String firstName, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.idNumber = idNumber;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
         }

//Methods
public String doWork(){
 return "Worker do work"; //The doWork() method will be overridden by each of the subclasses of Worker
}

public void setHoursWorked(double hoursWorked) {
    this.hoursWorked = hoursWorked;
         }

public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
         }

public double calculatePay() {
    return hoursWorked * hourlyRate; //the base calculate pay without the additional cost for each profession
         }

         @Override
public String toString() {
    return firstName + " " + lastName + " \nCompensation: $"+calculatePay();
         }

}
