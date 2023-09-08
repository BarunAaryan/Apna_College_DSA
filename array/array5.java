public class array5 {
    public static int binarySearch(int numbers[], int key){
        int start =0, end= numbers.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            //comparison
            if(numbers[mid]==key){ //found
                return mid;
            }
            if(numbers[mid]<key){ //right 
                start = mid+1;
            
        }else{//left
            end= mid-1;
        }
    }
    return -1;
}
    public static void main(String[] args) {
        int numbers[] = { 2,4, 7,  8, 9, 10, 18, 21 , 54, 76 };
        int key = 36;
        System.out.println("Index for key is "+ binarySearch(numbers, key));
    }
}
