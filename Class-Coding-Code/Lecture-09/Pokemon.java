public class Pokemon {


    String name, type;
    int level;


    Pokemon(String name, int level){
        this.name = name;
        this.level = level;
        this.type = "None";
    }



    public void attack(){
        System.out.println(type + " tackle attack");
    }

    public void speak(){
        System.out.println(name + ", " + name + "...");
    }


}
