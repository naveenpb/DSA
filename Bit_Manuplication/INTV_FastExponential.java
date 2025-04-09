package Bit_Manuplication;

public class INTV_FastExponential {
    public static int fastexpo(int a , int n){
        int ans = 1;
        while(n>0){
            if((n&1) != 0){ //check lsb
                ans = ans*a;
            }
            a=a*a;
            n = n>>1;   
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastexpo(5, 3));
    }

    // its very important in terms of time complexity .it have O(log n) . time complexity.
    
    /*
     * 
     * 
     * 
     * 
     * 
     * Modular exponential is also very important soo , do study that its asked iin many interview.
     * 
     * 
     * 
     * 
     * 
     * 
     */
}
