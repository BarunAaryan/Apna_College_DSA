import java.util.*;

public class FindItiFrmTicket {

    public static String getStart(HashMap<String,String> tickets ){
        HashMap<String, String> revMap = new HashMap<>();
        for(String key: tickets.keySet()){
            //reversing the to and from, value in place of key and key in place of value
            revMap.put(tickets.get(key), key);
        }

        for(String key: tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key; //this becomes the starting point
            }
        }
        return null;
    }
    public static void main(String[] args) { //O(n)
        HashMap<String , String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        
        String start = getStart(tickets);
        System.out.print(start);
        for(String key: tickets.keySet()){
System.out.print(" -> "+ tickets.get(start));
start = tickets.get(start);
        }
System.out.println();
    }
}
