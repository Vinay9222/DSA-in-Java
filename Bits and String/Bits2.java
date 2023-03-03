public class Bits2 {
    public static void main(String[] args) {
        int n=11;
        int index = 2;
        System.out.println("The index at index is "+ getbit(n,index));
        System.out.println("The index set at index is "+ setbit(n,index));
        System.out.println("The index clear at index is "+ clearbit(n,index));
        System.out.println("The index update at index is "+ updatebit(n,index));
    }

    private static int updatebit(int n, int index) {
        // int newBit = clearbit(n, index);
        // int bitmask = newBit << index;
        // return n|bitmask;
        if(getbit(n, index)==1){
            return clearbit(n, index);
        }else 
            return setbit(n, index);
    }

    private static int clearbit(int n, int index) {
        int maskbit = ~(1<<index);
        return (n&maskbit);
    }

    private static int setbit(int n, int index) {
        int maskbit = 1<<index;
        return (n|maskbit);
    }

    private static int getbit(int n, int index) {
        int maskbit = 1<<index;
        if((maskbit&n)==0)
            return 0;
        return 1;
    }
}
