import java.util.Scanner;

public class Longest {
    public static void main(String[] args) {
        int n;
        Scanner a = new Scanner(System.in);
        n = a.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n; i++) 
            arr[i] = a.nextInt();

        longest(arr,n);
    }

    private static void longest(int[] arr, int n) {
        int diff = arr[1]-arr[0];
        int currlength = 1;
        int ans = -1;
        for(int i=2; i<n ;i++)
        {
            int pd = arr[i]-arr[i-1];
            if(pd == diff){
                currlength++;
            }else{
                diff = pd;
                currlength = 2;
            }
            ans = Math.max(currlength, ans);
        }
        System.out.println("The maximum length is "+ ans);
    }
}
