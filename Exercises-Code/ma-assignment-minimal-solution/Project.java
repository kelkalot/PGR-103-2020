import java.time.LocalDate;
import java.util.ArrayList;

public class Project implements Comparable {

    //Instance variables

    public ArrayList<Worker> workers = new ArrayList<>();
    private String projectName, customer;
    private Address projectAddress;
    private double overheadPercent = .10;
    private double overheadAmount;
    private LocalDate startDate, endDate;


    //constructor 1
    public Project(String projectName, String customer, Address projectAddress,
                   LocalDate startDate, LocalDate endDate){
        this.projectAddress = projectAddress;
        this.projectName = projectName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customer = customer;
        }


    //Constructor 2
    public Project(String projectName, String costumer, Address projectAddress){
        this.projectAddress = projectAddress;
        this.projectName = projectName;
        this.customer = customer;
        }


    public String getName(){
        return projectName;
    }

    public double getOverhead(){
        return overheadAmount;
    }

    public double getTotalCost(){
        return calculateProjectCost();
    }

    public void setOverhead(double overhead){
        this.overheadPercent = overhead;
         }

    public void addWorkers(ArrayList<Worker> workers){
        this.workers = workers;
        }

    //calculate cost of the project
    public double calculateProjectCost(){
        double totalCost = 0;

        for(Worker w:workers) {
             totalCost += w.calculatePay();
             }
         overheadAmount = overheadPercent * totalCost;
         totalCost += overheadAmount;
         return totalCost;
     }

    @Override
    //Overridden interface method comparte to
    public int compareTo(Object o) { //This is the overridden compareTo method that compares the two start dates
         if(o instanceof Project) { //The if statement can be written in a more condensed version: return ((Project) o).startDate.compareTo(this.startDate);
             if(((Project) o).startDate.isAfter(this.startDate))
                 return -1;
             }
         return 1;
         }

    //to string method
    public String toString(){ //This method overrides the Object toString method to return a String with all the project
        String projectDetails;
         projectDetails = "Project name: %s" + "\nStart Date: " +
                 startDate + "\nCustomer: " +
                 customer + "\nAddress: " +
                 projectAddress.toString() + "\n" +
                 "============================================\n";
         for(Worker w: workers) {
             projectDetails += w.toString() + "\n\n";
         }
         projectDetails += "Project Total: $%.2f\n";
         projectDetails += "Contractor Overhead: $%.2f\n";
         return projectDetails;
         }


    //from extended example not needed for MA
    public void printPayroll(){
        System.out.println("Payroll Report for Project: "+ getName());
        System.out.println("(Salary only)");
        for(Worker w: workers)
             {
             if(w instanceof Plumber) //#B
                 System.out.print("Plumbing costs: ");
             else if (w instanceof Electrician)
                 System.out.print("Electrician: ");
             else if(w instanceof Carpenter)
                 System.out.print("Carpenter: ");
             System.out.println(w.firstName + " " + w.lastName + "\n"+
                     "ID number: "+w.idNumber + "\n"+
                     w.address.toString()+
                     "\nHourly Rate: " + w.hourlyRate +
                     "\nHours worked: " + w.hoursWorked +
                     "\nTotal Compensation: $"+w.hourlyRate * w.hoursWorked +
                     "\n================"+"\n");
             }
    }
 }



