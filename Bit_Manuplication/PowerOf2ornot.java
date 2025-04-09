package Bit_Manuplication;

public class PowerOf2ornot {
    public static int poweroftwo(int n){
        return(n&(n-1));
    }
    public static void main(String[] args) {
        int n = 8 ;
        if(poweroftwo(n) == 0 ){
            System.out.println("its power of two ");
        }
        else{
            System.out.println("no its not power of 2");
        }
    }
}
