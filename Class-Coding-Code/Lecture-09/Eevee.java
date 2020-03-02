public class Eevee extends Pokemon {


    Eevee(String name, int level) {
        super(name, level);
        this.type = "Standard";
    }

    @Override
    public void attack() {
        System.out.println(name + " does a standard attack");
    }


    @Override
    public void speak() {
        System.out.println(name + ", " + name + "...");
    }
}
