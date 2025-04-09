package Bit_Manuplication;

public class SetithBit {
    // in the ith position we have to make that bit as 1
    public static void setithbit(int n , int i){
        int bitmask = 1<<i;
        int a = n | bitmask ;
        System.out.println(a);
        // tracing is in notes
    }

    public static void main(String[] args) {
        setithbit(5, 1);
    }


}
