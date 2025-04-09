package Strings;
/*
 * WHERE EVER I HAVE GIVEN INTV THEN THESE QUESTIONS ARE MOST FREQUENTLY USED QUESTIONS IN PLACEMENT AND INTERVIEW
 * 
 */
public class INTV_Palindrome {
    public static boolean isplaindrome(String str){
        int mid = str.length()/2;
        for(int i =0 ;i<mid;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;

            }
        }
        return true;

        
    }

    public static void main(String[] args) {
        System.out.println(isplaindrome("bcb"));
    }
}
