public class LargestNumber {
    public static void main(String[] args) {
        int arr[] = {1,3,5,29,99};
        largestNumber(arr);
    }

    private static void largestNumber(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(maxi < arr[i]){
                maxi = arr[i];
            }
        }
        System.out.print("The maximum value is :" + maxi);
    }
}
