public class BinaryString {
    public static void printBinStrings(int n, int lastPlace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinStrings(n-1, 1, str+"1");
        //kaam
if(lastPlace ==1){
    printBinStrings(n-1, 0, str+"0");
}
    }
    public static void main(String[] args) {
        printBinStrings(3, 1, "");
    }
}
