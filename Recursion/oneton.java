package Recursion;

public class oneton {
    public static void onetonprint(int n){
        if(n==1){
            System.out.println(n);
        }
        else{
            onetonprint(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        onetonprint(4);
    }
}
