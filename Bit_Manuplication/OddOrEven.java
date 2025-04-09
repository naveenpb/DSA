package Bit_Manuplication;

public class OddOrEven {

    public static void oddeven(int n ){
        // we generally call 1 as bitmask in this kind of operations
        // so
        int bitmask =1;
        if((n & bitmask)==1){
            System.out.println("Its Odd");
        }
        else{
            System.out.println("ITS EVEN");
        }
    }
    public static void main(String[] args) {
        oddeven(102);
        oddeven(2);
        oddeven(33 );
    }
}
