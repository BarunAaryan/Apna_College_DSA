public class Abstract_class {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        //this will print brown color
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        Mustang myHorse= new Mustang();
        //Animal-> Horse=> Mustang
    }
}

abstract class Animal {
    //creating a constructor
    String color;
    Animal(){
        System.out.println("Animal constructor called");
        color= "brown";
    }

    // non abstract method
    void eat() {
        System.out.println("Animal Eats");
    }

    // abstract methd
    abstract void walk();
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color="dark brown";
    }
    void walk() {
        System.out.println("Walks on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {
    void changeColor(){
        color="white";
    }
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}