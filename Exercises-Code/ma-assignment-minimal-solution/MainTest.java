import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;


public class MainTest {


    public static void main(String[] args) {

        //create some addresses
        Address client1 = new Address("Olavs gate 2", "Oslo", "Ostlande",
                "19001");
        Address client2 = new Address("Prisnen gate 4", "Oslo", "Ostlande",
                "42111");

        //create some start and end dates
        LocalDate start1 = LocalDate.parse("2019-11-04");
        LocalDate end1 = LocalDate.parse("2020-06-29");

        //create the first project
        Project p1 = new Project("School", "Erna Solberg", client1,
                start1, end1);

        //create some start and end dates for a second project
        LocalDate start2 = LocalDate.parse("2019-07-26");
        LocalDate end2 = LocalDate.parse("2019-09-28");


        //create a second prohect
        Project p2 = new Project("Nytt Lys", "Droningen Mor",
                client2, start2, end2);

        //create addresses for the workers
        Address eAddress = new Address("Slott 1", "Oslo",
                "Ostlande", "0196");
        Address cAddress = new Address("Bryggen", "Bergen",
                "Vestlande", "0932");
        Address pAddress = new Address("Ovre Slottsgate 2", "34 top", "Oslo",
                "Ostlande", "0196");

        //We declare them as worker class but downcast them later!
        Worker e = new Electrician("Simon", "Garfunkel", eAddress, 666, 15, 20);
        Worker c = new Carpenter("John", "Travolta", cAddress, 5565, 17.40, 30);
        Worker p = new Plumber("Freddy", "Fredson", pAddress, 1243, 25, 20);

        //put the workers in an array
        ArrayList<Worker> workers = new ArrayList<>(); //List of workers

        //Polymorphism to call the child methods but declared as parent
        ((Carpenter)c).setLumberCosts(2000); //Set the lumber costs for the carpenter, notice that it the worker object must be cast as a Carpenter to access this method
        ((Electrician)e).setWiringCosts(3200);
        ((Plumber)p).setPlumbingCosts(2750);

        //Add all three workers to the list
        workers.add(c);
        workers.add(e);
        workers.add(p);

        p1.addWorkers(workers); //house requires all three workers //#H
        p1.setOverhead(.18); //the overhead is higher for a house

        System.out.printf(p1.toString(), p1.getName(),
                 p1.getTotalCost(), p1.getOverhead());
        System.out.println("***************************************************"
                + "\n***************************************************\n");

        //EXTENDED EXAMPLE Not needed for MA
        //p1.printPayroll();


        workers.remove(p); //project 2 does not need a plumber
        workers.remove(c); //project 2 does not need a carpenter

        ((Electrician)e).setWiringCosts(300); //Set the wiring costs for the electrician, notice that it the worker object must be cast as a Electrician to access this method
        workers.get(0).setHoursWorked(20); //set the hours worked to 20, Update the hours worked for the electrician, which is the only worker left in the ArrayList, so it is at position zero
        p2.addWorkers(workers);

        System.out.printf(p2.toString(), p2.getName(), p2.getTotalCost(), p2.getOverhead());

        if (p2.compareTo(p1) < 0) {
            System.out.println("\nThe "+p2.getName()+" project is " + "scheduled before "+p1.getName());
            }
        else {
            System.out.println("\nThe "+p1.getName()+" project is "
                    + "scheduled prior to "+p2.getName()); }

        System.out.println("\n");

        //EXTENDED EXAMPLE Not needed for MA
        //p2.printPayroll();
    }

}
