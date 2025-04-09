package Bit_Manuplication;

public class GetIthBit {
    public static void getbit(int n , int i){
        int bitmask = 1<<i;
        if((n & bitmask)==0){
            System.out.println("ith bit is 0");
        }
        else{
            System.out.println("ith bit is 1");
        }
    }
    public static void main(String[] args) {
        getbit(5, 2);
    }
}
