package Recursion;

import java.util.Scanner;

public class BinaryString {
    public static  void printbinstr(int n , int lastplace , String str)
    {


        // base case 

        if(n == 0){
            System.out.println(str);
            return;
        }
        // if(lastplace == 0){
        //     printbinstr(n-1, 0, str.append("0"));
        //     printbinstr(n-1,1, str.append("1"));
        // }

        // else{
        //     printbinstr(n-1,1, str.append("1"));
        // }


        // INSTED OF WRITING THIS BIG CODE WE CAN MAKE IT SMALL

        printbinstr(n-1, 0, str+"0");
        if(lastplace == 0) {
            printbinstr(n-1, 1, str+"1");
        }

        // if we dont waant to print the number with consicutive one , then dont write this below if c=block , 
        // // but if i want to print all the possible combinations of n , then write the below if block .
        // if(lastplace == 1){
        //     printbinstr(n-1, 1, str+"1");
        // }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printbinstr(n, 0, new String());
        sc.close();
    }
}
