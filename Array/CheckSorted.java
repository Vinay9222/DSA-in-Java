public class CheckSorted {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int arr1[] = {1,5,6,2,4,3};
        sorted(arr);
        sorted(arr1);
    }

    private static void sorted(int[] arr) {
        int n=arr.length;
        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1]){
                System.out.println("The given array is not sorted!!!!!!!");
                return;
            }
        }
        System.out.println("The given array is sorted");
    }
}
