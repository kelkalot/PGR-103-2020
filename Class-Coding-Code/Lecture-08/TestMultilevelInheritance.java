//Multilevel inheritance example

class AnimalM{
    void eat(){System.out.println("eating...");}
}

class DogM extends AnimalM{
    void bark(){System.out.println("barking...");}
}

class BabyDog extends DogM{
    void weep(){System.out.println("weeping...");}
}

class TestMultilevelInheritance{
    public static void main(String args[]){
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}



