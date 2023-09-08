public class Backtracking_array {
    public static void changeArr(int arr[], int i, int val){
        //baee case
        if(i==arr.length){
            printArr(arr);
            return;
        }

        //recursion(kam)
        arr[i]= val;
        changeArr(arr, i+1, val+1); //upar wali calls => function call step
        arr[i]= arr[i]-2;//backtacking step

    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[]= new int[5];
        changeArr(arr, 0,1);
        printArr(arr);
    }
}
