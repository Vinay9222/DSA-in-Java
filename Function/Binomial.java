import java.util.Scanner;

public class Binomial {

    public static int FactorialNumber(int num1){
        int ans = 1;
        for(int i=2; i<=num1; i++){
            ans *= i;
        }
        return ans;
    }

    public static void BinomialNumber(int n,int r){
        int ans = FactorialNumber(n) / (FactorialNumber(r) * FactorialNumber(n-r));
        System.out.println("The binomial number is " + ans);
    }
    
    public static void main(String[] args) {
        int n,r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        n = sc.nextInt();
        System.out.print("Enter the value of r : ");
        r = sc.nextInt();

        BinomialNumber(n, r);  
    }    
}