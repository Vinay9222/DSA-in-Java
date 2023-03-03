public class MinMax {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        findMinMax(arr);
    }

    private static void findMinMax(int[] arr) {
        int n=arr.length,maxi=Integer.MIN_VALUE,mini=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            maxi = Math.max(maxi, arr[i]);
            mini = Math.min(mini, arr[i]);
        }
        System.out.println("The maximum value is :"+maxi);
        System.out.println("The minimum value is :"+mini);
    }
}
