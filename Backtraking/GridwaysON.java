package Backtraking;

public class GridwaysON {
    /*
     * 
     * ON - O(N) :- Solving grid problem in ;inear time complexity
     */
    public static int fact(int n){
        if(n==0)
        {
            return 1;
        }
        int fn = n * fact(n-1);
        return fn ;

    }
     public static void main(String[] args) {
        int n = 3 ,m=3;
        int numaratorfact =  fact((n-1) + (m-1));
        int nfact=fact(n-1);
        int mfact = fact(m-1);
        int totalways = numaratorfact / (nfact*mfact);
        System.out.println("Total ways are " +totalways);
     }
}
