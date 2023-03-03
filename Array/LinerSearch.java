public class LinerSearch {
    public static void linerSearch(int arr[], int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                System.out.print("The number is present in array at index :" + i);
                return;
            }
        }
        System.out.print("The number is not present in array!!!");
    }
    public static void main(String[] args) {
        int num = 10;
        int arr[] = {1,3,4,6,69,10};
        linerSearch(arr, num);
    }    
}
