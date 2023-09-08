public class array3 {
    //linear search
    public static int linearSearch(int number[], int key){
        for(int i=0; i<number.length; i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]= {12, 45, 65, 83, 94};
       // String menu[] = {"dosa", "Idli ", "Uttapam"};
        int key = 65;
        int index = linearSearch(number, key);
        if(index ==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Key is at index " + index);
        }
    }
}