public class Address {

private String street1, street2, city, state;
private String zip;

//The Address class has an overloaded constructor for any address objects with a second

//constroctor 1
public Address(String street1, String city, String state, String zip){
        this.street1 = street1;
        this.city = city;
        this.state = state;
        this.zip = zip;
         }


//Constructor 2
public Address(String street1, String street2, String city, String state, //#A
String zip) {
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zip = zip;
         }

//to string method
@Override
public String toString(){ //#B
         if(street2 == null) return street1 + "\n" +
                 city + ", " + state + " "+zip;
         else return street1 + "\n" + street2 + "\n" +
                 city + ", " + state + " "+zip;
         }
}
