import java.util.Scanner;

public class Product {
    public static void productTwoNumber(int num1, int num2){
        System.err.println("The product of two numbers is : "+(num1*num2));
    }
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st value a : ");
        num1 = sc.nextInt();
        System.out.print("Enter the 2nd value b : ");
        num2 = sc.nextInt();

        productTwoNumber(num1, num2);  
    }    
}
