package Stacks;

import java.util.Stack;
/*
 * 
 * Bro you can also use this technique for palindrome finding
 * 
 * 
 */

public class INTV__ValidPranthesis {
    public static boolean isvalid(String str){
        // O(N)
        Stack<Character> s = new Stack<>();
        for(int i = 0 ; i <str.length() ; i++){
            char ch  = str.charAt(i);
            if(ch=='(' || ch =='{' || ch == '[' ){
                s.push(ch);
            } 
            else{
                if(s.isEmpty()){
                    return false; // because there is no opening bracket
                }
                if((s.peek()=='{' && ch =='}') || (s.peek() =='(' && ch ==')' ) || (s.peek() == '[' && ch == ']')){
                    s.pop();
                }
                else{
                    return false;
                }

            }
        }

        if(s.isEmpty()){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        String str = "{([{(((((())))}])}";
        System.out.println(isvalid(str));
    }
}
