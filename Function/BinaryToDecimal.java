import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        convertBinary(num);

    }

    private static void convertBinary(int num) {
        double ans = 0, k=0;
        while(num>0){
            double div = num%10;
            ans += Math.pow(2.0, k) * div;
            k++;
            num/=10;
        }
        System.out.println("The number is in form of decimal is :" + (int)ans);
    }    
}
