public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Down , Left , right , diagonal in all 4 directions");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Up, down , left , right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("Up, down , left , right, diagonal by one step");
    }
}