public class PairsInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        pairs(arr);
    }

    private static void pairs(int[] arr) {
        System.out.println("The pairs in an array is :");
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i] + "," + arr[j]+") ");
            }
            System.out.println();
        }
    }
}
