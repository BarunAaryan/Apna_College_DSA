public class Interfaces1 {
    public static void main(String[] args) {
        Bear b= new Bear();
        b.Veg();
        b.Non_Veg();
    }
}
interface Carnivore{
public void Veg();
}
interface Herbivore{
public void Non_Veg();
}
class Bear implements Carnivore, Herbivore{
public void Non_Veg(){
    System.out.println("Eats Animals");
}
public void Veg(){
    System.out.println("Eats Vegetables");
}
}