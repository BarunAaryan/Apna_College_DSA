import java.util.*;
public class StringIntro {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // char arr[] = { 'a', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str2 = new String("xyz");
        // // String are IMMUTABLE
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);
        // String fullName= "Barun Aaryan";
        // System.out.println(fullName.length());
        //concatination
        String firstName = "Barun";
        String lastName= "Aaryan";
        String FullName = firstName + " "+ lastName;
        // System.out.println(FullName);
        //charAt()
       // System.out.println(FullName.charAt(4));
        printLetters(FullName);
    }
}
