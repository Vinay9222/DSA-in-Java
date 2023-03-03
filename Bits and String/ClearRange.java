public class ClearRange {
    public static void main(String[] args) {
        int n = 1189;
        int s=2,e=6;
        a(n);
        System.out.println();
        a(clearrange(n,s,e));
    }

    private static int clearrange(int n, int s, int e) {
        int a = (~0)<<s;
        int b = 1<<e-1;
        return a&b;
    }
    public static void a(int n){
        while(n>0){
            if((n&1)==1){
                System.out.print("1");
            }else System.out.print("0");
            n = n>>1;
        }
    }
}
