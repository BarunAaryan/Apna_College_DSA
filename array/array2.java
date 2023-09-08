public class array2 {
    //Call by value and call by reference
    public static void update(int marks[], int nonChangeable){
        nonChangeable= 10;
        for(int i=0; i<marks.length; i++){
            marks[i]= marks[i]+1; //i is the index number
        }
    }
    public static void main(String[] args) {
        int marks[]= {12, 45, 54};
        int nonChangeable= 5;
        update(marks, nonChangeable);
        System.out.println(nonChangeable);
        //print our marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
