public class Nfibonacii {
    public static int fibonacci(int n){
        if(n==0 || n==1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println("The fibonacii of the number is : "+fibonacci(12));
    }
}
