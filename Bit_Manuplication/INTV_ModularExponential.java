package Bit_Manuplication;

public class INTV_ModularExponential {
    /*
     * 
     * 
     * IMP KANOO IDU.
     * 
     * 
     */
    public static int ModularExpo(int n , int expo ,int mod){
        int ans =1;
        while(expo>0){
            if((expo & 1 )== 1){
                ans = (ans * n)%mod;
            }
            n*=n%mod;
            expo=expo>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(ModularExpo(5, 3, 100000007));
    }
}
