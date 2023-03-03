//Find the minimum element in unsorted array and swap it with element at begining
public class Selection {
    public static void main(String[] args) {
        int arr[] = {5,4,2,6,8,3};
        selection(arr);
        print(arr);
    }

    private static void print(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void selection(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            int mini = Integer.MAX_VALUE, index=0;
            for(int j=i; j<n; j++){
                if(mini>arr[j]){
                    mini=arr[j];
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index ] = arr[i];
            arr[i] = temp;
        }
    }
}
