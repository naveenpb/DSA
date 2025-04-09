package Recursion;

public class NSum {
    public static int nsum(int n){
        int sum = 0 ;
        if(n==1){
            return 1;
        }
        

        else{
           sum = n+nsum(n-1);

        }

        return sum;
    }
    public static void main(String[] args) {
        System.out.println(nsum(5));
    }
}
