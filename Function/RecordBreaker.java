import java.util.Scanner;

public class RecordBreaker {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        breaker(arr,n);
    }

    private static void breaker(int[] arr, int n) {
        int ans = 0;
        int mx = -1;
        for(int i=0; i<n; i++){
            if(arr[i]>mx && arr[i]>arr[i+1]) {
                ans++;
            }
            mx = Math.max(mx, arr[i]);
        }
        System.out.println("The maximum is :"+ans);
    }
}
