public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,4,5,7,8};
        int num = 4;
        binarySearch(arr,num);
    }

    private static void binarySearch(int[] arr, int num) {
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = (start+end) / 2;
            if(arr[mid] == num){
                System.out.print("The number is present in array at index :" + mid);
                return;
            }else if(arr[mid] > num){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        System.out.print("The number is not present in array.");
    }
}
