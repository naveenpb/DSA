package Backtraking;

public class GridWays {
    
    
    // IT HAS WORST TIME COMPLEXITY SO , WE CAN REDUCE IT FOR O(N) , USIIING PERMUTATION SEE THE CODE IN SAME PACKAGE 


    public static int gridways(int i , int j , int n , int m){
        //base case
        if(i== n -1 && j==m-1){
            return 1; // if target == source
        } 
        else if (i==n || j==n){ //boundry case
            return 0 ;
        } 
        // Recurssion
        int w1 = gridways(i+1, j, n, m);
        int w2 = gridways(i, j+1, n, m);

        return w1+w2;
    }
    public static void main(String[] args) {
        int n = 3 ,m=3;
        int a= gridways(0, 0, n, m);
        System.out.println("the number of ways are " +a);
    }

}
