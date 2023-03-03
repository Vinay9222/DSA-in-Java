// Insert an element from unsorted array to its correct position in sorted array
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5,4,2,6,8,3};
        insertion(arr);
        print(arr);
    }

    private static void print(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void insertion(int[] arr) {
        int n = arr.length;
        for(int i=1; i<n; i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

}
