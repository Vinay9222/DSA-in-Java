// This is sorting is done in range or in limited range i.e. the element is range form 2 to 10 100 times
public class CountSort {
    public static void main(String[] args) {
        int arr[] = {5,4,2,6,8,3,2};
        countSort(arr);
    }

    private static void countSort(int[] arr) {
        int n=arr.length;
        int a[] = new int[10];
        for(int i=0; i<10; i++) a[i]=0;
        for(int i=0; i<n; i++){
            a[arr[i]]++;
        }
        
        for(int i=0; i<10; i++){
            if(a[i]==0) continue;
            else{
                while(a[i]!=0){
                    System.out.print(i+" ");
                    a[i]--;
                }
            }
        }

    }

}
