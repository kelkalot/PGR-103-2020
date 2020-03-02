import java.util.ArrayList;

public class ArrayListTest {



    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        //Can be any datatype or object
        ArrayList<ArrayListTest> myUselessList = new ArrayList<ArrayListTest>();

        //to add elements we can use add
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        //to remove element we can use .remove
        cars.remove(0); //removes BMW

        //we can iterate trough array list in two different ways

        //for each method
        for(String car:cars){

            System.out.println(car);

        }

        System.out.println();
        
        //or standard for


        for(int i = 0; i<cars.size();i++){


            System.out.println(cars.get(i));

        }



    }



}
