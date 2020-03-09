/*
 * The superclass Monster defines the expected common behaviors for its subclasses.
 */
public class Monster {
    // private instance variable
    private String name;

    // Constructor
    public Monster(String name) {
        this.name = name;
    }

    // Define common behavior for all its subclasses
    public String attack() {
        return "!^_&^$@+%$* I don't know how to attack!";
        // We have a problem here!
        // We need to return a String; else, compilation error!
    }
}