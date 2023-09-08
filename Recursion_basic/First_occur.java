public class First_occur {
    public static int firstOccurence(int arr[], int key, int i) {
        // base case
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }
    public static void main(String[] args) {
int arr[]= {8,6,8,9,2,3,2,5,9};
System.out.println(firstOccurence(arr, 2, 0));
    }
}
