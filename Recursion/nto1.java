package Recursion;

public class nto1 {
    public static void ntoone(int n ){
        if(n==1){
            System.out.println(1);
        }
        else{
        System.out.println(n);
        ntoone(n-1);
        }
    }

    public static void main(String[] args) {
        ntoone(5);
    }
}
