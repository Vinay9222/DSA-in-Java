import java.util.Scanner;

public class Ones {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int ab=0;
        while(n>0){
            if((n&1) == 1) ab++;
            n = n>>1;
        }
        System.out.println("The number of ones in number are :" + ab);
    }
}
