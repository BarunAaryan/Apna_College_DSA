public class Substring {
    public static String getSubstring(String str, int si, int ei) {
        // si = starting index, ei = ending index
        String substr = ""; // initialized with empty string
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        // Substring
        String str = "HelloWorld";
        System.out.println(getSubstring(str, 0, 5));
        System.out.println(str.substring(0, 5));
    }
}
