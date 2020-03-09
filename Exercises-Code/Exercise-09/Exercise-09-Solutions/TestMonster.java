public class TestMonster {
    public static void main(String[] args) {
        // Program at the "interface" defined in the superclass.
        // Declare instances of the superclass, substituted by subclasses.
        Monster m1 = new FireMonster("Glumanda");   // upcast
        Monster m2 = new WaterMonster("Shiggy");  // upcast
        Monster m3 = new StoneMonster("Bisasam");  // upcast
        // Invoke the actual implementation
        System.out.println(m1.attack());  // Run FireMonster's attack()
        System.out.println(m2.attack());  // Run WaterMonster's attack()
        System.out.println(m3.attack());  // Run StoneMonster's attack()

        // m1 dies, generate a new instance and re-assign to m1.
        m1 = new StoneMonster("Boldi");  // upcast
        System.out.println(m1.attack());  // Run StoneMonster's attack()

        // We have a problem here!!!
        Monster m4 = new Monster("Mewto");
        System.out.println(m4.attack());  // garbage!!! This does not make sense
    }
}
