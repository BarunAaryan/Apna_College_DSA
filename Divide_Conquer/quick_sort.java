public class quick_sort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // last element
        int pidx = partition(arr, si, ei); // pidx= pivot index
        quickSort(arr, si, pidx - 1); // left
        quickSort(arr, pidx + 1, ei); // left

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // jagah banana or to make place for elements smaller than pivot
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                // then we have to makr place
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                // index i value and index j value swap
            }
        }
        // to swap the pivot
        i++;
        // swap
        int temp = pivot;
        arr[ei] = arr[i]; // cant write pivot = arr[i], because pivot is variable
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
