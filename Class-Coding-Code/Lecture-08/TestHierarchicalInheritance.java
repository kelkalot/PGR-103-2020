//Hierarchical inheritance

class AnimalH{
    void eat(){System.out.println("eating...");}
}
class DogH extends AnimalH{
    void bark(){System.out.println("barking...");}
}
class CatH extends AnimalH{
    void meow(){System.out.println("meowing...");}
}
class TestHierarchicalInheritance{
    public static void main(String args[]){
        CatH c=new CatH();
        c.meow();
        c.eat();
        //c.bark();//Give a compiler error!
    }}