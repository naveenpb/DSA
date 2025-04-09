package Recursion;

// import java.io.*;

public class INTV_RemoveDublicates {
    /*
     * 
     * TAKE AN INDEX VARIABLE , TAKE AN STRING STR IN MEHTOD INPUT AND A STRING BUIKLDER TO APPEND THE NEW STRING , AND a BOOLOEAN TYPE ARRAY OF SIZE 26  , TO CHECK WETHER AN CHAR CAME BEFORE OR NOT.
     * 
     * 
     * 
     * 
     * 
     */

     public static void removedup(String str , int indx , StringBuilder newstring , boolean arr[]){
        // base case
        if(indx == str.length()){
            System.out.println(newstring);
            return;
            /*
             * 
             * Heeee .,,, putting retunn statement even in an void datatype is very important so that we can stop the iterator for the particular position and stop it from string outof bound exception  
             * 
             * check if you want it to check once .
             * 
             * 
             * 
             */
        }

        // to - do work

        char currentchar = str.charAt(indx);

        if(arr[currentchar -'a'] == true){
            removedup(str, indx+1, newstring, arr);
            // if that particular index is true then just move on to next index and dont append the item 

        }

        else{
            arr[currentchar - 'a'] = true;
            removedup(str, indx+1, newstring.append(currentchar), arr);

        }

     }

     public static void main(String[] args) {
        String str = "naveeeeeeeeeeen";
        removedup(str, 0, new StringBuilder("") ,new  boolean [26]);
     }
}
