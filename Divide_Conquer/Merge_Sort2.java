public class Merge_Sort2 {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2; // (si+ei)/2
        mergeSort(arr, si, mid);// left part
        mergeSort(arr, mid + 1, ei);// right part
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
int len1= mid-si+1;
int len2 = ei -mid;
int first[]= new int[len1];
int second[]= new int[len1];
//copy values
int mainArrayIndex =si;
for(int i=0; i<len1; i++){
first[i]= arr[mainArrayIndex++];
}
mainArrayIndex=mid+1;
for(int i=0; i<len2; i++){
second[i]= arr[mainArrayIndex++];
}
//merge 2 sorted arrays
int index1=0;
int index2=0;
mainArrayIndex= si;
while(index1<len1 && index2 < len2){
    if(first[index1]< second[index2]){
        arr[mainArrayIndex++]= first[index1++];
    }else{
        arr[mainArrayIndex++]= second[index1++];
    }
}
while(index1<len1){
    arr[mainArrayIndex++]= first[index1++];
}
while(index2<len2){
    arr[mainArrayIndex++]= second[index2++];
}

    }

    public static void main(String[] args) {
        int arr[]= {2,4,1,6,9,4};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
