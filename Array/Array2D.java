import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        //creation:-
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[][] = new int[n][n];
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n ;j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println("Printig an array:- ");
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n ;j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        //search element in 2D array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n ;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        present(arr,n,key);
        
    }
    
    private static void present(int[][] arr, int n, int key) {
        for(int i=0; i<n; i++){
            for(int j=0; j<n ;j++){
                if(arr[i][j] == key){
                    System.out.println("The element is present in array at index x:"+i+" and y:"+j);
                    return;
                }
            }
        }
        System.out.println("The element is not present in array ");
    }
}
