import java.util.Arrays; // for the sort
import java.util.Collections; // for reverse order sort and print

public class Sorting {
    public static void main(String[] args) {
        // inbulit function  :- Arrays.sort(arr);
        // inbulit function  :- Arrays.sort(arr,si,ei);
        // reverse an array :- Arrays.sort(arr,Collections.reverseOrder());
        Integer arr[] = {10,5,9,7,3,99,65};
        System.out.println("Before sorting :-");
        for(Integer i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        // Arrays.sort(arr);
        Arrays.sort(arr,Collections.reverseOrder()); // need object
        // Arrays.sort(arr,3,6);
        System.out.println("\nAfter sorting :-");

        for(Integer i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
