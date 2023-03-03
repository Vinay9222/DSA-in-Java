public class SumOfN {
    public static int sumOfN(int n){
        if(n==1) return 1;
        return sumOfN(n-1)+n;
    }
    public static void main(String[] args) {
        System.out.println("The sum of number is : "+sumOfN(10));
    }
}
