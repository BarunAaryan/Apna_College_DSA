import java.util.ArrayList;

public class PairSum1_2Pointer {
    // solving of pair sum using 2 pointer approach
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            //case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } 
            //case 2
            else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } //case 3
            else if (list.get(lp) + list.get(rp) > target) {
                rp--;
            }
            
        }
        return false;
        
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1,2,3,4,5,6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;
        System.out.println(pairSum1(list, target));

    }
}
