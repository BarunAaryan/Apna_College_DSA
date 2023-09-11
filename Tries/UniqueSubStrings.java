import java.util.*;

public class UniqueSubStrings {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false; // end of word

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static boolean search(String key) { // O(l)
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true; // current node key == last letter of word

    }

    public static void insert(String word) { // o(l)
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }
        return count + 1;
        // +1 beacuse we are counting our self node
        // count+=countNodes(root.children[i] = will count the children nodes

    }

    public static void main(String[] args) {
        String str = "ababa"; // ans=10
        // suffix-> insert in tye trie
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            // we are going from i to last index
            insert(suffix);
        }
        System.out.println(countNodes(root));
    }
}
