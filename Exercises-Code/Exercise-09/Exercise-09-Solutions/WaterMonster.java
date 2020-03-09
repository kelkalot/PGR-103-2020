public class WaterMonster extends Monster {
    // Constructor
    public WaterMonster(String name) {
        super(name);
    }
    // Subclass provides actual implementation
    @Override public String attack() {
        return "Attack with water!";
    }
}
