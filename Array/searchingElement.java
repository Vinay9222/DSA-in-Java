public class searchingElement {
    public static void main(String[] args) {
        int arr[][] = { {1,2,3},{4,5,6},{7,8,9} };
        int key = 8;
        search(arr,key);
    }

    private static void search(int[][] arr, int key) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==key) {
                    System.out.println("The key is found in array at index :"+arr[i][j]);
                    return;
                }
            }
        }
        System.out.println("The key is not found in array!!!");
    }
    
}
