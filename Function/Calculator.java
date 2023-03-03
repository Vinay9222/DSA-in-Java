import java.util.Scanner;

public class Calculator {
    public static void addTwoNumbers(){
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number num1 : ");
        num1 = sc.nextInt();
        System.out.print("Enter a number num2 : ");
        num2 = sc.nextInt();
    
        System.out.println("The addition of the numbers is : " + (num1+num2));
    }

    public static void addTwoNumbers(int num1, int num2){ 
        System.out.println("The addition of the numbers is : " + (num1+num2));
    }

    public static void addTwoNumbers(double num1, double num2){ 
        System.out.println("The addition of the numbers is : " + (num1+num2));
    }

    public static void main(String[] args) {
        //Function Overloading :- Multiple functions with same name for different parameters
        addTwoNumbers();
        // addTwoNumbers(5,6);
        // addTwoNumbers(5.3, 4.5);
    }    
}
