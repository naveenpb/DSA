package Bit_Manuplication;

public class Clearithbit {
    public static int clearithbit(int n , int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearithbit(5, 2));
    }
}
