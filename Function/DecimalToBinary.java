import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        convertDecimal(num);
    }

    private static void convertDecimal(int num) {
        int arr[] = new int[32];
        int i = 0;
        while(num>0){
            arr[i] = num%2;
            i++;
            num/=2;
        }
        System.out.println("The number is in form of decimal is :");
        for(int j=i-1; j>=0; j--) System.out.print(arr[j]);
    }       
}
