package Recursion;

public class Fibonnacci {
    // not series only nth term 
    public static int fib(int n){

        if(n ==1 || n==0){
            return 1;
        }
        else{
            return (fib(n-1)+fib(n-2));
        }
    }
    public static void main(String[] args) {
        for(int i = 0 ; i < 7 ; i++){
            System.out.print(fib(i) +" ");
        }
    }
}
