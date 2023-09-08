public class Inheritance {
    public static void main(String[] args) {
        Fish dobby = new Fish();
        dobby.eat();
        dobby.Swims();
    }
}
//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
class Mammals extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}
class Fish extends Animal{
    void Swims(){
        System.out.println("Swims");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}
