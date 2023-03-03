import java.util.Currency;

public class MaxSumSubarray {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, -1, 3};
        maxSumSubarray(arr);
    }

    // // Bruth Force Approach:-
    // private static void maxSumSubarray(int[] arr) {
    //     int n = arr.length,maxi = Integer.MIN_VALUE;
    //     for(int i=0; i<n; i++){
    //         for(int j=i+1; j<n; j++){
    //             int ans=0;
    //             for(int k=i; k<=j; k++){
    //                 ans+=arr[k];
    //             }
    //             if(maxi<ans)  {
    //                     maxi = ans;
    //                 }
    //             }
    //         }
    //     System.out.println("The maximum sum of the subarray is :"+ maxi);
    // }

    // // Prefix Sum :-
    // private static void maxSumSubarray(int[] arr) {
    //     int n = arr.length, currSum = 0, maxi = Integer.MIN_VALUE;
    //     int prefix[] = new int[arr.length];

    //     prefix[0] = arr[0];
    //     for(int i=1; i<arr.length; i++){
    //         prefix[i] = prefix[i-1] + arr[i];
    //     }

    //     for(int i=0; i<n; i++){
    //         int start = i;
    //         for(int j=i; j<n; j++){
    //             int end = j;
                
    //             currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

    //             if(currSum > maxi) maxi = currSum;
    //         }
    //     }
        
    //     System.out.println("The maximum sum of the subarray is :"+ maxi);
    // }
    
    // Kadanes Algorithm :-
    private static void maxSumSubarray(int[] arr) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<arr.length; i++){
            cs += arr[i];
            if(cs < 0 ){
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("The max subarray is :" +ms);
    }
}
