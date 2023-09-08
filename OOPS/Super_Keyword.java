public class Super_Keyword {
    public static void main(String[] args) {
        Horse h= new Horse();
        System.out.println(h.color);
    }
}
class Animal{   
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
        super();
        //invocation of constructor of Animal
        //but even if we don't write here java by default calls the super keyword internally
        super.color = "Brown";
        System.out.println("Horse Constructor is Called");
    }
}