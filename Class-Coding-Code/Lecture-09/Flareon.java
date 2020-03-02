//Fire type
public class Flareon extends Eevee {


    Flareon(String name, int level) {
        super(name, level);
        this.type = "Fire";
    }


    public void fireAttack() {
        System.out.println(name + " does a " + type + " attack");
    }


    @Override
    public void speak() {
        System.out.println(name + ", " + name + "...");
    }
}