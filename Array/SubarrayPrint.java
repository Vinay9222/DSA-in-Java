public class SubarrayPrint {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printSubarray(arr);
    }

    private static void printSubarray(int[] arr) {
        int n = arr.length;
        System.out.println("The Subarray are as follow :");
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=i; k<j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
