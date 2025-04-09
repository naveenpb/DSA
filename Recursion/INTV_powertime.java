package Recursion;

public class INTV_powertime {

    /*
     * 
     * here this code  will also caculate the power of two numbers , but in the timecompleity of logn , so it reduces time coomplexity 
     * when compared to normal one , which was calculated using recurssion
     * 
     * 
     */

     public static int power(int x , int n){
        /*
         * Soo here we  have to debug one simple concept , see when n is even , we can do x^n = x^n/2 *x^n/2 
         * and when n is odd we can do x^n = x * x^n/2 +x^n/2
         * so let us store the value of halfpower in an variable and reuse it again and again.
         * thats all good to go ... boommmmm
         * 
         */

         

         if(n == 0 ){
            return 1;
            // base case
         }


         int halfpower = power(x, n/2);
         // have you came from notebook ? , here i will explain you what i have written there, see in notebook for what i have caculated time comlexity right , there 
         // we will get O(n) in equation ,  but why ? 
         // here is the explanation , see first we made halfpower = power(x,n/2) * power(x,n/2) , which will call recurssion two times , which was not completely optimised , so we have here called recussion only once and multiplied the returned values twice , witch will reduce the time complexity..... 
         int halfpowersq = halfpower *halfpower;  // Confusing ? , Read above formula 

         if(n %2 == 0){
                return halfpowersq;

         }

         else {
            return x*halfpowersq;
         }

     }

     public static void main(String[] args) {
        System.out.println(power(5, 3));
     }
    
}
