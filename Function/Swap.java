import java.util.Scanner;

public class Swap {
    public static void swapTwoNumber(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st value a : ");
        num1 = sc.nextInt();
        System.out.print("Enter the 2nd value b : ");
        num2 = sc.nextInt();
        System.out.println("The values of a and b before swap is : " +num1 +" "+ num2);    
        swapTwoNumber(num1, num2); // there is no swapping happen beacuase of the pass by value
        System.out.println("The values of a and b after swap is : "+num1 +" "+ num2);    
    }
}
