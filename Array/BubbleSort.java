//Reapeatedly swap two adjacent elements if they are in wrong order
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5,4,2,6,8,3};
        bubble(arr);
        print(arr);
    }

    private static void print(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void bubble(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

}
