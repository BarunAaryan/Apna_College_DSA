public class Last_occur {
    public static int LastOccurence(int arr[], int key, int i) {
        // base case if key is not found
        if (i == arr.length) {
            return -1;
        }

        // when
        int isFound = LastOccurence(arr, key, i + 1);

        if (isFound == -1 && arr[i]==key ) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[]= {8,6,8,9,2,3,2,5,9};
        System.out.println(LastOccurence(arr, 7, 0));
    }
}
