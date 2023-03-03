import java.util.Scanner;

public class Subsets {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if( (i & (1<<j)) ==1){
                    System.out.print(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
