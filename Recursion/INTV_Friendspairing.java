package Recursion;

public class INTV_Friendspairing {
    public static int calcpair(int n){
        // base case
        if(n== 1 || n == 2){
            return n;
        }

        // if person choose to be single
        int single = calcpair(n-1);

        // if person choose to be pair

        int pair = (n-1) * calcpair(n-2);

        return pair + single;
    }

    public static void main(String[] args) {
        System.out.println(calcpair(3));
    }
}
