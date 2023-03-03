import java.util.Scanner;
// syntax :- 
// return_type function_name (parameters){
//     body
//     return_statement
// }
public class Addition{
    public static void addTwoNumbers(){
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number num1 : ");
        num1 = sc.nextInt();
        System.out.print("Enter a number num2 : ");
        num2 = sc.nextInt();
    
        System.out.println("The addition of the numbers is : " + (num1+num2));
    }
    public static void addTwoNumbers(int num1, int num2){ // formal parameters
        System.out.println("The addition of the numbers is : " + (num1+num2));
    }
    public static void main(String[] args) {
        addTwoNumbers();
        //addTwoNumbers(3,4); // actual arguments
    }
}