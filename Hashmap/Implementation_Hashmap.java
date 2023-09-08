import java.util.*;

public class Implementation_Hashmap {
    static class HashMap<K, V> { // K and V atr generic
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n total no. of nodes
        private int N;
        private LinkedList<Node> buckets[]; // N => array
        // array ke andar linked list store ho rahi hai
        // bucket is array of linked list

        @SuppressWarnings("Unchecked")
        public HashMap() { // constrcutor
            this.N = 4;
            this.buckets = new LinkedList[4]; // bucket size is 4
            // creation of linked list
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }
            // if key not found till the end
            return -1;
        }
@SuppressWarnings("Unchecked")
        private void rehash() {
            LinkedList<Node> oldBuck[] = buckets;
            buckets = new LinkedList[N * 2];
            N = 2 * N;
            // put value from old bucket into new bucket

            // creating empty linked list in the new bucket list
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            // nodes -> add in bucket
            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }

            }
        }

        public void put(K key, V value) { // O(lambda) -> O(1)
            // find bucket index
            int bi = hashFunction(key); // 0 to 3
            // search on the linked list
            int di = SearchInLL(key, bi); // di = data index

            if (di != -1) {
                // key exist in the linked list
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda = n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) { // O(1)
            // find bucket index
            int bi = hashFunction(key); // 0 to 3
            // search on the linked list
            int di = SearchInLL(key, bi); // di = data index

            if (di != -1) {
                // key exist in the linked list
                return true;
            } else {
                return false;
            }
        }

        public V remove(K key) { // O(1)
            // find bucket index
            int bi = hashFunction(key); // 0 to 3
            // search on the linked list
            int di = SearchInLL(key, bi); // di = data index

            if (di != -1) {
                // key exist in the linked list
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        public V get(K key) { // O(1)
            // find bucket index
            int bi = hashFunction(key); // 0 to 3
            // search on the linked list
            int di = SearchInLL(key, bi); // di = data index

            if (di != -1) {
                // key exist in the linked list
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;

        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        ArrayList<String> keys= hm.keySet();
        for(String key: keys){
            System.out.println(key);
        }
        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
    }
}
