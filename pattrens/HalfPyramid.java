package pattrens;

import java.util.Scanner;

public class HalfPyramid {
   static Scanner sc = new Scanner(System.in);
    
    public  static int input(){
        System.out.print("please enter the value of n :-");
        int n = sc.nextInt();
        return n;   
    }

    public static void main(String[] args) {
       
        int a = HalfPyramid.input();
        for(int i =1 ;i<=a;i++){
            for(int j =1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
