package Stacks;

import java.util.Stack;

public class INTV__Duplicateparfenthesis {
    /*
     * 
     * Asked in many companies
     * 
     */
    public static boolean isduplicate(String str){
        // O(N)
        Stack<Character> s= new Stack<>();
        for(int i = 0 ; i < str.length();i++ ){
            char ch = str.charAt(i);
            int count =0;
            // closing condition
            if(ch==')'){
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if(count < 1){
                    return true; //duplicate is there
                }
                else{
                    s.pop() ; //in while loop we have found the opening pair , so now pop it
                }
            }

            else{
                s.push(ch);
            }
        }

        return false;
    }
     public static void main(String[] args) {
        String str = "((a+b) +((b+c) ))"; //duplicate is there in b+c
        System.out.println(  isduplicate(str));
     }
}
