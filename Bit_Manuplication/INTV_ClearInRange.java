package Bit_Manuplication;

public class INTV_ClearInRange {
    public static int clearbit(int n , int i , int  j){
        int bitmask_a =(-1 << j+1);
        int bitmask_b =(1<<i)-1;
        int bitmask = bitmask_a | bitmask_b ;
        return n&bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clearbit(15, 2, 3));  
    }
}
