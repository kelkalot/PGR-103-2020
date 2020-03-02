//Thunder type
public class Jolteon extends Eevee {


    Jolteon(String name, int level) {
        super(name, level);
        this.type = "Thunder";
    }


    public void thunderAttack() {
        System.out.println(name + " does a " + type + " attack");
    }

    @Override
    public void speak() {
        System.out.println(name + ", " + name + "...");
    }
}