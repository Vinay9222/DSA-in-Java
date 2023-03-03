import java.util.*;

public class Prime {
    // TimeComplexity :- O(n)
    // public static void checkPrime(int num1) {
    //     for (int i = 2; i < num1; i++) {
    //         if (num1 % i == 0) {
    //             System.out.println("The number is not prime number");
    //             return;
    //         }
    //     }
    //     System.out.println("The number is Prime Number");
    // }
    
    // TimeComplexity :- O(sqrt(n))
    public static boolean checkPrime(int num1) {
        for (int i = 2; i <= Math.sqrt(num1); i++) {
            if (num1 % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void checkPrimeNumber(int i){
        if(checkPrime(i))
        System.out.print(i+" ");
    }
    
    public static void rangePrime(int start, int end){
        for(int i=start; i<=end; i++){
            checkPrimeNumber(i);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check no is prime or not : ");
        int num1 = sc.nextInt();
        
        if(checkPrime(num1)){
            System.out.println("The number is not prime number");
        }else{
            System.out.println("The number is Prime Number");
        }
        rangePrime(10, 100);
    }
}
