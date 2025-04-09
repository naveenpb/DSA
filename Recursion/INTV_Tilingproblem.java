package Recursion;

public class INTV_Tilingproblem {


    // AMAZON

     

    /*
     * 
     * Tracing in in notess , if you didnt understand even that then you can rewatch the video.
     * 
     */

     /*
      *HERE IT IMPORTANTR TO NOTE THAT FLOOR SIZE CAN ALSO BE 4x1 AND TILE SIZE WILL BE CHANGE
      */
    public static int tiling(int n ){ // n give me the length
        // base case
        
        if(n == 0 || n ==1 ){
            return 1;
        }

        // vertical tiling

        int verticaltiling =tiling(n-1);
        
        // horizontal tiling

        int horizontaltiling = tiling(n -2);
        
        // return total ways

        return verticaltiling + horizontaltiling;

    }

    public static void main(String[] args) {
        System.out.println(tiling(5));
    }
}
