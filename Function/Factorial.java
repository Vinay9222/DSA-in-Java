import java.util.Scanner;

public class Factorial {
    public static void FactorialNumber(int num1){
        int ans = 1;
        for(int i=2; i<=num1; i++){
            ans *= i;
        }
        System.out.println("The factorial of numbers is : " + ans);
    }
    public static void main(String[] args) {
        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value to find out the factorial : ");
        num1 = sc.nextInt();

        FactorialNumber(num1);  
    }    
}