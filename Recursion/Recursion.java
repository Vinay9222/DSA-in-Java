//Print insersing and decreasing order
public class Recursion{
    public static void print(int n){
        if(n==0) return;
        System.out.print(n+" ");
        print(n-1); 
    }

    public static void print1(int n){
        if(n==0) return;
        print1(n-1); 
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        print(10);
        System.out.println();
        print1(10);
    }
}