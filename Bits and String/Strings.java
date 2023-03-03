public class Strings {
    public static void main(String[] args) {
        String a = "abcdef";
        String ab = "abccba";
        isPallindrome(a);
        isPallindrome(ab);
    }

    private static void isPallindrome(String ab) {
        int i=0;
        int e = ab.length()-1;
        while(i<=e){
            if(ab.charAt(i++)!=ab.charAt(e--)) {
                System.out.println("The string is not palindrome :" + ab);
                return;
            }
        }
        System.out.println("The string is palindrome :" + ab);
    }    
}
