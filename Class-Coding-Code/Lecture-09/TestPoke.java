import java.util.ArrayList;

public class TestPoke {


    public static void main(String[] args) {

        ArrayList<Pokemon> pokeball = new ArrayList<>();


        //Wild Eevee is appearing
        Pokemon eevee1 = new Eevee("Rata", 5);

        //Catch the Eevee
        pokeball.add(eevee1);

        //Wild Flareon is appearing
        Pokemon flareon1 = new Flareon("Rolo", 1);

        //Catch the Flareon
        pokeball.add(flareon1);

        //Wild Jolteon is appearing
        Pokemon jolteon1 = new Jolteon("Pira", 10);

        //Catch the Jolteon
        pokeball.add(jolteon1);


        //Let them attack
        for(Pokemon p : pokeball){

            System.out.println();

            p.speak();
            p.attack();

            if(p instanceof Flareon)
                ((Flareon)p).fireAttack();

            if(p instanceof Jolteon)
                ((Jolteon)p).thunderAttack();



        }



    }

}
